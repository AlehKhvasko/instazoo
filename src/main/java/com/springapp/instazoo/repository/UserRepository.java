package com.springapp.instazoo.repository;

import com.springapp.instazoo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long > {

    Optional<User> findUserByName (String userName);

    Optional<User> findUserById (Long id);

    Optional<User> findUserByEmail (String email);
}
