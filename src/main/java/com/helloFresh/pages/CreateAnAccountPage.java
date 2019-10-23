/*
 * This is Create an account page class having all the locators on the page using PageFactory.
 * Also, all the methods for the actions needed to be performed on the locators.
 */
package com.helloFresh.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testDataTypes.RandomDataGeneration;

public class CreateAnAccountPage {
	
	/** The data generator. */
	RandomDataGeneration dataGenerator =  new RandomDataGeneration();
	
	/** The random first name. */
	String firstName = dataGenerator.randomFirstName();
	
	/** The random last name. */
	String lastName = dataGenerator.randomLastName();
	
	/**
	 * Instantiates a new creates the an account page.
	 *
	 * @param driver the driver
	 */
	public CreateAnAccountPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	/** The radio title. */
	@FindBy(how = How.ID, using="id_gender2")
	private WebElement radio_Title;
	
	/** The txt first name. */
	@FindBy(how = How.ID, using="customer_firstname")
	private WebElement txt_FirstName;
	
	/** The txt last name. */
	@FindBy(how = How.ID, using="customer_lastname")
	private WebElement txt_LastName;
	
	/** The txt password. */
	@FindBy(how = How.ID, using="passwd")
	private WebElement txt_Password;
	
	/** The drp dwn dob days. */
	@FindBy(how = How.ID, using="days")
	private WebElement drpDwn_Dob_Days;
	
	/** The drp dwn dob month. */
	@FindBy(how = How.ID, using="months")
	private WebElement drpDwn_Dob_Month;
	
	/** The drp dwn dob years. */
	@FindBy(how = How.ID, using="years")
	private WebElement drpDwn_Dob_Years;
	
	/** The txt company. */
	@FindBy(how = How.ID, using="company")
	private WebElement txt_Company;
	
	/** The txt address line 1. */
	@FindBy(how = How.ID, using="address1")
	private WebElement txt_AddressLine_1;
	
	/** The txt address line 2. */
	@FindBy(how = How.ID, using="address2")
	private WebElement txt_AddressLine_2;
	
	/** The txt city. */
	@FindBy(how = How.ID, using="city")
	private WebElement txt_City;
	
	/** The drp dwn state. */
	@FindBy(how = How.ID, using="id_state")
	private WebElement drpDwn_State;
	
	/** The txt post code. */
	@FindBy(how = How.ID, using="postcode")
	private WebElement txt_PostCode;
	
	/** The txt bx addition info. */
	@FindBy(how = How.ID, using="other")
	private WebElement txtBx_AdditionInfo;
	
	/** The txt home phone. */
	@FindBy(how = How.ID, using="phone")
	private WebElement txt_HomePhone;
	
	/** The txt mobile phone. */
	@FindBy(how = How.ID, using="phone_mobile")
	private WebElement txt_MobilePhone;
	
	/** The txt address alias. */
	@FindBy(how = How.ID, using="alias")
	private WebElement txt_AddressAlias;
	
	/** The btn register. */
	@FindBy(how = How.ID, using="submitAccount")
	private WebElement btn_Register;
	
	/**
	 * Select date of birth.
	 *
	 * @param Day the day
	 * @param Month the month
	 * @param Year the year
	 */
	private void selectDateOfBirth(String Day, String Month, String Year){
		Select select = new Select(drpDwn_Dob_Days);
        select.selectByValue(Day);
        select = new Select(drpDwn_Dob_Month);
        select.selectByValue(Month);
        select = new Select(drpDwn_Dob_Years);
        select.selectByValue(Year);
	}
	
	/**
	 * Select state.
	 *
	 * @param state the state
	 */
	private void selectState(String state){
		Select select = new Select(drpDwn_State);
		select.selectByVisibleText(state);
	}
	
	/**
	 * Gets the text.
	 *
	 * @param locator the locator
	 * @return the text
	 */
	public String getText(WebElement locator){
		return locator.getText();
	}
	
	/**
	 * Gets the full user name.
	 *
	 * @return the full user name
	 */
	public String getFullUserName(){
		return firstName+" "+lastName;
	}
	
	/**
	 * Enter first name.
	 */
	private void enterFirstName(){
		txt_FirstName.sendKeys(firstName);
	}
	
	/**
	 * Enter last name.
	 */
	private void enterLastName(){
		txt_LastName.sendKeys(lastName);
	}
	
	/**
	 * Enter password.
	 */
	private void enterPassword(){
		txt_Password.sendKeys("123456789");
	}
	
	/**
	 * Enter company name.
	 */
	private void enterCompanyName(){
		String companyName = dataGenerator.randomCompanyName();
		txt_Company.sendKeys(companyName);
	}
	
	/**
	 * Enter address line 1.
	 */
	private void enterAddressLine1(){
		txt_AddressLine_1.sendKeys(dataGenerator.randomAddress1());
	}
	
	/**
	 * Enter address line 2.
	 */
	private void enterAddressLine2(){
		txt_AddressLine_2.sendKeys(dataGenerator.randomAddress2());
	}
	
	/**
	 * Enter city.
	 */
	private void enterCity(){
		txt_City.sendKeys(dataGenerator.randomCity());
	}
	
	/**
	 * Enter post code.
	 *
	 * @param count the count
	 */
	private void enterPostCode(int count){
		txt_PostCode.sendKeys(dataGenerator.randomPostCode(count));
	}
	
	/**
	 * Enter additional info.
	 */
	private void enterAdditionalInfo(){
		txtBx_AdditionInfo.sendKeys(dataGenerator.randomText());
	}
	
	/**
	 * Enter home phone.
	 */
	private void enterHomePhone(){
		txt_HomePhone.sendKeys(dataGenerator.randomHomePhome());
	}
	
	/**
	 * Enter mobile phone.
	 */
	private void enterMobilePhone(){
		txt_MobilePhone.sendKeys(dataGenerator.randomMobilePhone());
	}
	
	/**
	 * Enter address alias.
	 */
	private void enterAddressAlias(){
		txt_AddressAlias.sendKeys("hello fresh");
	}
	
	/**
	 * Enter details for create an account.
	 */
	public void enterDetailsForCreateAnAccount(){
		radio_Title.click();
		enterFirstName();
		enterLastName();
		enterPassword();
		selectDateOfBirth("1", "1", "2000");
		enterCompanyName();
		enterAddressLine1();
		enterAddressLine2();
		enterCity();
		selectState("Colorado");
		enterPostCode(5);
		enterAdditionalInfo();
		enterHomePhone();
		enterMobilePhone();
		enterAddressAlias();
	}
	
	/**
	 * Click register button.
	 */
	public void clickRegisterButton(){
		btn_Register.click();
	}

}
