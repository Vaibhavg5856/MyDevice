package loginpageassignment;

import java.io.IOException;

import org.testng.annotations.Test;



public class pageobject extends base {
	
	@Test
	
		public void Clickbutton() throws IOException, InterruptedException
		{
		extent.createTest("PageObject Demo");
		 landingpage lp= Demoapp();  
		
		Thread.sleep(3000);
		    lp.loginpage("vaibhavgurav12", "@Vaibhav123");
		    Thread.sleep(3000);
		    lp.AmountClick();
		   extent.flush();
		
		}
	    
	   

}
