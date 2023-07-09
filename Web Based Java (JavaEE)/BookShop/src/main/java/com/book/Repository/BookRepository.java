package com.book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.Pojos.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
