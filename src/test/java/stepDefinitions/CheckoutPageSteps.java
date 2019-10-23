package stepDefinitions;

import com.helloFresh.pages.CheckoutPage;

import helper.TestContext;
import io.cucumber.java.en.When;


public class CheckoutPageSteps {
	
	/** The test context. */
	TestContext testContext;
	
	/** The checkout page. */
	CheckoutPage checkoutPage;
	
	/**
	 * Instantiates a new checkout page steps.
	 *
	 * @param context the context
	 */
	public CheckoutPageSteps(TestContext context){
		testContext = context;
		checkoutPage = testContext.getPageObjectManager().getCheckoutPage();
	}
	
	/**
	 * User click proceed checkout summary.
	 */
	@When("^User click on Proceed to checkout button on Summary page$")
	public void user_click_proceed_checkout_summary(){
		checkoutPage.click_proceed_to_checkout_summaryNav();
	}
	
	/**
	 * User click proceed checkout address.
	 */
	@When("^User click on Proceed to checkout button on Address page$")
	public void user_click_proceed_checkout_address(){
		checkoutPage.click_proceed_to_checkout_addressNav();
	}
	
	/**
	 * User checks terms condition checkbox.
	 */
	@When("^User checks terms and condition check box$")
	public void user_checks_terms_condition_checkbox(){
		checkoutPage.click_checkbox_terms_conditions();
	}
	
	/**
	 * User clicks proceed checkout shipping.
	 */
	@When("^User clicks on Proceed to checkout button on Shipping page$")
	public void user_clicks_proceed_checkout_shipping(){
		checkoutPage.click_proceed_to_checkout_shippingNav();
	}
	
	/**
	 * User clicks pay by bank wire.
	 */
	@When("^User clicks on Pay by Bank Wire option$")
	public void user_clicks_pay_by_bank_wire(){
		checkoutPage.click_Pay_bank_Wire_button();
	}
	
	/**
	 * User clicks confirm order button.
	 */
	@When("^User clicks on Confirm order button$")
	public void user_clicks_confirm_order_button(){
		checkoutPage.click_confirm_order_button();
	}

}
