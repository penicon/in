package com.param.query;


import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/msg")
public class Message {
	@Path("/show")
	@GET	
	public String show(@QueryParam("id") int id ,@QueryParam("name") String name,@QueryParam("sal") double sal){
		return " ID " +id +" name "+name+ " Sal "+sal;
	}
	
}
