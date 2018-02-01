package org.gkh.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api")
public class SimpleResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/json")
	public String toString() {
		return "{\"id\":1,\"text\":\"stuff\"}";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/pojo")
	public Response toPojo() {
		SimplePojo pojo = new SimplePojo(1, "stuff");
		return Response.ok().entity(pojo).build();
	}
}
