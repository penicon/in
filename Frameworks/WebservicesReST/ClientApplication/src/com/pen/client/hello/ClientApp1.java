package com.pen.client.hello;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientApp1 {

	public static void main(String[] args) {
     
		String url="http://localhost:6060/WS-Parameter/rest/msg/show";
		
	Client c=Client.create();
	WebResource wr=c.resource(url);
	
	
	// Code For Important
	wr=wr.queryParam("id", "101");	
	wr=wr.queryParam("name", "Raja");	
	wr=wr.queryParam("sal", "50.000");	
	//-----------------------------------------
	
	
	
	ClientResponse cr=wr.get(ClientResponse.class);
	
	String str=cr.getEntity(String.class);
	System.out.println(str);
	int s=cr.getStatus();
	System.out.println("Status : "+s);
	
	
	
	int status=cr.getStatus();
	if(status==200){
		System.out.println("Http Status No     : "+ cr.getStatus());
		System.out.println("Http Stutus Info  : "+ cr.getStatusInfo());
	}	else if(status==204){
		System.out.println("Http Status No     : "+ cr.getStatus());
		System.out.println("Http Stutus Info  : "+ cr.getStatusInfo());
		System.out.println("Message is :  Excecuted Successfully ,No Content");			
	}	else if(status==405){
		System.out.println("Http Status No     : "+ cr.getStatus());
		System.out.println("Http Stutus Info  : "+ cr.getStatusInfo());
		System.out.println("Message is Invalid Request Method  :  ");
	}else 	if(status==404){
		System.out.println("Http Status No     : "+ cr.getStatus());
		System.out.println("Http Stutus Info  : "+ cr.getStatusInfo());
		System.out.println("Message is : URL Not Existed.  ");
	}else	{
		System.out.println("Http Status No     : "+ cr.getStatus());
		System.out.println("Http Stutus Info  : "+ cr.getStatusInfo());
		System.out.println("Some Problem Occyreed.");
	}
		}

}
