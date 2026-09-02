package Basic;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class shopper {
	
	public static void main(String[] args) {
		
		JSONObject obj = new JSONObject();
		obj.put("email", "supriyahv9@gmail.com");
		obj.put("password", "priya@25");
		obj.put("role", "SHOPPER");
		
		Response resp = given().contentType(ContentType.JSON).body(obj.toJSONString())
		.when().post("https://www.shoppersstack.com/shopping/users/login");
		resp.then().log().all();
		
		=resp.jsonPath().get("");
	}

}
