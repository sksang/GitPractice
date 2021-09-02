import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  List<WebElement> iframes=driver.findElements(By.tagName("iframe"));
	  for(WebElement we:iframes)
	  {
		  System.out.println(we.getAttribute("src"));
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe")
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.seleniumeasy.com/selenium-tutorials/how-to-work-with-iframes-in-selenium-webdriver");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
