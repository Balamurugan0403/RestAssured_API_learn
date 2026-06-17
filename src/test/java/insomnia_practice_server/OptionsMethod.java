package insomnia_practice_server;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OptionsMethod {
	@Test
	public void optionsTest() {
		Response response = RestAssured.given().when().options("http://localhost:3000/trainees");

		System.out.println("Status Code: " + response.getStatusCode());

		System.out.println("Response Headers:");
		System.out.println(response.getHeaders());

		System.out.println("-----------------");

		System.out.println("Allow: " + response.getHeader("Allow"));

		System.out.println("Content-Type: " + response.getHeader("Content-Type"));

		System.out.println("Access-Control-Allow-Methods: " + response.getHeader("Access-Control-Allow-Methods"));

		System.out.println("Response Body:");
		System.out.println(response.getBody().asString());
		System.out.println("allow header:"+response.getHeader("Allow"));
		System.out.println("content-type header:"+response.getHeader("Content-Type"));
		
	}
}