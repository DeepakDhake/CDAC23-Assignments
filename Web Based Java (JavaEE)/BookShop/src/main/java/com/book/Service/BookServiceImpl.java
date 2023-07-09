package com.book.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.book.Pojos.Book;
import com.book.Repository.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bRepo;
	
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bRepo.findAll();
	}

	@Override
	public Book addBook(Book newBook) {
		// TODO Auto-generated method stub
		return bRepo.save(newBook);
	}

}
