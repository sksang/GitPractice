package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.seleniumeasy.com/selenium-tutorials/how-to-work-with-iframes-in-selenium-webdriver");
	  }
	@Test
	  public void f() {
		  List<WebElement> iframes=driver.findElements(By.tagName("iframe"));
		  for(WebElement we:iframes)
		  {
			  System.out.println(we.getAttribute("src"));
		  }
	  }
	 

	  @AfterMethod
	  public void afterMethod() {
		  driver.quit();
	  }
}
