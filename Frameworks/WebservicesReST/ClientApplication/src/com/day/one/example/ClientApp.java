package com.day.one.example;



import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientApp {

	public static void main(String[] args) {
     
		String url="http://localhost:5050/ProviderApplication/rest/msg/show";
		
	Client c=Client.create();
	WebResource wr=c.resource(url);
	ClientResponse cr=wr.get(ClientResponse.class);
	int status=cr.getStatus();
	
	
	
	if(status==200){
		System.out.println("Http Status No     : "+ cr.getStatus());
		System.out.println("Http Stutus Info  : "+ cr.getStatusInfo());
		System.out.println("Message is             :  "+ cr.getEntity(String.class));
	}
	else if(status==204){
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
	}else
	{
		System.out.println("Http Status No     : "+ cr.getStatus());
		System.out.println("Http Stutus Info  : "+ cr.getStatusInfo());
		System.out.println("Some Problem Occyreed.");
	}
		}

}

