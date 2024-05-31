package package2;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups="Regression Test")
	public void createOrg() {
		System.out.println("Execute create org");
	}

	@Test(groups="Smoke Test")
	public void modifyOrgTest() {
		System.out.println("Execute modify org ");
	}

}
