package managers;

import org.openqa.selenium.WebDriver;

import com.helloFresh.pages.AuthenticationPage;
import com.helloFresh.pages.CheckoutPage;
import com.helloFresh.pages.CreateAnAccountPage;
import com.helloFresh.pages.Homepage;
import com.helloFresh.pages.MyAccountPage;
import com.helloFresh.pages.OrderConfirmationPage;
import com.helloFresh.pages.ProductCategoryPage;


public class PageObjectManager {

	private WebDriver driver;
	private Homepage homePage;
	private CreateAnAccountPage createAnAccountPage;
	private MyAccountPage myAccountPage;
	private AuthenticationPage authenticationPage;
	private ProductCategoryPage productCategoryPage;
	private CheckoutPage checkoutPage;
	private OrderConfirmationPage orderConfirmationPage;

	/**
	 * Instantiates a new page object manager to create an object of the Pages.
	 *
	 * @param driver the driver
	 */
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * This method is used to create an Object of Home Page Class only if the object is null
	 * else to supply the already created object if it is not null 
	 * 
	 * @return the home page
	 */
	public Homepage getHomePage() {
		return (homePage == null) ? homePage = new Homepage(driver) : homePage;
	}
	
	/**
	 * This method is used to create an Object of Authentication Page Class only if the object is null
	 * And to supply the already created object if it is not null 
	 * 
	 * @return the authentication page
	 */
	public AuthenticationPage getAuthenticationPage(){
		return(authenticationPage == null) ? authenticationPage = new AuthenticationPage(driver) : authenticationPage;
	}
	
	/**
	 * This method is used to create an Object of Create An Account Page Class only if the object is null
	 * And to supply the already created object if it is not null 
	 *
	 * @return the creates the account page
	 */
	public CreateAnAccountPage getCreateAccountPage(){
		return(createAnAccountPage == null) ? createAnAccountPage = new CreateAnAccountPage(driver) : createAnAccountPage;
	}
	
	/**
	 * This method is used to create an Object of My Account Page Class only if the object is null
	 * And to supply the already created object if it is not null 
	 * @return the my account page
	 */
	public MyAccountPage getMyAccountPage(){
		return(myAccountPage == null) ? myAccountPage = new MyAccountPage(driver) : myAccountPage;
	}
	
	/**
	 * This method is used to create an Object of Product Category Page Class only if the object is null
	 * And to supply the already created object if it is not null 
	 *
	 * @return the product category page
	 */
	public ProductCategoryPage getProductCategoryPage(){
		return(productCategoryPage == null) ? productCategoryPage = new ProductCategoryPage(driver) : productCategoryPage;
	}
	
	/**
	 * This method is used to create an Object of Check Out Page Class only if the object is null
	 * And to supply the already created object if it is not null .
	 *
	 * @return the checkout page
	 */
	public CheckoutPage getCheckoutPage(){
		return(checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;
	}
	
	/**
	 * This method is used to create an Object of Order Confirmation Page Class only if the object is null
	 * And to supply the already created object if it is not null 
	 *
	 * @return the order confirmation page
	 */
	public OrderConfirmationPage getOrderConfirmationPage(){
		return(orderConfirmationPage == null) ? orderConfirmationPage = new OrderConfirmationPage(driver) : orderConfirmationPage;
	}
}
