package com.ibm.api;

import java.io.Serializable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

 
@Path("/hello")
@Api(value="/hello")
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
	@ApiOperation(value = "say hello world", notes ="nothing else")
	@ApiResponses(value={
			@ApiResponse(code=200, message="OK"),
			@ApiResponse(code=500, message="Something went wrong"),
	})
	public Person getMsg(@PathParam("param") String msg) {
		String output = "Jax-rs REST API : " + msg;
		Person p = new Person();
		p.name = "Jax-rs REST API";
		p.lastname = output; 
		//return Response.status(200).entity(output).build();
		return p;
	}
	
	@GET
	@Path("/")	
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "say hello world, sanket", notes ="nothing else than sanket")
	@ApiResponses(value={
			@ApiResponse(code=200, message="OK"),
			@ApiResponse(code=500, message="Something went wrong"),
	})
	public Response getMsg() {
		
		return Response.status(200).entity("Hellow world").build();
		
	}
	
	class Person implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 3955074699838807226L;
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