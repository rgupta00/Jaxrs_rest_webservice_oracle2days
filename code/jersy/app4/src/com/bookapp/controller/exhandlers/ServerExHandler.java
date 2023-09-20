package com.bookapp.controller.exhandlers;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.bookapp.exception.BookNotFoundException;

//i want to write an ex handler to handle BookNotFoundException

@Provider
public class ServerExHandler implements ExceptionMapper<Exception>{

	@Override
	public Response toResponse(Exception ex) {
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setMessage("server is down, pls try after some time");
		errorMessage.setStatusCode(500);
		errorMessage.setToContect("ravi@oraclefin.com");
		
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();
	}

}
