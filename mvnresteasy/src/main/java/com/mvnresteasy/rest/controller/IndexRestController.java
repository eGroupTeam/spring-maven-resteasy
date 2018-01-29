package com.mvnresteasy.rest.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;

@Path("/message")
@Controller
public class IndexRestController {
	@GET
	@Path("/print/{param}")
	public Response printMessage(@PathParam("param") String msg) {
		String result = "Restful message print : " + msg;
		return Response.status(999).entity(result).build();
	}
}
