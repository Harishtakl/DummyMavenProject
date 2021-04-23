
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Baseclass {
	

	@Test
	public void ChromePBrowser() {
		// TODO Auto-generated method stub

		//Creating a driver object referencing WebDriver interface
        WebDriver driver;
        
        //Setting the webdriver.chrome.driver property to its executable's location
        System.setProperty("webdriver.chrome.driver", "D:\\Automation Projects\\Javaproject\\drivers\\chromedriver.exe");
	
        //Instantiating driver object
        driver = new ChromeDriver();
        
        //Using get() method to open a webpage
         driver.get("https://www.google.com/");
         System.out.println(driver.getTitle());
        
        //Closing the browser
        driver.quit();
	}
	

}
