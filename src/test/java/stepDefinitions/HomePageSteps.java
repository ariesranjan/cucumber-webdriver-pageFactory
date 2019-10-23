package stepDefinitions;

import com.helloFresh.pages.Homepage;

import helper.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class HomePageSteps {
	
	/** The text context. */
	TestContext textContext;
	
	/** The homepage. */
	Homepage homepage;
	
	/**
	 * Instantiates a new home page steps.
	 *
	 * @param context the context
	 */
	public HomePageSteps(TestContext context){
		textContext = context;
		homepage = textContext.getPageObjectManager().getHomePage();
	}

	/**
	 * User is on home page.
	 */
	@Given("^User is on Home Page of the application$")
	public void user_is_on_Home_Page() {
		homepage.navigateTo_HomePage();
	}
	
	/**
	 * User clicks on sign in link.
	 */
	@When("^User clicks on Sign In link$")
	public void user_clicks_on_Sign_In_Link(){
		homepage.click_On_SignIn_Button();
	}

}
