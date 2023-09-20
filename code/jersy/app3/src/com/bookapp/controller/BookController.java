package com.bookapp.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.bookapp.dao.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;
@Path("/api")
public class BookController {

	private BookService bookService;
	
	public BookController() {
		bookService=new BookServiceImpl();
	}
	
	@GET
	@Path("/books")
	@Produces("application/json")
	public List<Book> getAll(){
		return bookService.getAll();
	}
}




