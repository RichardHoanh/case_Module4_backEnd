package com.casemodul4_backend.service;

import com.casemodul4_backend.model.Account;
import com.casemodul4_backend.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements InterfaceGeneral<Account>{
    @Autowired
    UserRepo userRepo;


    @Override
    public List<Account> findAll() {
        return (List<Account>) userRepo.findAll();
    }

    @Override
    public Optional<Account> findById(int id) {
        return userRepo.findById(id);
    }

    @Override
    public void save(Account account) {
        userRepo.save(account);

    }

    @Override
    public void delete(int id) {
        userRepo.deleteById(id);

    }
}
