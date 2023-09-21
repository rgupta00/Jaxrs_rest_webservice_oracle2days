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

import com.bookapp.dao.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

@Path("/bookapi")
public class BookController {

	private BookService bookService=new BookServiceImpl();
	
	//=============get all books====================
	@GET
	@Path("/books")
//	@Produces("application/json")
	@Produces({"application/xml", "application/json"})
	public List<Book> getAll(){
		return bookService.getAll();
	}
	
	//=============get an book by id====================
	@GET
	@Path("/books/{id}")
	@Produces("application/json")
	public Book getById(@PathParam("id")  int id){
		return bookService.getBookById(id);
	}
	
	//=============add new Book====================
//	@POST
//	@Path("/books")
//	@Produces("application/json")
//	@Consumes("application/json")
//	public Book addNewBook( Book book){
//		return bookService.addBook(book);
//	}
	
	@POST
	@Path("/books")
	@Produces("application/json")
	@Consumes("application/json")
	public Response addNewBook( Book book){
		Book bookAdded= bookService.addBook(book);
		return Response.status(Status.CREATED).entity(bookAdded).build();
	}
	
	
	
	//============update book by id================
	@PUT
	@Path("/books/{id}")
	@Produces("application/json")
	@Consumes("application/json")
	public Book updateById(@PathParam("id")  int id, Book book){
		return bookService.updateBook(id, book);
	}
	
	
	//===========delete by id=======================
//	@DELETE
//	@Path("/books/{id}")
//	@Produces("application/json")
//	public Book deleteById(@PathParam("id")  int id){
//		return bookService.removeBook(id);
//	}
	
	
	@DELETE
	@Path("/books/{id}")
	@Produces("application/json")
	public Response deleteById(@PathParam("id")  int id){
		Book bookDeleted= bookService.removeBook(id);
		System.out.println("book is deleted ..");
		return Response.status(Status.NO_CONTENT).build();
	}
	
	
}















