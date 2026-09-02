package Basic;

import static io.restassured.RestAssured.*;

public class formparameter {
	
	public static void main(String[] args) {
		
		given()
		.formParam("teamSize", 0)
		.log().all()
		.when().post("http://49.249.28.218:8091/project")
		.then()
		.log().all();
	}

}
