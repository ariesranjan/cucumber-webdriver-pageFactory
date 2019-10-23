package stepDefinitions;

import com.helloFresh.pages.CreateAnAccountPage;

import helper.TestContext;
import io.cucumber.java.en.When;

public class CreateAnAccountPageSteps {
	
	/** The test context. */
	TestContext testContext;
	
	/** The create an account page. */
	CreateAnAccountPage createAnAccountPage;
	
	/**
	 * Instantiates a new creates the an account page steps.
	 *
	 * @param context the context
	 */
	public CreateAnAccountPageSteps(TestContext context){
		testContext = context;
		createAnAccountPage = testContext.getPageObjectManager().getCreateAccountPage();
	}
	
	/**
	 * User fills all detais in create account form.
	 */
	@When("^User fills all the details in Create An Account form$")
	public void user_fills_all_detais_in_create_Account_form(){
		createAnAccountPage.enterDetailsForCreateAnAccount();
	}
	
	/**
	 * User clicks register button.
	 */
	@When("^User clicks on Register button$")
	public void user_clicks_Register_Button(){
		createAnAccountPage.clickRegisterButton();
	}
	

}
