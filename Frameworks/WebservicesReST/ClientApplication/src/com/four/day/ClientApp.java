package com.four.day;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientApp {
	public static void main(String[] args) {
		
	 String url="http://localhost:6060/Provider-QueryParam/rest/msg/show";
	 // 1.Create Empty Client Object
	 Client c=Client.create();
	 //2.Add url to the client
	 WebResource wr=c.resource(url);
	 
	 wr=wr.queryParam("id", "101");	
		wr=wr.queryParam("name", "Raja");	
		wr=wr.queryParam("sal", "50.000");	
	 
	 
	 
	 
		
		ClientResponse cr=wr.get(ClientResponse.class);
		
		String str=cr.getEntity(String.class);
		System.out.println(str);
	
		System.out.println("Status : "+cr.getStatus());
		System.out.println("Status Info : "+cr.getStatusInfo());
	
}
}
