package getRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRest {
	@Test
	public void test1() {
		RequestSpecification reqs = RestAssured.given();
		Response resss = reqs.delete("http://localhost:3000/posts/004");
		System.out.println("The responce code is:"+ resss.getStatusCode());
	}

}
