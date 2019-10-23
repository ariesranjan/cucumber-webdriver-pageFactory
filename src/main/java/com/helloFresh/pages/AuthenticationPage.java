/*
 * This is Authentication page class having all the locators on the page using PageFactory.
 * Also, all the methods for the actions needed to be performed on the locators.
 */
package com.helloFresh.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testDataTypes.RandomDataGeneration;


public class AuthenticationPage {
	
	/** Creating object of data generator class */
	RandomDataGeneration dataGenerator = new RandomDataGeneration();
	
	/**
	 * Instantiates a new authentication page.
	 *
	 * @param driver the driver
	 */
	public AuthenticationPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	/** The email text field locator */
	@FindBy(how = How.ID, using="email_create")
	private WebElement txt_Email_field;
	
	/** create account button locator */
	@FindBy(how = How.ID, using="SubmitCreate")
	private WebElement btn_Create_Account;
	
	/** The txt user name. */
	@FindBy(how = How.ID, using="email")
	private WebElement txt_UserName;
	
	/** The txt password. */
	@FindBy(how = How.ID, using="passwd")
	private WebElement txt_Password;
	
	/** The btn submit. */
	@FindBy(how = How.ID, using="SubmitLogin")
	private WebElement btn_Submit;
	
	/**
	 * Enter email.
	 */
	public void enter_Email(){
		txt_Email_field.sendKeys(dataGenerator.randomEmail());
	}
	
	/**
	 * Click on create account button.
	 */
	public void click_On_CreateAccountButton(){
		btn_Create_Account.click();
	}
	
	/**
	 * Enter username.
	 *
	 * @param username the username
	 */
	public void enter_username(String username){
		txt_UserName.sendKeys(username);
	}
	
	/**
	 * Enter password.
	 *
	 * @param password the password
	 */
	public void enter_Password(String password){
		txt_Password.sendKeys(password);
	}
	
	/**
	 * Click submit.
	 */
	public void click_Submit(){
		btn_Submit.click();
	}
}
