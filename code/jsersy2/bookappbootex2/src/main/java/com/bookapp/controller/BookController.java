package com.bookapp.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;

import com.bookapp.dao.Book;
import com.bookapp.service.BookService;

@Path("/bookapi")
public class BookController {

	@Autowired
	private BookService bookService;

	@GET
	@Path("/books")
	@Produces("application/json")
	public List<Book> getAll() {
		return bookService.getAll();
	}

	// ---------get an specific book by id---------
	@GET
	@Path("/books/{id}")
	@Produces("application/json")
	public Book getById(@PathParam("id") int id) {
		return bookService.getBookById(id);
	}

	// --------add an book---------

	@POST
	@Path("/books")
	@Consumes("application/json")
	@Produces("application/json")
	public Response addBook(Book book) {
		Book bookAdded = bookService.addBook(book);
		return Response.status(Status.CREATED).entity(bookAdded).build();
	}

	// --------update an book---------
	@PUT
	@Path("/books/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Book updateBook(@PathParam("id") int id, Book book) {
		return bookService.updateBook(id, book);
	}

	// --------------delete an book----------204

	@DELETE
	@Path("/books/{id}")
	@Produces("application/json")
	public Response deletById(@PathParam("id") int id) {
		 bookService.removeBook(id);
		 return Response.status(Status.NO_CONTENT).build();
		 
	}
}
