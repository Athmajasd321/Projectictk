package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPges {
WebDriver driver;

public LoginPges(WebDriver driver2) {
	// TODO Auto-generated constructor stub
	this.driver=driver2;
}

public void setname(String Name) {
    WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
    name.sendKeys(Name);
}

public void setemail(String Email) {
	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys(Email);	
}

public void setphone(String Phone) {
	WebElement phone=driver.findElement(By.xpath("//input[@id='phone']"));
	phone.sendKeys(Phone);
}

public void setsubject(String Subject) {
	WebElement subject=driver.findElement(By.xpath("//input[@id='subject']"));
	subject.sendKeys(Subject);
}
public void setmessage(String Message) {
	WebElement message=driver.findElement(By.xpath("//textarea[@id='description']"));
	message.sendKeys(Message);
}
public void submitclick() {
	WebElement submit=driver.findElement(By.xpath("//button[@id='submitContact']"));
	submit.click();	
}
}



