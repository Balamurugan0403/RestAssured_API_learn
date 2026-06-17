package insomnia_practice_server;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Patchmethod {

	@Test
	public void patchPost() {
		Response res = RestAssured.given().when().get("http://localhost:3000/trainees/22");

		System.out.println("Before Update:");
		res.prettyPrint();
		Map<String, Object> payload = new HashMap<>();
		payload.put("company", "xyz");

		Response res1 = RestAssured.given().contentType(ContentType.JSON).body(payload).when()
				.patch("http://localhost:3000/trainees/22");

		System.out.println("\nAfter Update:");
		res1.prettyPrint();
		res1.then().statusCode(200);
//		Assert.assertEquals(res1.getStatusCode(), 200);

		String updatedcom = res1.jsonPath().getString("company");
		Assert.assertEquals(updatedcom, "xyz");
	}
}