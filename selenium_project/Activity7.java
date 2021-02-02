package Activity1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;
  @Test
  public void ViewAllCourses() {
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
      driver.findElement(By.linkText("Login")).click();
      driver.findElement(By.id("user_login")).sendKeys("root");
      driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
      driver.findElement(By.id("wp-submit")).click();
      
      if(driver.findElement(By.id("menu-item-1507")).isDisplayed())
      {
     System.out.println("Logged in successfully");
     driver.findElement(By.linkText("All Courses")).click();
     List<WebElement> CourseList = driver.findElements(By.xpath(" //div[contains(text(),'Enrolled')]"));
     System.out.println("Number of courses Enrolled is "+ CourseList.size()  );
     driver.close();
    	
      }
      else
      {System.out.println("Not Logged in");
      driver.close();}
  }
}
