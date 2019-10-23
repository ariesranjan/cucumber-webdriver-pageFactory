/*
 * This is Home page class having all the locators on the page using PageFactory.
 * Also, all the methods for the actions needed to be performed on the locators.
 */
package com.helloFresh.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import dataProvider.ConfigFileReader;

public class Homepage {
	 
 	/** The driver. */
 	WebDriver driver;
	 
 	/** The config. */
 	ConfigFileReader config = new ConfigFileReader();
	 
	 /**
 	 * Instantiates a new homepage.
 	 *
 	 * @param driver the driver
 	 */
	public Homepage(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	 }
	 
	 /** sign in button locator on home page */
 	@FindBy(how=How.CLASS_NAME, using="login" )
	 private WebElement btn_Sign_In;
	 
	 /**
 	 * Navigate to home page.
 	 */
 	public void navigateTo_HomePage() {
	 driver.get(config.getUrl());
	 }
	 
	 /**
 	 * Gets the current page url.
 	 *
 	 * @return the current page url
 	 */
 	public String getCurrentPageUrl(){
		 return driver.getCurrentUrl();
	 }
	 
	 /**
 	 * Click on sign in button.
 	 */
 	public void click_On_SignIn_Button() {
		 btn_Sign_In.click();
	 }
	 
	}
