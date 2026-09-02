package Practice_onApplication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class JsonSchema_validation {
	
	@Test
	public void JsonSchema() {
		
		Response resp=given().get("");
		resp.then().assertThat().body(JsonSchemavalidator.matchersJsonSchemaInclasspath("file path"));
		
		
	}

}
