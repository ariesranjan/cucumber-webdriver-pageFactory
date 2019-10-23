package stepDefinitions;

import org.junit.Assert;

import com.helloFresh.pages.Homepage;
import com.helloFresh.pages.OrderConfirmationPage;

import dataProvider.TestDataFileReader;
import helper.TestContext;
import io.cucumber.java.en.Then;

public class OrderConfirmationPageSteps {
	
	/** The test context. */
	TestContext testContext;
	
	/** The order confirmation page. */
	OrderConfirmationPage orderConfirmationPage;
	
	/** The home page. */
	Homepage homePage;
	
	/** The test data. */
	TestDataFileReader testData = new TestDataFileReader();
	
	/**
	 * Instantiates a new order confirmation page steps.
	 *
	 * @param context the context
	 */
	public OrderConfirmationPageSteps(TestContext context){
		testContext = context;
		orderConfirmationPage = testContext.getPageObjectManager().getOrderConfirmationPage();
		homePage = testContext.getPageObjectManager().getHomePage();
	}
	
	/**
	 * User able see order confirmation heading.
	 */
	@Then("^User is able to see Order Confirmation heading$")
	public void user_able_see_order_confirmation_heading(){
		Assert.assertEquals(orderConfirmationPage.get_order_confirmation_heading(), testData.getData("OrderConfirmationHeading"));
	}
	
	/**
	 * User on last last page.
	 */
	@Then("^User is on last page of order placement$")
	public void user_on_last_last_page(){
		Assert.assertTrue(orderConfirmationPage.fourth_step_Shipping_displayed());
		Assert.assertTrue(orderConfirmationPage.last_payment_step_displayed());
	}
	
	/**
	 * User see order confirmaton message.
	 */
	@Then("^User is able to see order confirmation message$")
	public void user_see_order_confirmaton_message(){
		Assert.assertEquals(orderConfirmationPage.get_order_confirmation_message(), testData.getData("OrderCompletionMessage"));
	}
	
	/**
	 * User see order confirmaton url.
	 */
	@Then("^User is able to see current url contains order confirmation url$")
	public void user_see_order_confirmaton_url(){
		Assert.assertTrue(homePage.getCurrentPageUrl().contains(testData.getData("OrderPagePartialUrl")));
	}


}
