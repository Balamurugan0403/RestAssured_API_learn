package in.Demo_RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class HeaderMethod {

	@Test
	public void headPost() {

		Response res = RestAssured.given().when().head("https://jsonplaceholder.typicode.com/posts/1");

		System.out.println(res.getHeaders());
		for(Header h: res.getHeaders()) {
			System.out.println(h.getName() + " : " + h.getValue());
		}
		System.out.println("-------------------");
		
		//since head method does not return body, it will return empty string.
		System.out.println("empty string :"+res.getBody().asString());

	}
}