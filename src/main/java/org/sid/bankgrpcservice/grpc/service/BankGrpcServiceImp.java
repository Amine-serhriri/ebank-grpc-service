package org.sid.bankgrpcservice.grpc.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.sid.bankgrpcservice.grpc.stub.Bank;
import org.sid.bankgrpcservice.grpc.stub.BankServiceGrpc;
@GrpcService
public class BankGrpcServiceImp extends BankServiceGrpc.BankServiceImplBase {
    @Override
    public void getBankAccount(Bank.GetBankAccountRequest request, StreamObserver<Bank.GetBankAccountResponse> responseObserver) {
        super.getBankAccount(request, responseObserver);
    }

    @Override
    public void getListAccount(Bank.GetListAccountRequest request, StreamObserver<Bank.GetListAccountResponse> responseObserver) {
        super.getListAccount(request, responseObserver);
    }

    @Override
    public void convertCurrency(Bank.ConvertCurrencyRequest request, StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        String from=request.getCurrencyFrom();
        String to = request.getCurrencyTo();
        double amount = request.getAmount();
        double result=amount*10.8;

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
