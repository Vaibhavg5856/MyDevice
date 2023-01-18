package loginpageassignment;

    import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
	

	public class base {
		WebDriver driver;
		ExtentReports extent;
	     
		@BeforeTest
	      public void config()
	      {
		//ExtentReports, ExtentSparkReporter
	    	String Path = System.getProperty("user.dir")+"\\reports\\index.html";
	    	 ExtentSparkReporter reporter= new ExtentSparkReporter(Path);
	    	 reporter.config().setReportName("Demoapp Automation Results");
	    	 reporter.config().setDocumentTitle("Test Results");
	    	 
	    	 extent =new ExtentReports();
	    	 extent.attachReporter(reporter);
	    	 extent.setSystemInfo("Tester", "Vaibhav Gurav");
	      }
		
		public  WebDriver initializeDriver() throws IOException
		{
			
		     //Properties File
			
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\loginpageassignment\\resources\\Globaldata.properties");
			prop.load(fis);
			String browserName = prop.getProperty("browser");
		
			if(browserName.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
			    driver = new ChromeDriver();
			}
		     driver.manage().window().maximize();
		     return driver;
		}
		     
		     public landingpage Demoapp() throws IOException
		     {
		    	 driver = initializeDriver();
		    	 landingpage lp = new landingpage(driver);
			 	    lp.Goto();
			 	    return lp;
		    	 
		 	 
		     }
			    
		}

