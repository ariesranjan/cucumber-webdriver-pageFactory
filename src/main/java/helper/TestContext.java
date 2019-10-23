package helper;

import managers.PageObjectManager;
import managers.WebdriverManager;

public class TestContext {
	
	/** The webdriver manager. */
	private WebdriverManager webdriverManager;
	
	/** The page object manager. */
	private PageObjectManager pageObjectManager;
	
	/** The wait. */
	private Wait wait;
	
	/**
	 * Instantiates a new test context.
	 */
	public TestContext(){
		webdriverManager = new WebdriverManager();
		pageObjectManager = new PageObjectManager(webdriverManager.getDriver());
	}
	
	/**
	 * Gets the webdriver manager.
	 *
	 * @return the webdriver manager
	 */
	public WebdriverManager getWebdriverManager(){
		return webdriverManager;
	}
	
	/**
	 * Gets the page object manager.
	 *
	 * @return the page object manager
	 */
	public PageObjectManager getPageObjectManager(){
		return pageObjectManager;
	}

	/**
	 * Gets the explicit wait.
	 *
	 * @return the explicit wait
	 */
	public Wait getExplicitWait(){
		return wait;
	}
}
