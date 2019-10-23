package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;


public class ConfigFileReader {
	
	private Properties properties;
	
	/** The file path. */
	private final String filePath = "configs/configurations.properties";
	
	/**
	 * Instantiates a new config file reader.
	 * Here BufferedReader Class Reads text from a character-input stream provided by FileReader.
	 * Properties class object reads a property list (key and element pairs) from the input character stream
	 */
	public ConfigFileReader(){
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			properties = new Properties();
			try{
			properties.load(reader);
			reader.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties file not found at "+ filePath);
		}
	}
	
	/**
	 * Gets the driver path.
	 *
	 * @param driverName the driver name
	 * @return the driver path
	 */
	public String getDriverPath(String driverName){
		String driverPath = properties.getProperty(driverName);
		return driverPath;
	}
	
	/**
	 * Gets the implicit wait.
	 *
	 * @return the implicit wait
	 */
	public long getImplicitWait(){
		String implicitWait = properties.getProperty("implicitWait");
		return Long.parseLong(implicitWait);
	}
	
	/**
	 * Gets the url from Properties file.
	 *
	 * @return the url
	 */
	public String getUrl(){
		String url = properties.getProperty("url");
		return url;
	}
	
	/**
	 * Gets the browser.
	 *
	 * @return the browser
	 */
	public DriverType getBrowser(){
		String browserName = properties.getProperty("browser");
		if(browserName.equals("chrome"))
			return DriverType.CHROME;
		else if(browserName.equals("firefox"))
			return DriverType.FIREFOX;
		else if(browserName.equals("safari"))
			return DriverType.SAFARI;
		else throw new RuntimeException("Browser name key is not present in Configuration.properties file");
	}
	
	/**
	 * Gets the browser window size.
	 *
	 * @return the browser window size
	 */
	public Boolean getBrowserWindowSize() {
		 String windowSize = properties.getProperty("windowMaximize");
		 if(windowSize != null) return Boolean.valueOf(windowSize);
		 return true;
		 }
	
	/**
	 * Gets the test data resource path.
	 *
	 * @return the test data resource path
	 */
	public String getTestDataResourcePath(){
		String testDataResourcePath = properties.getProperty("testDataResourcePath");
		return testDataResourcePath;
	}
	
	/**
	 * Gets the report config path.
	 *
	 * @return the report config path
	 */
	public String getReportConfigPath(){
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
	
	

}
