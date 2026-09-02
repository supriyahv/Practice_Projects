package Basic;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;

import io.restassured.response.Response;

public class body_validation {
	
	public static void main(String[] args) {
		
		Response resp = given().get("http://49.249.28.218:8091/projects-paginated");
		resp.then().log().all();
		
		int data = resp.jsonPath().get("numberOfElements");
		resp.then().assertThat().body("numberOfElements",Matchers.greaterThanOrEqualTo(20));
	
		String id = resp.jsonPath().get("content[0].projectId");
		resp.then().assertThat().body("content[0].projectId",Matchers.equalTo("NH_PROJ_2901"));
	
	}

}
