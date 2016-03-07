package com.ibm.api;

import java.io.Serializable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.core.header.MediaTypes;
import com.sun.jersey.core.impl.provider.header.MediaTypeProvider;

 
@Path("/hello")
public class HelloWorldExample {
 
	/**
	 * Maps to REST API http://localhost:8080/jax_rs/rest/hello/sanket
	 * @param msg "sanket"
	 * @return JSON object with "Jax-rs REST API : sanket"
	 * @see http://www.mkyong.com/webservices/jax-rs/jersey-hello-world-example/
	 */
	@GET
	@Path("/{param}")	
	@Produces(MediaType.APPLICATION_JSON)
	public Person getMsg(@PathParam("param") String msg) {
		String output = "Jax-rs REST API : " + msg;
		Person p = new Person();
		p.name = "Jax-rs REST API";
		p.lastname = output; 
		//return Response.status(200).entity(output).build();
		return p;
	}
	
	class Person implements Serializable {
		String name;
		String lastname;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		
		
	}
 
}