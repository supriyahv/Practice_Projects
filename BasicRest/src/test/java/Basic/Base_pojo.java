package Basic;

import static io.restassured.RestAssured.given;

import org.apache.http.impl.execchain.MainClientExec;

import io.restassured.http.ContentType;

public class Base_pojo {
	
	public static void main(String[] args) {
		
		pojo p = new pojo("apoorva","patil",0,"completed");
		given().contentType(ContentType.JSON).body(p)
		.when().post("http://49.249.28.218:8091/addProject").then()
		.assertThat().statusCode(201)
		.log().all();
	}

}
