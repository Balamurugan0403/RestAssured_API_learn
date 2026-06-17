package insomnia_practice_server;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Deletemethod {

	@Test
	public void delete() {

		try {

			Response res1 = RestAssured.given().when().get("http://localhost:3000/trainees/g_slvJxLYII");

			System.out.println("GET Status Code: " + res1.getStatusCode());

			if (res1.getStatusCode() == 404) {

				System.out.println("Record not found. Already deleted.");

				return;
			}

			res1.prettyPrint();

			Response res = RestAssured.given().when().delete("http://localhost:3000/trainees/g_slvJxLYII");

			System.out.println("DELETE Status Code: " + res.getStatusCode());

			res.then().statusCode(200);

			System.out.println("Record deleted successfully.");

		} catch (Exception e) {

			System.out.println("Exception occurred: " + e.getMessage());

			e.printStackTrace();
		}
	}
}
