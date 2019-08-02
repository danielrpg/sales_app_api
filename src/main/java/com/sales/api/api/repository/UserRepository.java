package com.sales.api.api.repository;

import com.sales.api.api.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository  extends CrudRepository<User, Integer> {

    @Query("select u from User u where u.username=:username")
    Optional<User> findByUsername(@Param("username") String username);

    @Query("select u from User u where u.email=:email")
    Optional<User> findByEmail(@Param("email") String email);

}
