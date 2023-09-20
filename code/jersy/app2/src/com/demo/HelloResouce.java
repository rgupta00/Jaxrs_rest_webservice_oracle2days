package com.demo;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResouce {
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String hello() {
//		return "hello";
//	}
	
	//use json
	//path Param
	
//	@GET
//	@Path("/{uname}")
//	@Produces(MediaType.TEXT_PLAIN)
//	public String hello2(@PathParam("uname")String name) {
//		return "hello 2"+" name: "+name ;
//	}
	
	//http://localhost:8090/app2/api/hello?uname=raj&city=noida
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello2(@QueryParam("uname")String name, @QueryParam("city")String city) {
		return "hello 2"+" name: "+name +" "+ city;
	}
}





