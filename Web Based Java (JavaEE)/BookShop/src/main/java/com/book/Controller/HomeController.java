package com.book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.Pojos.Book;
import com.book.Service.BookService;

@RestController
@RequestMapping("/books")
public class HomeController {

	@Autowired
	private BookService bServ;

	public HomeController() {
		// TODO Auto-generated constructor stub
		System.out.println("In constr of " + getClass());
	}

	@GetMapping
	public List<Book> listBook() {
		System.out.println("In Get Book Controller");
		return bServ.getAllBooks();
	}

	@PostMapping
	public Book addNewBook(@RequestBody Book newBk) {
		return bServ.addBook(newBk);
	}

}
