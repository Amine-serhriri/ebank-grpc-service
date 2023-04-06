package org.sid.bankgrpcservice.repository;

import org.sid.bankgrpcservice.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,String> {
}
