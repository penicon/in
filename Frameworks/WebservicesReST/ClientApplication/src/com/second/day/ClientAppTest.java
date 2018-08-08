package com.second.day;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientAppTest {

	public static void main(String[] args) {
	 String url="http://localhost:6060/ProviderApplication/rest/msg/show";
	 // 1.Create Empty Client Object
	 Client c=Client.create();
	 //2.Add url to the client
	 WebResource r=c.resource(url);
	 // 3.Make the get call and store response	 
	 ClientResponse cr=r.get(ClientResponse.class);
	 //4. Read Entity from ClientResponse
	 String s=cr.getEntity(String.class);
	 //5.Print Entity
	 System.out.println(s);
	 
	 
	 
	}

}
