package in.Demo_RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class OptionsMethod {
	@Test
	public void optionsMethod() {
		// TODO Auto-generated method stub
		Response res = RestAssured.given().when().options("https://jsonplaceholder.typicode.com/posts/1");
		// That header tells:
		// which HTTP methods are allowed for that endpoint.
		System.out.println(res.header("Allow"));
		System.out.println(res.getStatusCode());

	}

	@Test
	public void testOptionsMethod() {

		Response res = RestAssured.given().when().options("https://jsonplaceholder.typicode.com/posts/1");

		System.out.println("Status Code: " + res.getStatusCode());
		System.out.println("Allow Header: " + res.getHeader("Allow"));
		
		for (Header h : res.getHeaders()) {
		    System.out.println(h.getName() + " : " + h.getValue());
		}
		
//		res.getHeaders().forEach(h -> System.out.println(h.getName() + " : " + h.getValue()));
		//h is a lambda parameter that represents one header at a time. means one name and one value of the header.
	}
}
