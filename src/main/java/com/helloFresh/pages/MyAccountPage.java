/*
 * This is My Account page class having all the locators on the page using PageFactory.
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

public class MyAccountPage {
	
	/** The wait. */
	private WebDriverWait wait;
	
	/**
	 * Instantiates a new my account page.
	 *
	 * @param driver the driver
	 */
	public MyAccountPage(WebDriver driver){
		wait = new WebDriverWait(driver, 15, 50);
		PageFactory.initElements(driver, this);
	}
	
	/** my account text locator */
	@FindBy(how=How.CSS, using="h1")
	private WebElement txtDisplayed_MyAccount;
	
	/** user account name locator to show who is logged in */
	@FindBy(how=How.CLASS_NAME, using="account")
	private WebElement txtDisplayed_UserAccountName;
	
	/** Welcome Message Text locator */
	@FindBy(how=How.CLASS_NAME, using="info-account")
	private WebElement txtDisplayed_WelComeMessage;
	
	/** sign out link locator on top left corner of My Account page */
	@FindBy(how=How.CLASS_NAME, using="logout")
	private WebElement lnk_SignOut;
	
	/**
	 * Gets the account text.
	 *
	 * @return the account text
	 */
	public String get_account_text(){
		return wait.until(ExpectedConditions.visibilityOf(txtDisplayed_MyAccount)).getText();
	}
	
	/**
	 * Gets the account name.
	 *
	 * @return the account name
	 */
	public String get_account_name(){
		return txtDisplayed_UserAccountName.getText();
	}
	
	/**
	 * Sign out link displayed.
	 *
	 * @return true, if successful
	 */
	public boolean sign_out_link_displayed(){
		return lnk_SignOut.isDisplayed();
	}
	
	/**
	 * Gets the welcome message.
	 *
	 * @return the welcome message
	 */
	public String get_welcome_message(){
		return txtDisplayed_WelComeMessage.getText();
	}

}
