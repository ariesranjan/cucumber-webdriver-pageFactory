/*
 * This is Order Confirmation page class having all the locators on the page using PageFactory.
 * Also, all the methods for the actions needed to be performed on the locators.
 */

package com.helloFresh.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OrderConfirmationPage {
	
	/** The wait. */
	private WebDriverWait wait;
	
	/**
	 * Instantiates a new order confirmation page.
	 *
	 * @param driver the driver
	 */
	public OrderConfirmationPage(WebDriver driver){
		wait = new WebDriverWait(driver, 15, 50);
		PageFactory.initElements(driver, this);
	}
	
	/** order confirmation text locator */
	@FindBy(how=How.CSS, using="h1")
	private WebElement txtDisplayed_OrderConfirmation;
	
	/** Payment step locator on navigation bar. */
	@FindBy(how=How.XPATH, using="//li[@class='step_done step_done_last four']")
	private WebElement nav_Fourth_ShippingStep;
	
	/** payment step locator on navigation bar*/
	@FindBy(how=How.XPATH, using="//li[@id='step_end' and @class='step_current last']")
	private WebElement nav_Last_Payment_Step;
	
	/** order completion text */
	@FindBy(how=How.XPATH, using="//*[@class='cheque-indent']/strong")
	private WebElement txt_Order_Completion_text;
	
	/**
	 * Gets the order confirmation heading.
	 *
	 * @return the order confirmation heading
	 */
	public String get_order_confirmation_heading(){
		return wait.until(ExpectedConditions.visibilityOf(txtDisplayed_OrderConfirmation)).getText();
	}
	
	/**
	 * Checking if payment step is displayed as fourth step
	 *
	 * @return true, if successful
	 */
	public boolean fourth_step_Shipping_displayed(){
		return nav_Fourth_ShippingStep.isDisplayed();
	}
	
	/**
	 * Last payment step displayed.
	 *
	 * @return true, if successful
	 */
	public boolean last_payment_step_displayed(){
		return nav_Last_Payment_Step.isDisplayed();
	}
	
	/**
	 * Gets the order confirmation message.
	 *
	 * @return the order confirmation message
	 */
	public String get_order_confirmation_message(){
		return txt_Order_Completion_text.getText();
	}

}
