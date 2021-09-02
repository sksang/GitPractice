package PRS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PRS_01 {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.guru99.com/");
	    
	    WebElement we1=driver.findElement(By.xpath("//*[contains(@target,'_to') and @href='/sql.html']"));
	    System.out.println(we1.getText());
	    driver.quit();
	}

}
