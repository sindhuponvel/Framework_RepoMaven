package package1;

import org.testng.annotations.Test;

public class CreateContactTest {
	@Test
	public void createContact() {

		String URL = System.getProperty("Url");
		String BROWSER = System.getProperty("Browser");
		String USERNAME = System.getProperty("Username");
		String PASSWORD = System.getProperty("Password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);

		System.out.println("Execute create contact");
	}

	@Test
	public void modityContactTest() {
		System.out.println("Execute modify create contact");
	}

}
