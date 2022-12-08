package com.anudip.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.jpa.entity.Book;


public interface BookRepository extends JpaRepository<Book, Integer> {

}
