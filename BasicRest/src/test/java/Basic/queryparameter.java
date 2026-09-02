package Basic;

import static io.restassured.RestAssured.*;

public class queryparameter {
	
	public static void main(String[] args) {
		
		given()
		//.queryParam("teamSize", 0)
		//.when().get("http://49.249.28.218:8091/project)
		.when().get("http://49.249.28.218:8091/project?teamSize=0")
		.then().assertThat().statusCode(200)
		.log().all();
	}

}
