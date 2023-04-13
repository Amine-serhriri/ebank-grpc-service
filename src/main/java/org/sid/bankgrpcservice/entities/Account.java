package org.sid.bankgrpcservice.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.bankgrpcservice.enums.AccountStatus;
import org.sid.bankgrpcservice.enums.AccountType;

import javax.persistence.*;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Account {
    @Id
    private String id;
    private double balance;
    private long createdAt;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    @ManyToOne
    private Currency currency;
    @OneToMany(mappedBy = "account",fetch = FetchType.EAGER)
    private List<AccountTransaction> transactionList;
}
