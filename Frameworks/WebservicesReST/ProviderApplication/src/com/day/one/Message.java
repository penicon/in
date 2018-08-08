package com.day.one;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/msg")
public class Message {
	@GET
	@Path("/show")
 public String showMessage(){
	 
	 return  "Provider :  I am Responed Man,Be Coooll";
 }
	
	
	
	
}
