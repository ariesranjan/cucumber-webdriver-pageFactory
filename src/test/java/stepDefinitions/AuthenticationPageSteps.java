package stepDefinitions;

import com.helloFresh.pages.AuthenticationPage;

import helper.TestContext;
import io.cucumber.java.en.When;


public class AuthenticationPageSteps {
	
	/** The test context. */
	TestContext testContext;
	
	/** The authentication page. */
	AuthenticationPage authenticationPage;
	
	/**
	 * Instantiates a new authentication page steps.
	 *
	 * @param context the context
	 */
	public AuthenticationPageSteps(TestContext context){
		testContext = context;
		authenticationPage = testContext.getPageObjectManager().getAuthenticationPage();
	}
	
	/**
	 * User enters email address in email field.
	 */
	@When("^User enters email address in email field$")
	public void user_enters_email_address_in_email_field(){
		authenticationPage.enter_Email();
	}
	
	/**
	 * User clicks on create an account button.
	 */
	@When("^User clicks on Create an Account button$")
	public void user_clicks_on_Create_an_Account_button(){
		authenticationPage.click_On_CreateAccountButton();
	}
	
	/**
	 * User enters username.
	 *
	 * @param username the username
	 */
	@When("^User enters username '(.*)' in username field")
	public void user_enters_username(String username){
		authenticationPage.enter_username(username);
	}
	
	/**
	 * User enters password.
	 *
	 * @param password the password
	 */
	@When("^User enters password '(.*)' in password field")
	public void user_enters_password(String password){
		authenticationPage.enter_Password(password);
	}
	
	/**
	 * User clicks submit button.
	 */
	@When("^User clicks on submit button")
	public void user_clicks_submit_button(){
		authenticationPage.click_Submit();
	}

}
