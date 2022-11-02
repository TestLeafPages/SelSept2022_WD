package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunCreateLead extends BaseClass{
	@BeforeTest
	public void passData() {
		ExcelFileName="CreateLead";

	}
	
	@Test(dataProvider = "fetch")
	public void runLogin(String username,String password,String cn,String fn,String ln) throws IOException {
		LoginPage lp = new LoginPage();
		lp.enterUsername(username)
		.enterPassword(password)
		.clickloginbutton()
		.hompage()
		.clickcrmsfalink()
		.clickleadsbutton()
		.clickcreateleadlink()
		.entercompanyname(cn)
		.enterfirstname(fn)
		.enterlastname(ln)
		.clickcreateleadsbutton();
	
		
	}

}
