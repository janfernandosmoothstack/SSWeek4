package com.ss.wk4.MyHibJpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ss.wk4.MyHibJpa.entity.Book;

@Repository
public interface BookDao extends JpaRepository<Book, Long> {

}
