package org.sid.bankgrpcservice.repository;

import org.sid.bankgrpcservice.entities.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency,String> {
    Currency findByName(String name);
}
