package com.bookapp.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.bookapp.controller.BookController;

//this class is used to integrate spring boot with jersy
@Component
public class RestConfig extends ResourceConfig{

	public RestConfig() {
		packages("com.bookapp");
	}
	
	public RestConfig(Class<?>...classes) {
		register(BookController.class);
	}
}
