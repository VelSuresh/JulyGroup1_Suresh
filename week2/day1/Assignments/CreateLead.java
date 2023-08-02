package group1.week2.day1.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException
	
	{
		
		
 ChromeDriver driver =new ChromeDriver();
		
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
		
		
WebElement CreateLeadLink =driver.findElement(By.linkText("Create Lead"));
		
CreateLeadLink.click();


WebElement companyName =driver.findElement(By.id("createLeadForm_companyName"));

companyName.sendKeys("TestLeaf");


		
WebElement firstName =driver.findElement(By.id("createLeadForm_firstName"));

firstName.sendKeys("Sureshbabu");


WebElement lastName =driver.findElement(By.id("createLeadForm_lastName"));

lastName.sendKeys("Velliangiri");


WebElement firstNameLocal =driver.findElement(By.id("createLeadForm_firstNameLocal"));

firstNameLocal.sendKeys("Bala");


WebElement department =driver.findElement(By.name("departmentName"));

department.sendKeys("Sports Dept ");


WebElement description =driver.findElement(By.id("createLeadForm_description"));

description.sendKeys("This is my description ");


WebElement emailID =driver.findElement(By.id("createLeadForm_primaryEmail"));

emailID.sendKeys("suresh08@gmail.com ");

Thread.sleep(2000);


WebElement CreateLeadClick =driver.findElement(By.xpath("//input[@name='submitButton']"));

CreateLeadClick.click();

System.out.println(driver.getTitle());
		
		
	}

}
