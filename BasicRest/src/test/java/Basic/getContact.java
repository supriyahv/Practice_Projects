package Basic;

import static io.restassured.RestAssured.*;

public class getContact {
	
	public static void main(String[] args) {
		
		given().get("http://49.249.28.218:8091/project/NH_PROJ_2706").then().assertThat().statusCode(200)
		.log().all();
	}

}
