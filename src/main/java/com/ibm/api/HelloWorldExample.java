package com.ibm.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloWorldExample {
 
	/**
	 * Maps to REST API http://localhost:8080/jax_rs/rest/hello/sanket
	 * @param msg "sanket"
	 * @return "Jax-rs REST API : sanket"
	 * @see http://www.mkyong.com/webservices/jax-rs/jersey-hello-world-example/
	 */
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jax-rs REST API : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
 
}