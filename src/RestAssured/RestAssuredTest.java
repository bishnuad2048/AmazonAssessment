package RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class RestAssuredTest {
//	@Test
	public void getStatusCode() {
		given().get("http://dummy.restapiexample.com/api/v1/employees").
		then().statusCode(200);
		
	}
	@Test
	public void getOneEmployeeDetails() {
		given().get("http://dummy.restapiexample.com/api/v1/employee/2").
		then().
		log().all();
		
	}
	@Test
	public void delete() {
		given().delete("http://dummy.restapiexample.com/api/v1/delete/2").
		then().statusCode(204);
		
	}
}
