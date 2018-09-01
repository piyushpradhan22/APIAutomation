package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;


public class GetData {

	@Test
	public void testResponceCode() {
		Response resp = get(
	    "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		int code = resp.statusCode();
		System.out.println("Status code is : - " + code);
		Assert.assertEquals(code, 200);
	}

}
