package com.casemodul4_backend.repository;

import com.casemodul4_backend.model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends PagingAndSortingRepository<Account,Integer> {
}
