	package in.Demo_RestAssured;
	
	import java.util.HashMap;
	import java.util.Map;
	
	import org.testng.annotations.Test;
	
	import io.restassured.RestAssured;
	import io.restassured.http.ContentType;
	import io.restassured.response.Response;
	
	
	public class CreateUserTest {
	
	    @Test
	    public void createUserTest() {
	
	        Map<String, Object> payload = new HashMap<String, Object>();
	
	        payload.put("title", "First Creation");
	        payload.put("body", "learning rest assured");
	        payload.put("userId", 1);
	
	        Response response = RestAssured
	                .given()
	                .contentType(ContentType.JSON)
	                .body(payload)
	                .when()
	                .post("https://jsonplaceholder.typicode.com/videos");
	        //here videos end point does not exist so the status code will be 404 but
	        //if we use posts end point then the status code will be 201
	        
	        System.out.println(response.getStatusCode());
	        response.then().statusCode(200);
	        
	        Map<String,Object> pay=new HashMap<String,Object>();
	        
	        pay.put("title","dummy creation");
	        pay.put("body","");
	        pay.put("userId",20);
	        //400 status code will appear if we send empty body,or invalid format status code  in the request	
	        Response res=RestAssured.given().contentType(ContentType.JSON).body(pay).when().post("https://jsonplaceholder.typicode.com/posts");
	        System.out.println("status code:"+res.getStatusCode());
	        res.then().statusCode(403);
	        int id =response.jsonPath().getInt("id");
	        System.out.println("fkd id:"+id);
	        System.out.println();
	
	        System.out.println("Status code: " + response.getStatusCode());
	        Response getResponse = RestAssured
	                .given()
	                .when()
	                .get("https://jsonplaceholder.typicode.com/posts/99");
	        int id2=getResponse.jsonPath().getInt("id");
	        System.out.println("id2:"+id2);
	        getResponse.prettyPrint();
	        
	    }
	}