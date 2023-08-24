package group1.week5.day1.Assignments;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead  extends BaseClass

{

	@Test
	
	
	public void runCreate() 
	{

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();
		
   }
	
	
}