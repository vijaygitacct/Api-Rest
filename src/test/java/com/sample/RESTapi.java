package com.sample;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RESTapi {
	Response response;
	@Test
	public void test1() {

		given().
		contentType("").
		accept("").
		header("", "").
		auth().
		basic("", "").
		when().
		request().
		get("").
		then().
		statusCode(200).
		assertThat();
	}

	@Test
	public void test2() {

		given().
		accept("").
		contentType("").
		queryParam("", "").
		when().request().
		post("").
		then().
		statusCode(200).
		assertThat();
		
	}
	
	@Test
	public void test3() {
 response= (Response) given().log().all().header("","").body("").request("", "").then().statusCode(200).assertThat();
		
		
	}
}
