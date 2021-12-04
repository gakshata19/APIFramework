package TestLayer;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo {

	@Test
	public void validateGetMethod() {
		RestAssured.baseURI="https://reqres.in/api/users?page=2/9";
		RequestSpecification httpRequest= RestAssured.given();
		Response resp=httpRequest.request(Method.GET);
		int statusCode=resp.getStatusCode();
		System.out.println(statusCode);
		
		String statusLine=resp.getStatusLine();
		System.out.println(statusLine);
		
		String actualResponseBody=resp.getBody().asString();
		System.out.println(actualResponseBody);
		
		String header=resp.header("Content-Type");
		System.out.println(header);
	}
}
