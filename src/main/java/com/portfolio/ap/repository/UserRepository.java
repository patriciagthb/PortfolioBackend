package com.portfolio.ap.repository;

import com.portfolio.ap.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
    User findByUsername(String usermail);
    User findByUsernameAndPassword(String usermail, String Password);
}
