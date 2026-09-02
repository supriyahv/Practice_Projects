package Practice_onApplication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

public class Request_chaining {
	
	@Test
	public void creatShopper() {
		
		JSONObject obj = new JSONObject();
		
		obj.put("email", "supriyahv9@gmail.com");
		
		obj.put("password", "Priya@25");
		
		obj.put("role", "SHOPPER");
		
		
		given().contentType(ContentType.JSON).body(obj.toJSONString())
		.when().post("https://www.shoppersstack.com/shopping/users/login")
		.then().log().all();
		
	}

}
