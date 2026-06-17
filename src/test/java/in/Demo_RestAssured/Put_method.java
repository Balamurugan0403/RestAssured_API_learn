package in.Demo_RestAssured;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Put_method {
	@Test
	public void put_method() {
		Map<String, Object> payload = new HashMap<>();

		payload.put("title", "Update title");
		payload.put("body", "Update body");
		payload.put("userId", 53);

		Response response = RestAssured.given().contentType(ContentType.JSON).body(payload).when()
				.put("https://jsonplaceholder.typicode.com/posts/1");

		System.out.println(response.getStatusCode());

		response.prettyPrint();
	}

}
