package org.testes;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
WebDriver driver;
Properties prop;


public void setprop() throws IOException {
	prop=new Properties();
	FileInputStream file= new FileInputStream("D:\\AathmajasdST\\eclips\\ictexam\\src\\test\\resources\\config.properties");
	prop.load(file);
}
@BeforeMethod
public void config() throws IOException {
	setprop();
	String browsername=prop.getProperty("browser");
	if(browsername.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}else if(browsername.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
	}
  driver.get(prop.getProperty("url"));
  
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.manage().window().maximize();
}
@AfterMethod
public void TearDown() {
	driver.quit();
}
}
