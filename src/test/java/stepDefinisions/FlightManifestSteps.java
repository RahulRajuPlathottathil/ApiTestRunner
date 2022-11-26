package stepDefinisions;

import java.io.IOException;
import org.junit.Assert;
import base.RequestHandler;
import base.ResponseContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Method;
import pojo.FlightManifest;

public class FlightManifestSteps {
	@Given("^I want to trigger (.*) api from (.*) module$")
	public void I_want_to_trigger_apiType_from_module(String apiType, String module) throws IOException {
		Assert.assertNotNull(RequestHandler.restRequest(Method.GET, apiType, module));
	}

	@When("^I check for the status code (.*) in response$")
	public void I_check_for_the_status_code_in_response(int stausCode) throws IOException {
		Assert.assertEquals(ResponseContext.getWorldVariables().getResponse().getStatusCode(),stausCode);

	}

	@Then("^I verify the (.*),(.*) and (.*) in response$")
	public void I_verify_the_name_shortname_description_from_response(String name, String shortName, String description)
			throws IOException {
		Assert.assertEquals(ResponseContext.getWorldVariables().getResponse().as(FlightManifest.class).getName(),name);
		Assert.assertEquals(ResponseContext.getWorldVariables().getResponse().as(FlightManifest.class).getShortName(),shortName);
		Assert.assertEquals(ResponseContext.getWorldVariables().getResponse().as(FlightManifest.class).getDescription(),description);

	}
}
