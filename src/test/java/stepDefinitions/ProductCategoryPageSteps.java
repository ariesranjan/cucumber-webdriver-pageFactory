package stepDefinitions;

import com.helloFresh.pages.ProductCategoryPage;

import helper.TestContext;
import io.cucumber.java.en.When;

public class ProductCategoryPageSteps {
	
	/** The test context. */
	TestContext testContext;
	
	/** The product category page. */
	ProductCategoryPage productCategoryPage;
	
	/**
	 * Instantiates a new product category page steps.
	 *
	 * @param context the context
	 */
	public ProductCategoryPageSteps(TestContext context){
		testContext = context;
		productCategoryPage = testContext.getPageObjectManager().getProductCategoryPage();
		
	}
	
	/**
	 * User clicks women category.
	 */
	@When("^User clicks on Women category$")
	public void user_clicks_women_category(){
		productCategoryPage.click_Women_Category();
	}
	
	/**
	 * User clicks on dress.
	 *
	 * @param dress the dress
	 */
	@When("^User clicks on '(.*)' dress$")
	public void user_clicks_on_dress(String dress){
		productCategoryPage.click_On_Dress(dress);
	}
	
	/**
	 * User clicks add to cart.
	 */
	@When("^User clicks on add to cart button$")
	public void user_clicks_add_to_cart(){
		productCategoryPage.click_On_Addto_cart();;
	}
	
	/**
	 * User clicks proceed to checkout.
	 */
	@When("^User clicks on Proceed to checkout button$")
	public void user_clicks_proceed_to_checkout(){
		productCategoryPage.click_On_Proceed_Checkout();
	}

}
