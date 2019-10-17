package com.ss.wk4.MyHibJpa.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ss.wk4.MyHibJpa.dao.PublisherDao;
import com.ss.wk4.MyHibJpa.entity.Publisher;

@RestController
@RequestMapping("/lmswk4/publishers")
public class PublisherController {
	
	@Autowired
	PublisherDao pubDao;
	
	@PostMapping("")
	public Publisher createPub(@Valid @RequestBody Publisher pub) {
		return pubDao.save(pub);
	}
	
	@PutMapping("")
	public Publisher updatePub(@Valid @RequestBody Publisher pub) {
		return pubDao.save(pub);
	}
	
	@DeleteMapping("")
	public void deletePub(@Valid @RequestBody Publisher pub) {
		pubDao.delete(pub);
	}
	
	@GetMapping("")
	public List<Publisher> getPublishers(){
		return pubDao.findAll();
	}
}
