package com.ss.wk4.MyHibJpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ss.wk4.MyHibJpa.entity.Publisher;

@Repository
public interface PublisherDao extends JpaRepository<Publisher, Long> {

}
