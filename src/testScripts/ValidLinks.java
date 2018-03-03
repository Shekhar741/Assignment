package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import pages.VerifyPage;

public class ValidLinks extends BaseTest {

	@Test
	public void verifyLinks() {
		VerifyPage v=new VerifyPage();
		String ur=v.link2;
		driver.get(ur);
		VerifyPage.verifyLinkActive(ur);
//		Assert.fail();
	}

}
