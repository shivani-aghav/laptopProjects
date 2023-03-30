package com.audit.springdatajpaauditing.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;

//to set createdBy and lastModifiedBy we have below class
public class AuditorAwareImplimentation implements AuditorAware<String>{
	@Autowired
	private HeaderDto dto;
	@Override
	public Optional<String> getCurrentAuditor() {
		return Optional.of(dto.getName());
	}
	
	
}
