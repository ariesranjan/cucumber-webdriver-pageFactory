package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	/** The driver. */
	WebDriver driver;
	
	/**
	 * Instantiates a new wait.
	 *
	 * @param driver the driver
	 */
	public Wait(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Wait for visibility.
	 *
	 * @param element the element
	 */
	private void waitForVisibility(WebElement element){
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * Checks if element is visible.
	 *
	 * @param element the element
	 */
	public void isVisible(WebElement element){
		waitForVisibility(element);
	}

}
