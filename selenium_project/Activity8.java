package Activity1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity8 {
	WebDriver driver;
  @Test
  public void CotactUs() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\BhavanaKristipati\\Desktop\\Automation\\geckodriver.exe");		
      driver = new FirefoxDriver();        
      //Open browser
      driver.get("https://alchemy.hguy.co/lms");
      //String oldtitle = driver.getTitle();  
      //System.out.println("Page title is: " + oldtitle);
    driver.findElement(By.linkText("Contact")).click();
    driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Bhavana Kristipati");
    driver.findElement(By.id("wpforms-8-field_1")).sendKeys("Bhavana1234@gmail.com");
    driver.findElement(By.id("wpforms-8-field_3")).sendKeys("Practise Purpose");
    driver.findElement(By.id("wpforms-8-field_2")).sendKeys("Commeting for Practise Purpose");
    driver.findElement(By.id("wpforms-submit-8")).click();
   String conformatioMessage = driver.findElement(By.id("wpforms-confirmation-8")).getText();
      System.out.println("Message is: "+conformatioMessage);
      driver.close();
      /*driver.findElement(By.linkText("My Account")).click();
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
      driver.close();}*/
  }
}
