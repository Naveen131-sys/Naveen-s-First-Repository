package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.client.RestClient;

public class TestNG extends BaseClass {
	
	String url1;
	String url2;
	String url;
	RestClient rest;

	BaseClass base;
	@BeforeMethod
	public void Setup() throws IOException {
		base=new BaseClass();
		url1=prop.getProperty("URL");
		url2=prop.getProperty("serviceurl");
		url=url1 + url2;
		
	}
	
	@Test
	public void Test() throws ClientProtocolException, IOException {
		
		rest=new RestClient();
		rest.get(url);
		
	}
	
	

}
