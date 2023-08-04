package group1.week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
        WebElement username=driver.findElement(By.id("username"));
		
		username.sendKeys("DemoSalesManager");
		
		WebElement password = driver.findElement(By.name("PASSWORD"));
		
		password.sendKeys("crmsfa");
		
        WebElement LoginID = driver.findElement(By.className("decorativeSubmit"));
		
		LoginID.click();
		
		driver.manage().window().maximize();
		
		
		WebElement CRMLink =driver.findElement(By.linkText("CRM/SFA"));
		
		CRMLink.click();
		
		
        WebElement LeadsLink =driver.findElement(By.linkText("Leads"));
		
		LeadsLink.click();
		
	
		WebElement FindLead =driver.findElement(By.linkText("Find Leads"));
		
		FindLead.click();
		
		
		
		WebElement Phone = driver.findElement(By.linkText("Phone"));
		
		Phone.click();
		
		driver.findElement(By.name("phoneAreaCode")).sendKeys("91");
		
		driver.findElement(By.name("phoneNumber")).sendKeys("8098814752");
		
		WebElement FindLeads = driver.findElement(By.linkText("Find Leads"));
		
		
		FindLeads.click();
		
		
		
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		WebElement Delete= driver.findElement(By.linkText("Delete"));
		
		Delete.click();
	
		
		
	    
	    
	    driver.close();
		
		




	}

}
