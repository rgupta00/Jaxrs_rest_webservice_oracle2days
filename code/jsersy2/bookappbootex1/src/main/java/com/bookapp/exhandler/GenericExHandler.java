package com.bookapp.exhandler;

import java.time.LocalDateTime;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.bookapp.exceptions.BookNotFoundException;

@Provider
public class GenericExHandler implements ExceptionMapper<Exception>{

	@Override
	public Response toResponse(Exception exception) {
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setMessage("pls try after some time");
		errorMessage.setStatusCode(500);
		errorMessage.setToContact("raj@oracle.com");
		errorMessage.setTimeStamp(LocalDateTime.now());
		
		return Response.status(500).entity(errorMessage).build();
	}

}
