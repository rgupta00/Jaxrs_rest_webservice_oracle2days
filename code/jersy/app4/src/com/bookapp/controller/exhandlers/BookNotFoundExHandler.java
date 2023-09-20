package com.bookapp.controller.exhandlers;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.bookapp.exception.BookNotFoundException;

//i want to write an ex handler to handle BookNotFoundException

@Provider
public class BookNotFoundExHandler implements ExceptionMapper<BookNotFoundException>{

	@Override
	public Response toResponse(BookNotFoundException ex) {
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setMessage(ex.getMessage());
		errorMessage.setStatusCode(404);
		errorMessage.setToContect("ravi@oraclefin.com");
		
		return Response.status(Status.NOT_FOUND).entity(errorMessage).build();
	}

}
