package com.riigsoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riigsoft.model.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
