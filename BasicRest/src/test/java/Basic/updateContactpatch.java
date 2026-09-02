package Basic;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class updateContactpatch {
	
	public static void main(String[] args) {
		
	
	
	JSONObject json = new JSONObject();
	json.put("createdBy","preethi");
	
	
	given().contentType(ContentType.JSON).body(json.toJSONString())
	.when().patch("http://49.249.28.218:8091/project/NH_PROJ_2717").then()
	.statusCode(200).log().all();
}


}
