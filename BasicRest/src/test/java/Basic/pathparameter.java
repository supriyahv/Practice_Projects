package Basic;

import static io.restassured.RestAssured.*;

public class pathparameter {
	
	public static void main(String[] args) {
		
		
			
			given().pathParam("projectId", "NH_PROJ_2717")
			
			.when().get("http://49.249.28.218:8091/project/{projectId}").then().assertThat().statusCode(200)
			.log().all();
		}
	}


