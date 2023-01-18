package loginpageassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingpage {
	
	WebDriver driver;
	
	public landingpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//WebElement username = driver.findElement(By.id("username"));
	//PageFactory
	
	@FindBy(id="username")
	WebElement user;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(id="log-in")
	WebElement login;
	
	public void loginpage(String username, String password )
	{
		user.sendKeys("vaibhav12");
        pass.sendKeys("@Vaibhav123");
        login.click();
	}
	
	public void Goto()
	{
		driver.get("https://sakshingp.github.io/assignment/login.html");
	}
	
	public void AmountClick()
	{
		driver.findElement(By.className("text-right")).click();
	
	}
	

	
}
