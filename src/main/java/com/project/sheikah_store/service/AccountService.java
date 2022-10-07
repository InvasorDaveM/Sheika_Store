package com.project.sheikah_store.service;

import org.springframework.stereotype.Service;

import com.project.sheikah_store.model.Account;
import com.project.sheikah_store.repository.IAccountRepository;

@Service
public class AccountService implements IAccountService {

    private IAccountRepository iAccountRepository;

    public AccountService(IAccountRepository iAccountRepository) {
        this.iAccountRepository = iAccountRepository;
    }

    @Override
    public Account insertAccount(Account account) {
        return iAccountRepository.save(account);
    }

}
