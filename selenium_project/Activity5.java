package Activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity5 {
	WebDriver driver;
  @Test
  public void NavigateToMyAccountPage() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\BhavanaKristipati\\Desktop\\Automation\\geckodriver.exe");		
      driver = new FirefoxDriver();        
      //Open browser
      driver.get("https://alchemy.hguy.co/lms");
      String oldtitle = driver.getTitle();  
      System.out.println("Page title is: " + oldtitle);
      driver.findElement(By.linkText("My Account")).click();
      String newtitle = driver.getTitle();  
      System.out.println("New Page title is: " + newtitle);
      Assert.assertEquals("My Account – Alchemy LMS", newtitle);
      driver.close();
      
  }
}
