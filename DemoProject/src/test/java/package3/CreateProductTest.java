package package3;

import org.testng.annotations.Test;

public class CreateProductTest {
	@Test(groups = "Smoke Test")
	public void createProduct()
	{
		System.out.println("Execute create Product");
	}
	@Test(groups = "Regression Test")
	public void createProductWithPhnNo()
	{
		System.out.println("Execute create Product with phone number");
	}

}
