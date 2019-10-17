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

import com.ss.wk4.MyHibJpa.dao.AuthorDao;
import com.ss.wk4.MyHibJpa.entity.Author;

@RestController
@RequestMapping("/lmswk4/authors")
public class AuthorController {
	
	@Autowired
	AuthorDao authDao;
	
	@PostMapping("")
	public Author createAuth(@Valid @RequestBody Author author) {
		return authDao.save(author);
	}
	
	@PutMapping("")
	public Author updateAuth(@Valid @RequestBody Author author) {
		return authDao.save(author);
	}
	
	@DeleteMapping("")
	public void deleteAuth(@Valid @RequestBody Author author) {
		authDao.delete(author);
	}
	
	@GetMapping("")
	public List<Author> getAllAuthors(){
		return authDao.findAll();
	}
}
