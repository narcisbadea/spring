package com.example.spring.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {


    //List<User> findByFirstName(String firstName)
}
