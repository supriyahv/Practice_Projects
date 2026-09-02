package Basic;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class updateContact {
	
	public static void main(String[] args) {
		
		JSONObject json = new JSONObject();
		json.put("createdBy","priya");
		json.put("status", "completed");
		json.put("teamSize", 0);
		json.put("projectName", "comcastcrm");
		
		given().contentType(ContentType.JSON).body(json.toJSONString())
		.when().put("http://49.249.28.218:8091/project/NH_PROJ_2706").then()
		.statusCode(200).log().all();
	}

}
