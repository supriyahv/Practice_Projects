package Basic;

import static io.restassured.RestAssured.*;

public class deleteContact {
	
	public static void main(String[] args) {
		
		given().delete("http://49.249.28.218:8091/project/NH_PROJ_2706")
		.then().statusCode(204).log().all();
	}

}
