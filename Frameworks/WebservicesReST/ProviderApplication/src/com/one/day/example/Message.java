package com.one.day.example;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;


@Path("/msg")
public class Message {
@GET
@Path("/show")

public  String showMsg(){
return "Provider : Hello Boss ,I am Responded....";
}

}
