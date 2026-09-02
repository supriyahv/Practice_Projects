package Practice;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class createContact {
	
	public static void main(String[] args) {
		
		JSONObject json = new JSONObject();
		json.put("createdBy","priya");
		json.put("status", "ongoing");
		json.put("teamSize", 0);
		json.put("projectName", "comcastcrm4.5");
		json.put("collectionArray", "collArr");//{"collectionArrat":["java","python"]}
		String collArr[]= {"java","python"};
		
		
		Response resp = given().contentType(ContentType.JSON).body(json.toJSONString())
		.when().post("http://49.249.28.218:8091/addProject");
		resp.then().log().all();
		resp.then().assertThat().statusCode(201);
		int data = resp.jsonPath().get("projectId");
		System.out.println(data);
		
		given()
		.pathParam("projectId", data)
		.when()
		.get("http://49.249.28.218:8091/project/{projectId}")
		.then().log().all();
		
	}

}
