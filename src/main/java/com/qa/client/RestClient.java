package com.qa.client;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
	
	public void get(String url) throws ClientProtocolException, IOException {
//create a client
	CloseableHttpClient HttpClient = HttpClients.createDefault();
	//takes to url
	HttpGet httpget=new HttpGet(url);
	
	//hits the url
	CloseableHttpResponse response = HttpClient.execute(httpget);
	int response1=response.getStatusLine().getStatusCode();
	System.out.println(response1);
	String response2 = EntityUtils.toString(response.getEntity(), "UTF-8");
	JSONObject Detail=new JSONObject(response2);
	System.out.println("Detailed JSON String is ---->"+Detail);
	Header[] header=response.getAllHeaders();
	HashMap<String, String> hash1=new HashMap<String, String>();
	for(Header h1 : header) {
		
		hash1.put(h1.getName(), h1.getValue());
	}
	
	System.out.println("Headers name is ---->"+hash1);
	
}
}