package Practice;

import static io.restassured.RestAssured.*;

public class getContact {
	
	public static void main(String[] args) {
		
		given()
		.pathParam("projectID", data)
		.get("http://49.249.28.218:8091/project/{projectId}")
		.then().log().all();
	}

}
