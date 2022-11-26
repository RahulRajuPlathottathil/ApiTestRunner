package base;


import io.cucumber.java.BeforeStep;

public class Hooks {
	@BeforeStep
	
	public void FrameworkInitializerBeforeScenario() {
		RequestHandler.requestInitializer();
		EndPoints.endPointInitializer();
	}

}
