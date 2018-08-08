package com.captha.gen;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/msg")
public class Message {
	
@GET

public String showMsg(@QueryParam("ctype")String ct){
	String cap=null;
	if ("NUM".equalsIgnoreCase(ct)) {
		cap=CaptchaGen.getName();
	} else {

	}
	return cap;
}


}
