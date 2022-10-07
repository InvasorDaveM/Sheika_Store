package com.project.sheikah_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.sheikah_store.model.Account;

public interface IAccountRepository extends JpaRepository<Account, Integer> {

}
