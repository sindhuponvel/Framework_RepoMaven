package package3;

import org.testng.annotations.Test;

public class CreateProductTest {
	@Test(groups = "Smoke Test")
	public void createProduct()
	{
		String URL = System.getProperty("Url");
		String BROWSER = System.getProperty("Browser");
		String USERNAME = System.getProperty("Username");
		String PASSWORD = System.getProperty("Password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);

		System.out.println("Execute create Product");
	}
	@Test(groups = "Regression Test")
	public void createProductWithPhnNo()
	{
		System.out.println("Execute create Product with phone number");
	}

}
