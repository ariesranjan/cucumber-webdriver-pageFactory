package managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataProvider.ConfigFileReader;
import enums.DriverType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManager {
	
	/** The config. */
	ConfigFileReader config;

	/** The driver. */
	private WebDriver driver;
	
	/** The driver type instance of enum class */
	private static DriverType driverType;
	
	
	/**
	 * Instantiates a new webdriver manager.
	 * driverType is giving the name of the browser from config file 
	 */
	public WebdriverManager(){
		config = new ConfigFileReader();
		driverType = config.getBrowser();
	}
	
	/**
	 * Creates the driver using driverType which is coming from configurations.properties file.
	 * WebDriverManager allows to automate the management of the binary drivers (e.g. chromedriver, geckodriver, etc.) 
	 * required by Selenium WebDriver. We don't need to have the browser drivers on local machine and no need to give the path of the same.
	 *
	 * @return the web driver
	 */
	private WebDriver createDriver(){
		switch(driverType){
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			break;
		}
		if(config.getBrowserWindowSize())
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(config.getImplicitWait(), TimeUnit.SECONDS);
		return driver;
	}
	
	/**
	 * Gets the driver.
	 *
	 * @return the driver
	 */
	public WebDriver getDriver(){
		driver = createDriver();
		return driver;
	}
	
	/**
	 * Close driver.
	 */
	public void closeDriver(){
		driver.quit();
	}
	
	/**
	 * Gets the driver instance.
	 *
	 * @return the driver instance
	 */
	public WebDriver getDriverInstance(){
		return driver;
	}
}
