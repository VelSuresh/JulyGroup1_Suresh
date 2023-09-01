package group1.week6.Day1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditLead extends BaseClass

{

	//acting as main method for the execution
	
	@Test(dataProvider="fetchData")
	public void editrun(String phone, String cname) throws InterruptedException 
	
	{
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname); 
		driver.findElement(By.name("submitButton")).click();
		
	}
	
	
	//@DataProvider -->supply the test data to the @Test
	@DataProvider(name="fetchData")
	public String[][] editData() throws IOException
	
	{
		String[][] editExcel2 = ReadExcel.editExcel();
	
		
			 
			return editExcel2;
	
		
	}
	
	
	
	

	
	
		
}
