package com.bookapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloController {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "hello all champs";
	}
	
	//@PathParam								v1   v2
	//http://localhost:8080/bookappv1/api/hello/raj/delhi
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{name}/{city}")
	public String demo1(@PathParam("name")String name, @PathParam("city")String city) {
		return "values are "+ name +": "+ city;
	}
	
	//@QueryParam		:Pagination
	//http://localhost:8080/bookappv1/api/hello/demo2?name=raja&city=noida
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/demo2")
	public String demo2(@QueryParam("name")String name, @QueryParam("city")String city) {
		return "values are "+ name +": "+ city;
	}
	
	
}
