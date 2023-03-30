package com.te.springbootscheduler.service;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import com.te.springbootscheduler.dao.UserDao;
import com.te.springbootscheduler.entity.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserServiceImplimentation implements UserService {

	@Autowired
	private UserDao dao;

	//schedule job to add object in DB for every 15 sec
	@Override
	@Scheduled(fixedRate = 15000)
	public void addToDbJob() {
		User user = new User();
		user.setName("user" + new Random().nextInt(374483));
		dao.save(user);
		System.out.println("add service call in " + new Date().toString());
	}

	@Override
	@Scheduled(cron = "0/15 * * * * *")
	public void fetchDbJob() {
		List<User> users = dao.findAll();
		System.out.println("fetch service call in " + new Date().toString());
		System.out.println("no of record fetched : " + users.size());
		log.info("users : {}", users);
	}

}
