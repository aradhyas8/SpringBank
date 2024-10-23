package net.ethan.banking.service;

import net.ethan.banking.dto.AccountDto;
import net.ethan.banking.entity.Account;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);


    AccountDto deposit(Long id, double amount);
}
