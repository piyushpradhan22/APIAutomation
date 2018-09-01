package getRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRest {
	@Test
	public void test1() {
		RequestSpecification reqs = RestAssured.given();
		reqs.header("Content-Type","application/json");
		JSONObject jso=new JSONObject();
		jso.put("id", "004");
		jso.put("title", "Selenium Test");
		jso.put("authour", "Piyush");
		reqs.body(jso.toString());
		Response resss = reqs.post("http://localhost:3000/posts");
		System.out.println("The responce code is:"+ resss.getStatusCode());
	}

}
