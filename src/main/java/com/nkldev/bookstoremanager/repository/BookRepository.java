package com.nkldev.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
