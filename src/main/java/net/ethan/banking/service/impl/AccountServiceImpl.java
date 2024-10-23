package net.ethan.banking.service.impl;

import net.ethan.banking.dto.AccountDto;
import net.ethan.banking.repository.AccountRepository;
import net.ethan.banking.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {


    private AccountRepository accountRepository;


    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        return null;
    }
}
