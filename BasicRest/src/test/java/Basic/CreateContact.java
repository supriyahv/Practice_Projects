package Basic;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject json = new JSONObject();
		json.put("createdBy","priya");
		json.put("status", "ongoing");
		json.put("teamSize", 0);
		json.put("projectName", "comcastcrm3");
		
		
		given().contentType(ContentType.JSON).body(json.toJSONString())
		.when().post("http://49.249.28.218:8091/addProject").then()
		.assertThat().statusCode(201)
		.log().all();

	}

}
