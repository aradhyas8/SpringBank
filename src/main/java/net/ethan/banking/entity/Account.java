package net.ethan.banking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name="accounts")
@Entity
public class Account {
    private Long id;
    private String accountHolderName;
    private double balance;
}
