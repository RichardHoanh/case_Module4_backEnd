package com.casemodul4_backend.repository;

import com.casemodul4_backend.model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends PagingAndSortingRepository<Account,Integer> {
    Account findAccountByUsername(String username);
}
