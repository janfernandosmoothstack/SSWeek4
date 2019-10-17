package com.ss.wk4.MyHibJpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "publisher")
public class Publisher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer publisher_id;
	
	@Column(name = "publisher_name")
	private String publisher_name;
	
	@Column(name = "publisher_address")
	private String publisher_address;

	public Integer getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(Integer publisher_id) {
		this.publisher_id = publisher_id;
	}

	public String getPublisher_name() {
		return publisher_name;
	}

	public void setPublisher_name(String publisher_name) {
		this.publisher_name = publisher_name;
	}

	public String getPublisher_address() {
		return publisher_address;
	}

	public void setPublisher_address(String publisher_address) {
		this.publisher_address = publisher_address;
	}
}
