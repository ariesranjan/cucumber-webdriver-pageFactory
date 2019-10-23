package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class TestDataFileReader {

	/** The properties. */
	private Properties properties;
	
	/** The file path of expected texts available on the page */
	private final String filePath = "src/test/resources/testDataFiles/expectedTexts.properties";
	
	/**
	 * Instantiates a new test data file reader.
	 */
	public TestDataFileReader(){
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
			throw new RuntimeException("expectedTexts.properties file not found at "+ filePath);
		}
	}
	
	/**
	 * Gets the data from the expected texts property file.
	 *
	 * @param propertyName the property name
	 * @return the data
	 */
	public String getData(String propertyName){
		String propertyValue = properties.getProperty(propertyName);
		return propertyValue;
	}	
}
