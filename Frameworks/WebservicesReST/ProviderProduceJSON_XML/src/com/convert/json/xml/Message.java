package com.convert.json.xml;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/msg")
public class Message {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Employee showMsg(){
		
		Employee emp=new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Raja");
		emp.setEmpSal(20.00);
		return emp;
	}
}
