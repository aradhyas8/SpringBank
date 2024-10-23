package net.ethan.banking.service.impl;

import net.ethan.banking.dto.AccountDto;
import net.ethan.banking.entity.Account;
import net.ethan.banking.mapper.AccountMapper;
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
        Account account = AccountMapper.mapToAccount(accountDto);
        Account saveAccount = accountRepository.save(account);
        return AccountMapper.mapToAcountDto(saveAccount);
    }
}
