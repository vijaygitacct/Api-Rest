package com.sample;


import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class ExampleApi {
	
	String obje;
	private void M1() {

		
		Sample s=  new Sample(); 
	RestAssured.given().
	header("accept","appl/json").body(obje).
	request(Method.GET, "www.abc.com");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
