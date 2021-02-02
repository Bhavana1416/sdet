package Activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity4 {
	WebDriver driver;
  @Test
  public void HeaderCheck() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\BhavanaKristipati\\Desktop\\Automation\\geckodriver.exe");		
      driver = new FirefoxDriver();        
      //Open browser
      driver.get("https://alchemy.hguy.co/lms");
      
      String titleOfFirstInfoBox = driver.findElement(By.xpath("//*[@id='post-71']/div[2]/h3")).getText();
      System.out.println("second most popular course text is: " + titleOfFirstInfoBox);
      Assert.assertEquals("Email Marketing Strategies", titleOfFirstInfoBox);
      driver.close();
      
  }
}
