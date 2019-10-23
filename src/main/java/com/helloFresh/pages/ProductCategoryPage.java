/*
 * This is Product Category page class having all the locators on the page using PageFactory.
 * Also, all the methods for the actions needed to be performed on the locators.
 */

package com.helloFresh.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProductCategoryPage {

/** The wait. */
private WebDriverWait wait;
	
	/**
	 * Instantiates a new product category page.
	 *
	 * @param driver the driver
	 */
	public ProductCategoryPage(WebDriver driver){
		wait = new WebDriverWait(driver, 15, 50);
		PageFactory.initElements(driver, this);
	}
	
	/** women category tab locator */
	@FindBy(how=How.LINK_TEXT, using="Women")
	private WebElement lnk_Women_Category;
	
	/** Locator to get all the dresses available on women category tab */
	@FindBy(how=How.CSS, using="ul[class='product_list grid row'] li a[class='product-name']")
	private List<WebElement> lnk_dress;
	
	/** add to cart button locator */
	@FindBy(how=How.NAME, using="Submit")
	private WebElement btn_Add_to_Cart;
	
	/** process to check out button on Production Information page */
	@FindBy(how=How.XPATH, using="//*[@id='layer_cart']//a[@class and @title='Proceed to checkout']")
	private WebElement btn_ProcessToCheck_Out;
	
	/**
	 * Click women category tab.
	 */
	public void click_Women_Category(){
		wait.until(ExpectedConditions.visibilityOf(lnk_Women_Category)).click();
	}
	
	/**
	 * Click on dress.
	 *
	 * @param dress the dress
	 */
	public void click_On_Dress(String dress){
		for(WebElement womenDress : lnk_dress){
			if(womenDress.getAttribute("title").contains(dress)){
				womenDress.click();
				break;
			}
		}
	}
	
	/**
	 * Click on Add To Cart button.
	 */
	public void click_On_Addto_cart(){
		wait.until(ExpectedConditions.visibilityOf(btn_Add_to_Cart)).click();
	}
	
	/**
	 * Click on proceed checkout button.
	 */
	public void click_On_Proceed_Checkout(){
		wait.until(ExpectedConditions.visibilityOf(btn_ProcessToCheck_Out)).click();
	}
	
	
}
