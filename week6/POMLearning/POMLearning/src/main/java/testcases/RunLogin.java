package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunLogin extends BaseClass{
	
	@BeforeTest
	public void passData() {
		ExcelFileName="Login";
		testName="LoginLeaftaps";
		testDescription="Login with valid credentials";
		testCategory="LeafTapsModule1";
		testAuthor="Subraja";
	} 
	
	
	@Test(dataProvider = "fetch")
	public void runLogin(String username,String password) throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmsfaLink()
		;

	}

}
