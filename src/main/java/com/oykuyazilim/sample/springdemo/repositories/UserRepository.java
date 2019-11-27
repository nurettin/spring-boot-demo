package com.oykuyazilim.sample.springdemo.repositories;

import com.oykuyazilim.sample.springdemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(long id);
}
