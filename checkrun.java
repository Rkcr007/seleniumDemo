import junit.framework.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v110.browser.Browser;


public class checkfirst {
	
	static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		
		 // Set the path of the chromedriver executable file
	    // Download the appropriate version of the chromedriver for your system from https://sites.google.com/a/chromium.org/chromedriver/downloads
	    
		System.setProperty("webdriver.chrome.driver", "/Users/rakeshkumarbarik/Downloads/chromedriver_mac64/chromedriver");

	    // Create an instance of the Chrome web driver
		
	     WebDriver driver = new ChromeDriver();

	    // Open the Google website
	    //driver.get("https://www.google.com");
	    
	    driver.get("https://www.saucedemo.com/");
	   
	  //  takeSnapShot("loginpage");    
	    
	    //Login user name
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
	    
	    
	    // password     
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}
	   
	    //public static void takeSnapShot(String filename) throws IOException{
	    	
			
			
			
		//	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
		//	FileUtils.copyFile(file, new File ("/Users/rakeshkumarbarik/eclipse-workspace/CucumberTest/Screenshots"+filename+".png"));
					
				
	    		
	    

	    // Close the web browser
	    //driver.quit();
	 // }
}
		

	


