package insomnia_practice_server;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class connect {
	@Test
	public void connectTrainee() {

		Response response = RestAssured.given().when().request("CONNECT", "http://localhost:3000/trainees/22");

		System.out.println("Status Code: " + response.getStatusCode());

		System.out.println(response.asString());
	}
}
