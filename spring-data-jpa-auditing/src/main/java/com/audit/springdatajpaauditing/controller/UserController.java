package com.audit.springdatajpaauditing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.audit.springdatajpaauditing.entity.User;
import com.audit.springdatajpaauditing.repository.UserRepository;
import com.audit.springdatajpaauditing.service.AuditorAwareImplimentation;
import com.audit.springdatajpaauditing.service.HeaderDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {

	@Autowired
	private UserRepository repository;
	@Autowired
	private HeaderDto dto;
	
	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(@RequestHeader String header,	@RequestBody User user) {
		dto.setName(header);
		return ResponseEntity.ok(repository.save(user));
	}
}
