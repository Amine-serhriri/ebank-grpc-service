package org.sid.bankgrpcservice.repository;

import org.sid.bankgrpcservice.entities.AccountTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountTransactionRepository extends JpaRepository<AccountTransaction,String> {
    List<AccountTransaction>findByAccount_ID(String id);//return la liste de transaction de ce compte

}
