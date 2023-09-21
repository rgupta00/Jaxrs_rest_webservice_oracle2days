package com.bookapp.exhandler;

import java.time.LocalDateTime;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.bookapp.exceptions.BookNotFoundException;

@Provider
public class BookNotFoundExHandler implements ExceptionMapper<BookNotFoundException>{

	@Override
	public Response toResponse(BookNotFoundException exception) {
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setMessage(exception.getMessage());
		errorMessage.setStatusCode(404);
		errorMessage.setToContact("raj@oracle.com");
		errorMessage.setTimeStamp(LocalDateTime.now());
		
		return Response.status(404).entity(errorMessage).build();
	}

}
