package insomnia_practice_server;

import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Putmethod {
	@Test
	public void updateTrainee() {

		Map<String, Object> payload = new HashMap<>();
		payload.put("name", "Zayn");
		payload.put("email","zayn@gmail.com");
		payload.put("company", "ABC");
		payload.put("id",15);
		//id is the primary key ,it take this as refrence to update  
		Response response = RestAssured.given().contentType(ContentType.JSON).body(payload).when()
				.put("http://localhost:3000/trainees/22");

		response.prettyPrint();

		response.then().statusCode(200);
	}

}
