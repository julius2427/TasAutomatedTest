package mav.qatesting;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestTesting {
	public static void basicpingtest() {
		RestAssured.baseURI = "http://restcountries.eu/";
		RequestSpecification httpRequest = RestAssured.given();
		
		Response response = httpRequest.request(Method.GET, "/rest/v1");
		
		String responseBody = response.getBody().asString();
		JsonParser parser = new JsonParser();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonElement el = parser.parse(responseBody);
		responseBody = gson.toJson(el);
		System.out.println("Response Body is => " + responseBody);
		
		
		
	}
}
