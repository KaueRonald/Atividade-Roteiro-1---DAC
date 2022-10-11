package com.kaueDAC.UserDept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaueDAC.UserDept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
