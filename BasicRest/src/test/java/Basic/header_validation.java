package Basic;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class header_validation {
	
	public static void main(String[] args) {
		
		Response resp = given().get("http://49.249.28.218:8091/project/NH_PROJ_2891");
		
		resp.then().log().all();
		resp.then().assertThat().statusCode(200);
		resp.then().assertThat().statusLine("HTTP/1.1 200");
		resp.then().assertThat().header("X-Frame-Options", "DENY");
		resp.then().assertThat().contentType(ContentType.JSON);
	}

}
