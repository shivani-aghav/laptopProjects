package com.audit.springdatajpaauditing.entity;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
//it indicates that Auditable class is a super class and not a jpa entity and no table created
@MappedSuperclass
//to capture auditing info when saving or updating the record
@EntityListeners(AuditingEntityListener.class)
public class Auditable {

	@CreatedBy
	private String createdBy;
	
	//this annotation will take automatic system timing
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdDate;
	
	@LastModifiedBy
	private String lastModifiedBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date lastModifiedDate;
}
