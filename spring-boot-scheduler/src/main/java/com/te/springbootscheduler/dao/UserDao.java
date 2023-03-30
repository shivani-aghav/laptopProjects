package com.te.springbootscheduler.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.springbootscheduler.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
