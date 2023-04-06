package org.sid.bankgrpcservice;

import org.sid.bankgrpcservice.entities.Account;
import org.sid.bankgrpcservice.entities.AccountTransaction;
import org.sid.bankgrpcservice.entities.Currency;
import org.sid.bankgrpcservice.enums.AccountStatus;
import org.sid.bankgrpcservice.enums.AccountType;
import org.sid.bankgrpcservice.enums.TransactionStatus;
import org.sid.bankgrpcservice.enums.TransactionType;
import org.sid.bankgrpcservice.repository.AccountRepository;
import org.sid.bankgrpcservice.repository.AccountTransactionRepository;
import org.sid.bankgrpcservice.repository.CurrencyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Random;


@SpringBootApplication
public class BankGrpcServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankGrpcServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CurrencyRepository currencyRepository,
                            AccountRepository accountRepository,
                            AccountTransactionRepository transactionRepository){
        return args -> {
            //currencyRepository.save(new Currency(null,"USD","$",1));
             currencyRepository.save( Currency.builder()
                     .name("USD")
                     .symbol("$")
                     .price(1)
                     .build()
             );
            currencyRepository.save( Currency.builder()
                    .name("MAD")
                    .symbol("DH")
                    .price(0.1)
                    .build()
            );
            currencyRepository.save( Currency.builder()
                    .name("EUR")
                    .symbol("£")
                    .price(0.9)
                    .build()
            );
            currencyRepository.findAll().forEach(c->{
                System.out.println(c.toString());
            });

            List<Currency>currencyList=currencyRepository.findAll();
            for (int i = 1; i < 10; i++) {
                Account account= Account.builder()
                        .id("CC"+1)
                        .currency(currencyList.get(new Random().nextInt(currencyList.size())))
                        .createdAt(System.currentTimeMillis())
                        .type(Math.random()>0.5? AccountType.Current_Account:AccountType.Saving_Account)
                        .status(AccountStatus.Created)
                        .balance(Math.random()*900000)
                        .build();
                accountRepository.save(account);
                System.out.println(accountRepository.findAll());
            }

            List<Account>accountList=accountRepository.findAll();
            accountList.forEach(account -> {
                for (int i = 0; i < 20; i++) {
                    AccountTransaction accountTransaction = AccountTransaction.builder()
                            .amount(Math.random()*85200)
                            .timestamp(System.currentTimeMillis())
                            .status(TransactionStatus.PENDING)
                            .type(Math.random()>0.5? TransactionType.CREDIT:TransactionType.DEBIT)
                            .account(account)
                            .build();
                    transactionRepository.save(accountTransaction);
                }
            });

        };
    }
}
