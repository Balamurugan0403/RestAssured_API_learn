package insomnia_practice_server;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Headermethod {
	@Test
	public void getHeaders() {
		Response response = RestAssured.given().when().get("http://localhost:3000/trainees");
		System.out.println("Status Code: " + response.getStatusCode());
		System.out.println("All Headers:");
		System.out.println(response.getHeaders());
		System.out.println("\nContent-Type: " + response.getHeader("Content-Type"));
		System.out.println("Date: " + response.getHeader("Date"));
		System.out.println("Connection: " + response.getHeader("Connection"));
		System.out.println("Content-Length: " + response.getHeader("Content-Length"));
	}

}
