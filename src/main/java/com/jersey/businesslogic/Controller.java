package com.jersey.businesslogic;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class Controller {
	@GET
	@Path("/getmessage/{param}")
	public Response getmessage(@PathParam("param")String args){
		String str="jersey says: Hello, "+args;
		return Response.status(200).entity(str).build();
	}
}
