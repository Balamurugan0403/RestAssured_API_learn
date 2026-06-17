package insomnia_practice_server;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Deletemethod {
	@Test
	public void delete() {
	Response res1 = RestAssured.given().when().get("http://localhost:3000/trainees/g_slvJxLYII");
	System.out.println("status code: " + res1.getStatusCode());
	res1.prettyPrint();
    Response res = RestAssured.given().when().delete("http://localhost:3000/trainees/g_slvJxLYII");
    res.then().statusCode(200);
    System.out.println();
    res.prettyPrint();
}
}
