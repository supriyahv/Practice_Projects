package Basic;

import static io.restassured.RestAssured.*;


import org.hamcrest.Matchers;

import io.restassured.response.Response;

public class time_validation {
	
	public static void main(String[] args) {
		
		Response resp = given().get("");
		resp.then().log().all();
		
		resp.then().time(Matchers.lessThan(900L));
		resp.then().time(Matchers.greaterThan(2000L));
	}

}
