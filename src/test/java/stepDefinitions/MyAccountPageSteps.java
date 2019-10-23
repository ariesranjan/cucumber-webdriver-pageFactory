package stepDefinitions;

import org.junit.Assert;

import com.helloFresh.pages.CreateAnAccountPage;
import com.helloFresh.pages.Homepage;
import com.helloFresh.pages.MyAccountPage;

import dataProvider.TestDataFileReader;
import helper.TestContext;
import io.cucumber.java.en.Then;

// TODO: Auto-generated Javadoc

public class MyAccountPageSteps {
	
	/** The test context. */
	TestContext testContext;
	
	/** The my account page. */
	MyAccountPage myAccountPage;
	
	/** The home page. */
	Homepage homePage;
	
	/** The create account page. */
	CreateAnAccountPage createAccountPage;
	
	/** The test data. */
	TestDataFileReader testData = new TestDataFileReader();
	
	/**
	 * Instantiates a new my account page steps.
	 *
	 * @param context the context
	 */
	public MyAccountPageSteps(TestContext context){
		testContext = context;
		myAccountPage = testContext.getPageObjectManager().getMyAccountPage();
		homePage = testContext.getPageObjectManager().getHomePage();
		createAccountPage = testContext.getPageObjectManager().getCreateAccountPage();
	}
	
	
	/**
	 * User able to see my account text.
	 */
	@Then("^User is able to see my account text$")
	public void user_able_to_see_my_account_text(){
		Assert.assertEquals(myAccountPage.get_account_text(), testData.getData("MyAccountText"));
	}
	
	/**
	 * User able to see account name as full name.
	 */
	@Then("^User is able to see account name as user full name for new user$")
	public void user_able_to_see_account_name_as_fullName(){
		
		Assert.assertEquals(myAccountPage.get_account_name(), createAccountPage.getFullUserName());
	}
	
	/**
	 * User able to see welcome message.
	 */
	@Then("^User is able to see Welcome message$")
	public void user_able_to_see_welcome_message(){
		Assert.assertTrue(myAccountPage.get_welcome_message().contains(testData.getData("WelcomeMessage")));
	}
	
	/**
	 * User able to see sign out link.
	 */
	@Then("^User is able to see Sign Out link$")
	public void user_able_to_see_Sign_out_link(){
		Assert.assertTrue(myAccountPage.sign_out_link_displayed());
	}
	
	/**
	 * User able to see current url.
	 */
	@Then("^User is able to see current url contains my account url$")
	public void user_able_to_see_current_url(){
		Assert.assertTrue(homePage.getCurrentPageUrl().contains(testData.getData("PartialUrl")));
	}
	
	/**
	 * User able to see account name.
	 *
	 * @param fullName the full name
	 */
	@Then("^User is able to see account name as '(.*)'$")
	public void user_able_to_see_account_name(String fullName){
		
		Assert.assertEquals(myAccountPage.get_account_name(), fullName);
	}

}
