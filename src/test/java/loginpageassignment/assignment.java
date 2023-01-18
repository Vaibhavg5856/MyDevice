package loginpageassignment;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class assignment extends base {
	
	@Test
	
	public void Sortvalue() throws InterruptedException, IOException
	{
		extent.createTest("Sort Value Demo");
		landingpage lp=Demoapp();
		// TODO Auto-generated method stub
		
	    /*WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://sakshingp.github.io/assignment/login.html");
	    driver.manage().window().maximize();*/
	    
	   //Login TestCase
	    Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("vaibhavgurav12");
		driver.findElement(By.id("password")).sendKeys("@Vaibhav123");
		driver.findElement(By.id("log-in")).click();
		Thread.sleep(3000);
	
		/*driver.findElement(By.id("username")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.id("log-in")).click();
		String text =driver.findElement(By.id("random_id_9")).getText();
		System.out.println(text);*/
		
		//driver.findElement(By.className("form-check-input")).click();
		//System.out.println(driver.findElement(By.className("form-check-input")).isSelected());
	
	    
		//Homepage TestCase
		driver.findElement(By.className("text-right")).click();
		//driver.close();
		extent.flush();
		
}
}
		
		
		
		

	    


	


