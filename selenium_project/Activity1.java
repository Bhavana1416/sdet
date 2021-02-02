package Activity1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Activity1 {
	WebDriver driver;
	@Test
    public void PageTitleCheck() {
        //Create a new instance of the Firefox driver
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\BhavanaKristipati\\Desktop\\Automation\\geckodriver.exe");		
        driver = new FirefoxDriver();        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");

        String title = driver.getTitle();   
        
        //Print the title of the page
        System.out.println("Page title is: " + title);
        Assert.assertEquals("Alchemy LMS – An LMS Application", title);
        driver.close();
        
    }
	
}
