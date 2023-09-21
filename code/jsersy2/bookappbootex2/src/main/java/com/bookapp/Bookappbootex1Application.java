package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.dao.Book;
import com.bookapp.service.BookService;

@SpringBootApplication
public class Bookappbootex1Application implements CommandLineRunner{

	@Autowired
	private BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(Bookappbootex1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookService.addBook(new Book("AZ11", "spring in action", "foo", 1200));
		bookService.addBook(new Book("MZ11", "jpa in action", "bar", 1100));
	}

}
