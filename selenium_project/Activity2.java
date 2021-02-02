package Activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;
  @Test
  public void HeaderCheck() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\BhavanaKristipati\\Desktop\\Automation\\geckodriver.exe");		
      driver = new FirefoxDriver();        
      //Open browser
      driver.get("https://alchemy.hguy.co/lms");
      
      String header = driver.findElement(By.tagName("h1")).getText();
      System.out.println("Header is: " + header);
      Assert.assertEquals("Learn from Industry Experts", header);
      driver.close();
      
  }
}
