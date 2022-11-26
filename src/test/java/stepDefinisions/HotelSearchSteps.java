package stepDefinisions;

import java.io.IOException;



import base.RequestHandler;
import base.ResponseContext;
import io.cucumber.java.en.Given;
import io.restassured.http.Method;
import org.junit.Assert;
import payloadGenerator.HotelSearchRequest;
import pojo.HoteSearchResponse;

public class HotelSearchSteps {
	@Given("^User provide (.*),(.*),(.*),(.*),(.*) and (.*) with Api type as (.*) and module as (.*)$")
	public void User_provide(boolean nearme, String city, String checkin, String checkout, int adultsCount,
			String placeId, String apiType, String module) throws IOException {
		Assert.assertNotNull(RequestHandler.restRequest(Method.POST,
				HotelSearchRequest.generateHotelSearchPayLoad(nearme, city, checkin, checkout, adultsCount, placeId),
				apiType, module));

	}

	@Given("^User verify status code as (.*)$")
	public void status_code_verify(int statusCode) throws IOException {
		Assert.assertEquals(statusCode, ResponseContext.getWorldVariables().getResponse().statusCode());
		Assert.assertNotNull(ResponseContext.getWorldVariables().getResponse().as(HoteSearchResponse.class).getsId());
	}
}
