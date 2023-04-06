package org.sid.bankgrpcservice.grpc.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.sid.bankgrpcservice.entities.Account;
import org.sid.bankgrpcservice.entities.Currency;
import org.sid.bankgrpcservice.mappers.BankAccountMapperImp;
import org.sid.bankgrpcservice.grpc.stub.Bank;
import org.sid.bankgrpcservice.grpc.stub.BankServiceGrpc;
import org.sid.bankgrpcservice.repository.AccountRepository;
import org.sid.bankgrpcservice.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class BankGrpcServiceImp extends BankServiceGrpc.BankServiceImplBase {
    @Autowired
    private CurrencyRepository currencyRepository;
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private BankAccountMapperImp bankAccountMapperImp;
    @Override
    public void getBankAccount(Bank.GetBankAccountRequest request, StreamObserver<Bank.GetBankAccountResponse> responseObserver) {
        String accountId=request.getAccountId();
        Account account = accountRepository.findById(accountId).orElse(null);
        if (account!=null){
            Bank.BankAccount bankAccount = bankAccountMapperImp.fromBankAccount(account);
            Bank.GetBankAccountResponse accountResponse= Bank.GetBankAccountResponse.newBuilder()
                    .setBankAccount(bankAccount)
                    .build();
            responseObserver.onNext(accountResponse);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getListAccount(Bank.GetListAccountRequest request, StreamObserver<Bank.GetListAccountResponse> responseObserver) {
        List<Account>accountList=accountRepository.findAll();
        List<Bank.BankAccount> grpcAccountList = accountList.stream().map(account -> bankAccountMapperImp.fromBankAccount(account)).collect(Collectors.toList());
        Bank.GetListAccountResponse listAccountResponse=Bank.GetListAccountResponse.newBuilder()
                .addAllAccount(grpcAccountList)
                .build();
        responseObserver.onNext(listAccountResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void convertCurrency(Bank.ConvertCurrencyRequest request, StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        String from=request.getCurrencyFrom();
        String to = request.getCurrencyTo();
        double amount = request.getAmount();
        Currency currencyFrom=currencyRepository.findByName(from);
        Currency currencyTo=currencyRepository.findByName(to);
        double result=amount*currencyFrom.getPrice()/currencyTo.getPrice();

        Bank.ConvertCurrencyResponse response= Bank.ConvertCurrencyResponse.newBuilder()
                .setCurrencyFrom(from)
                .setCurrencyTo(to)
                .setAmount(amount)
                .setConversionResult(result)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
