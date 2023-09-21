package com.bookapp.exhandler;

import java.time.LocalDateTime;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.bookapp.exceptions.BookNotFoundException;

@Provider
public class BookNotFoundExMapper implements ExceptionMapper<BookNotFoundException>{

	@Override
	public Response toResponse(BookNotFoundException exception) {
		
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setMessage(exception.getMessage());
		errorMessage.setStatusCode(404);
		errorMessage.setToContact("ravi@oracle.com");
		errorMessage.setTimestamp(LocalDateTime.now());
		
		return Response.status(404).entity(errorMessage).build();
	}

}
