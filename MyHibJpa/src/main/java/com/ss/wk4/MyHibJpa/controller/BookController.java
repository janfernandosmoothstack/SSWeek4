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

import com.ss.wk4.MyHibJpa.dao.BookDao;
import com.ss.wk4.MyHibJpa.entity.Book;

@RestController
@RequestMapping("lmswk4/books")
public class BookController {

	@Autowired
	BookDao bookDao;
	
	@PostMapping("")
	public Book createBook(@Valid @RequestBody Book book) {
		return bookDao.save(book);
	}
	
	@PutMapping("")
	public Book updateBook(@Valid @RequestBody Book book) {
		return bookDao.save(book);
	}
	
	@DeleteMapping("")
	public void deleteBook(@Valid @RequestBody Book book) {
		bookDao.delete(book);
	}
	
	@GetMapping("")
	public List<Book> getAllBooks(){
		return bookDao.findAll();
	}
}
