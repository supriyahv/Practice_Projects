package Basic;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;


public class Launch {
	
	public static void main(String[] args) {
		
		JSONObject json = new JSONObject();
		json.put("createdBy", "apoorvas");
		json.put("projectName", "crm1");
	    json.put("status", "created");
		json.put("teamSize", 0);
		
		given().contentType(ContentType.JSON).body(json.toJSONString())
		.when().post("http://49.249.28.218:8091/addProject").then()
		.assertThat().statusCode(201).log().all();
	}

}
