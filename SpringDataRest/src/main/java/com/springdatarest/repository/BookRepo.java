package com.springdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdatarest.entities.Book;

//for more goto spring data rest on google
public interface BookRepo extends JpaRepository<Book, Integer> {

}
