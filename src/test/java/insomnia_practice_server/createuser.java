	// package insomnia_practice_server;
	
	// import java.util.HashMap;
	// import java.util.Map;
	
	// import org.testng.annotations.Test;
	
	// import io.restassured.RestAssured;
	// import io.restassured.http.ContentType;
	// import io.restassured.response.Response;
	
	
	// public class createuser {
	
	//     @Test
	//     public void createUserTest() {
	
	//         Map<String, Object> payload = new HashMap<String, Object>();
	
	//         payload.put("name", "zahir");
	//         payload.put("body", "learning rest assured");
	//         payload.put("userId", 7);
	        
	//         Response response = RestAssured
	//                 .given()
	//                 .contentType(ContentType.JSON)
	//                 .body(payload)
	//                 .when()
	//                 .post("http://localhost:3000/trainees");
	//        System.out.println(response.getStatusCode());
	//        response.then().statusCode(201);
	//        System.out.println("Response Headers:" + response.getHeaders());
	//        System.out.println("-----------------\n");
	//        System.out.println("\nallow response headers: "+response.getHeader("allow"));
	//        System.out.println("\ncontent-type:"+response.getHeader("content-type"));
	//        System.out.println("\nAccess control allow methods:"+response.getHeader("Access-Control-Allow-Methods"));
	//        System.out.println("\nResponse Body:" + response.getBody().asString());
	//        response.prettyPrint();
	        
	//     }
	// }
