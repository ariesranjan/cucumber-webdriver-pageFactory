package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import helper.TestContext;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;


public class Hooks {
	
	/** The test context. */
	TestContext testContext;
	
	/**
	 * Instantiates a new hooks.
	 *
	 * @param context the context
	 */
	public Hooks(TestContext context){
		testContext = context;
	}
	
	/**
	 * After scenario.
	 *
	 * @param scenario the scenario
	 */
	@After(order=1)
	public void afterScenario(Scenario scenario){
		if(scenario.isFailed()){
			final byte[] screenshot = ((TakesScreenshot)testContext.getWebdriverManager().getDriverInstance()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
		}
	}

	/**
	 * After steps.
	 */
	@After(order=0)
	public void AfterSteps(){
		testContext.getWebdriverManager().closeDriver();
	}

}
