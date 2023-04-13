package org.sid.bankgrpcservice.mappers;

import org.sid.bankgrpcservice.entities.Account;
import org.sid.bankgrpcservice.entities.AccountTransaction;
import org.sid.bankgrpcservice.enums.AccountStatus;
import org.sid.bankgrpcservice.enums.AccountType;
import org.sid.bankgrpcservice.grpc.stub.Bank;
import org.springframework.stereotype.Service;

@Service
public class BankAccountMapperImp {

    public Bank.BankAccount fromBankAccount(Account account){
        Bank.BankAccount bankAccount= Bank.BankAccount.newBuilder()
                .setAccountId(account.getId())
                .setBalance(account.getBalance())
                .setCreatedAt(account.getCreatedAt())
                .setType(Bank.AccountType.valueOf(account.getType().toString()))
                .setState(Bank.AccountState.valueOf(account.getStatus().toString()))
                .build();
        return bankAccount;
    }
    public Account fromGrpcAccount(Bank.BankAccount bankAccount){
        Account account =new Account();
        account.setBalance(bankAccount.getBalance());
        account.setCreatedAt(bankAccount.getCreatedAt());
        account.setType(AccountType.valueOf(bankAccount.getType().toString()));
        account.setStatus(AccountStatus.valueOf(bankAccount.getState().toString()));
        return account;
    }
    public Bank.Transaction fromAccountTransaction(AccountTransaction accountTransaction){
        Bank.Transaction transaction= Bank.Transaction.newBuilder()
                .setId(accountTransaction.getId())
                .setTimestamp(accountTransaction.getTimestamp())
                .setAccountId(accountTransaction.getAccount().getId())
                .setStatus(Bank.TransactionStatus.valueOf(accountTransaction.getStatus().toString()))
                .setType(Bank.TransactionType.valueOf(accountTransaction.getType().toString()))
                .setAmount(accountTransaction.getAmount())
                .build();
        return transaction;
    }
}
