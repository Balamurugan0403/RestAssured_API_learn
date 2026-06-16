package in.Demo_RestAssured;

import org.testng.Assert;

import io.restassured.RestAssured;

public class ApiValidationTest {
	public void validateUserData() {
		String email=RestAssured
				.given()
				.when()
				.get("https://jsonplaceholder.typicode.com/users/1")
				.jsonPath()
				.getString("email");
		System.out.println("User Email: " + email);
		Assert.assertEquals(email,"Sincere@april.biz");
	}
}
