package com.book.Service;

import java.util.List;

import com.book.Pojos.Book;

public interface BookService {

	List<Book> getAllBooks();
	
	Book addBook(Book newBook);

}
