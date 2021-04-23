import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class Baseclass {
	public static WebDriver driver;
    public static ExtentTest Reportlogger;
	public static File file;
	public static FileInputStream fip;
	public static Properties prop;

	@Test
	public void ChromePBrowser() {
		// TODO Auto-generated method stub

		//Creating a driver object referencing WebDriver interface
        WebDriver driver;
        
        //Setting the webdriver.chrome.driver property to its executable's location
        //System.setProperty("webdriver.chrome.driver", "D:\\Automation Projects\\Javaproject\\drivers\\chromedriver.exe");
	
        System.setProperty("webdriver.chrome.driver", ReadProperty("chromedriverpath"));
        
        //Instantiating driver object
        driver = new ChromeDriver();
        
        //Using get() method to open a webpage
         driver.get("https://www.google.com/");
         System.out.println(driver.getTitle());
        
        //Closing the browser
        driver.quit();
	}
	
	//**Creating the Method to call the Initial configuration Method******/
	
	
	@BeforeMethod
	public static void initialconfig()
	{
		file= new File(System.getProperty("user.dir")+"\\src\\config\\properties\\config.properties");
		try {
			fip= new FileInputStream(file);
			prop=new Properties();
			prop.load(fip);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException caught in initialconfig"+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	//***Utility Method to read the property from the properties file******//
		public static String ReadProperty(String Key)
		{
			return prop.getProperty(Key);
			
		}
	

}
