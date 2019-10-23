/*
 * This is Checkout page class having all the locators on the page using PageFactory.
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

public class CheckoutPage {
	
	/** The wait. */
	private WebDriverWait wait;
	
	/**
	 * Instantiates a new checkout page.
	 *
	 * @param driver the driver
	 */
	public CheckoutPage(WebDriver driver){
		wait = new WebDriverWait(driver, 15, 50);
		PageFactory.initElements(driver, this);
	}
	
	
	/** locator for process to check out button on summary navigation tab during checkout process */
	@FindBy(how=How.XPATH, using="//*[contains(@class,'cart_navigation')]/a[@title='Proceed to checkout']")
	private WebElement btn_ProcessToCheck_Out_SummaryNav;
	
	/** locator for process to check out button on address navigation tab during checkout process */
	@FindBy(how=How.NAME, using="processAddress")
	private WebElement btn_ProcessToCheck_Out_AddressNav;
	
	/** The check box terms & conditions. */
	@FindBy(how=How.ID, using="uniform-cgv")
	private WebElement chkBx_TermsConditions;
	
	/** locator for process to check out button on Shipping navigation tab during checkout process. */
	@FindBy(how=How.NAME, using="processCarrier")
	private WebElement btn_ProcessToCheck_Out_ShippingNav;
	
	/** The pay by bank wire button on Payment page */
	@FindBy(how=How.CLASS_NAME, using="bankwire")
	private WebElement btn_Pay_by_Bank_Wire;
	
	/** The confirm order button. */
	@FindBy(how=How.XPATH, using="//*[@id='cart_navigation']/button")
	private WebElement btn_Confirm_Order;

	/**
	 * Click proceed to checkout summary nav.
	 */
	public void click_proceed_to_checkout_summaryNav(){
		wait.until(ExpectedConditions.visibilityOf(btn_ProcessToCheck_Out_SummaryNav)).click();
	}
	
	/**
	 * Click proceed to checkout address nav.
	 */
	public void click_proceed_to_checkout_addressNav(){
		wait.until(ExpectedConditions.visibilityOf(btn_ProcessToCheck_Out_AddressNav)).click();
	}
	
	/**
	 * Click checkbox terms conditions.
	 */
	public void click_checkbox_terms_conditions(){
		wait.until(ExpectedConditions.visibilityOf(chkBx_TermsConditions)).click();
	}
	
	/**
	 * Click proceed to checkout shipping nav.
	 */
	public void click_proceed_to_checkout_shippingNav(){
		btn_ProcessToCheck_Out_ShippingNav.click();
	}
	
	/**
	 * Click pay bank wire button.
	 */
	public void click_Pay_bank_Wire_button(){
		wait.until(ExpectedConditions.visibilityOf(btn_Pay_by_Bank_Wire)).click();
	}
	
	/**
	 * Click confirm order button.
	 */
	public void click_confirm_order_button(){
		wait.until(ExpectedConditions.visibilityOf(btn_Confirm_Order)).click();
	}
}
