package in.Demo_RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUserTest {

    @Test
    public void getUserTest() {

        Response response = RestAssured
                .given()
                .when()
                .get("https://jsonplaceholder.typicode.com/users/1");

        System.out.println("Status code: " + response.getStatusCode());

//        response.prettyPrint();
        System.out.println(response.asPrettyString());
        System.out.println("");
        System.out.println(response.asString());

        Assert.assertEquals(response.getStatusCode(), 200);

        String name = response.jsonPath().getString("name");

        //System.out.println("User Name: " + name);
    }
}