package testDataTypes;

import com.github.javafaker.Faker;

public class RandomDataGeneration {
	
	/** The faker. */
	Faker faker = new Faker();
	
	/**
	 * Random first name.
	 *
	 * @return the string
	 */
	public String randomFirstName(){
		String firstName = faker.name().firstName();
		return firstName;
	}
	
	/**
	 * Random last name.
	 *
	 * @return the string
	 */
	public String randomLastName(){
		String lastName = faker.name().lastName();
		return lastName;
	}
	
	/**
	 * Random company name.
	 *
	 * @return the string
	 */
	public String randomCompanyName(){
		String company = faker.company().name();
		return company;
	}
	
	/**
	 * Random address 1.
	 *
	 * @return the string
	 */
	public String randomAddress1(){
		String address1 = faker.address().buildingNumber();
		return address1;
	}
	
	/**
	 * Random address 2.
	 *
	 * @return the string
	 */
	public String randomAddress2(){
		String address2 = faker.address().streetAddress();
		return address2;
	}
	
	/**
	 * Random city.
	 *
	 * @return the string
	 */
	public String randomCity(){
		String city = faker.address().city();
		return city;
	}
	
	/**
	 * Random post code.
	 *
	 * @param count the count
	 * @return the string
	 */
	public String randomPostCode(int count){
		String postCode = faker.number().digits(count);
		return postCode;
	}
	
	/**
	 * Random home phome.
	 *
	 * @return the string
	 */
	public String randomHomePhome(){
		String homePhone = faker.phoneNumber().phoneNumber();
		return homePhone.substring(0, 10);
	}
	
	/**
	 * Random mobile phone.
	 *
	 * @return the string
	 */
	public String randomMobilePhone(){
		String mobilePhone = faker.phoneNumber().cellPhone();
		return mobilePhone;
	}
	
	/**
	 * Random text.
	 *
	 * @return the string
	 */
	public String randomText(){
		String text = faker.lorem().sentence();
		return text;
	}
	
	/**
	 * Random email.
	 *
	 * @return the string
	 */
	public String randomEmail(){
		String email = faker.name().username();
		return email+"@gmail.com";
	}

}
