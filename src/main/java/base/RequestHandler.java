
package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public abstract class RequestHandler {
	private static RequestSpecification request;
	private static Response response;
	private static Properties p;

	public static void requestInitializer() {
		RestAssured.baseURI = propertyReader().getProperty("baseUri");
		request = RestAssured.given();
	}

	public static Response restRequest(Method method, Object obj, String apiType, String module) {
		writepayLoadToConsole(obj);
		request.headers(getHeaders());
		switch (method) {
		case POST:
			System.out.println(EndPoints.getEndpoint());
			response = request.body(obj).post(EndPoints.getEndpoint().get(module).get(apiType));
			break;
		case PUT:
			response = request.body(obj).put(EndPoints.getEndpoint().get(module).get(apiType));
			break;
		default:
			break;
		}
		ResponseContext.getWorldVariables().setResponse(response);
		response.prettyPrint();
		return response;

	}

	public static Response restRequest(Method method, String apiType, String module) {
		requestInitializer();
		request.headers(getHeaders());
		switch (method) {
		case GET:
			response = request.get(EndPoints.getEndpoint().get(module).get(apiType));
			break;
		case PATCH:
			response = request.patch(EndPoints.getEndpoint().get(module).get(apiType));
			break;
		default:
			break;
		}
		ResponseContext.getWorldVariables().setResponse(response);
		response.prettyPrint();
		return response;

	}

	private static Properties propertyReader() {
		if (p == null)
			p = new Properties();
		try {
			p.load(new FileInputStream(
					System.getProperty("user.dir") + "//src//main//resources//configurations.properties"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		return p;
	}

	private static void writepayLoadToConsole(Object obj) {
		try {

			ObjectMapper req = new ObjectMapper();
			System.out.println(req.writerWithDefaultPrettyPrinter().writeValueAsString(obj));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public static Map<String, Object> getHeaders() {
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("content-Type", propertyReader().getProperty("content-type"));
		headers.put("token", propertyReader().getProperty("token"));
		return headers;

	}

}
