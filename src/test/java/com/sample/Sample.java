package com.sample;

import org.testng.annotations.Test;

import com.pojo.AddUserAddress_Input_pojo;
import com.pojo.AddUserAddress_Output_Pojo;
import com.pojo.Login_Output_Json;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;
 

public class Sample {
	//String token;
	//Response response;

	@Test(priority = 1)
	public void basicAuth() {
		/*response = RestAssured.given().
				header("Content-Type", "application/json").
				auth().
				basic("vigneshvtht@gmail.com", "Vignesh@1796").
				post("https://www.omrbranch.com/api/postmanBasicAuthLogin");
		
		System.out.println(response.getStatusCode());
		Login_Output_Json as = response.as(Login_Output_Json.class);
		String first_name = as.getData().getFirst_name();
		System.out.println(as.getMessage());

		System.out.println(first_name);

		token = as.getData().getLogtoken();*/
		
		given()
		.header("Content-Type","application/json")
		.auth()
		.basic("vigneshvtht@gmail.com", "Vignesh@1796").when()
		.post("https://www.omrbranch.com/api/postmanBasicAuthLogin")
		.then()
		.statusCode(200)
		.assertThat().extract().as(Login_Output_Json.class).getData().getFirst_name();
		

	}

	@Test(priority = 2)
	public void addAddress() {

		/*AddUserAddress_Input_pojo aip = new AddUserAddress_Input_pojo();
		aip.setFirst_name("vijayKumar");
		aip.setLast_name("vijay");
		aip.setMobile("135158458");
		aip.setApartment("River View");
		aip.setState(33);
		aip.setCity(45);
		aip.setCountry(101);
		aip.setZipcode("621118");
		aip.setAddress("OMR");
		aip.setAddress_type("Office");

		response = RestAssured.given().
				header("accept", "application/json").
				header("Authorization", "Bearer " + token).
				header("Content-Type", "application/json").
				body(aip).
				post("https://www.omrbranch.com/api/addUserAddress");

		System.out.println(response.getStatusCode());

		AddUserAddress_Output_Pojo as = response.as(AddUserAddress_Output_Pojo.class);
		System.out.println(as.getMessage());
*/
	}

}
