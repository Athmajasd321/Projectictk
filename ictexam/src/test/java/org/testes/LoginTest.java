package org.testes;

import org.pages.LoginPges;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
LoginPges LP;
@BeforeTest
public void setuo() {
	LP=new LoginPges(driver);
}
@Test
public void submit() {
	LP=new LoginPges(driver);
	LP.setname(prop.getProperty("Name"));
	LP.setemail(prop.getProperty("Email"));
	LP.setphone(prop.getProperty("Phone"));
	LP.setsubject(prop.getProperty("Subject"));
	LP.setmessage(prop.getProperty("Message"));
	LP.submitclick();
}
}
