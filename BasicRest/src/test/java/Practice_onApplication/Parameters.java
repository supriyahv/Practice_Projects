package Practice_onApplication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Parameters {
	
	@Test
	public void path_parameter() {
		
		//https://www.shoppersstack.com/shopping/shoppers/56?page=2---inside url data is harcoded
		
		given().pathParam("shopperId", "56")
		.queryParam("page", 5)
		.when().post("https://www.shoppersstack.com/shopping/shoppers/{shopperId}")
		.then().log().all();
		
		
	}
	
	@Test 
	public void cookies_data() {
		
		Response resp=given().get("https://www.shoppersstack.com/shopping");
		String data=resp.getCookie("contentType");
		System.out.println(data);
	}
	
	@Test 
	public void header_data() {
		
		Response resp=given().get("https://www.shoppersstack.com/shopping");
		resp.then().assertThat()
		.header("contentType", "application/json")
		.and()
		.header("headerline", "HTTP");
		
	}
	
	@Test 
	public void resp_header() {
		
		Response resp=given().get("https://www.shoppersstack.com/shopping");
		resp.then().log().headers();
		
		
	}

}
