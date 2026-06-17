package insomnia_practice_server;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class Deletemethod {

@Test
public void createAndDelete() {

	Map<String, Object> payload = new HashMap<>();

	payload.put("name", "Temp User");
	payload.put("email", "temp@test.com");
	payload.put("company", "Test");

	Response createResponse = RestAssured.given().contentType(ContentType.JSON).body(payload).when()
			.post("http://localhost:3000/trainees");
	String id = createResponse.jsonPath().getString("id");
	System.out.println("Created ID: " + id);
	Response deleteResponse = RestAssured.given().when().delete("http://localhost:3000/trainees/" + id);
	deleteResponse.then().statusCode(200);

	System.out.println("Deleted ID: " + id);
}
}
