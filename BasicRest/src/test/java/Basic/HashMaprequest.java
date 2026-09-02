package Basic;

import java.util.HashMap;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class HashMaprequest {
	
	public static void main(String[] args) {
		
		HashMap<String,Object> map = new HashMap();
		map.put("createdBy", "arpitha");
		map.put("teamSize", 0);
		map.put("projectName", "vtiger");
		map.put("status", "ongoing");
		
		given().contentType(ContentType.JSON).body(map)
		.when().post("http://49.249.28.218:8091/addProject").then()
		.assertThat().statusCode(201)
		.log().all();
	}

}
