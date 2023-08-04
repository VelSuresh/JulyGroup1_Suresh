package group1.week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException 
	
	
	{

		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		
		driver.manage().window().maximize();
		
		
		
		WebElement userName= driver.findElement(By.id("username"));
		
		userName.sendKeys("demoSalesManager");
		
		
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("crmsfa");
		
		
		
		WebElement Login =driver.findElement(By.className("decorativeSubmit"));
		
		
		Login.click();
		
		
		WebElement CRM = driver.findElement(By.linkText("CRM/SFA"));
		
		CRM.click();
		
		
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Suresh");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Croyez");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(2000);
		driver.close();
		
	
	}

}
