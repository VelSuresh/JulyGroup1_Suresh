package group1.week2.day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class acme_test {

	public static void main(String[] args)
	
	{
		 ChromeDriver driver =new ChromeDriver();
			
			driver.get("https://acme-test.uipath.com/login");
			
			driver.manage().window().maximize();
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
			
			
			WebElement email =driver.findElement(By.xpath("//input[@name='email']"));
			
			email.sendKeys("kumar.testleaf@gmail.com");
			
			
			
			WebElement password =driver.findElement(By.xpath("//input[@name='password']"));

			password.sendKeys("leaf@12");
			
			
			WebElement loginButton =driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/button"));

			loginButton.click();
			
			
			String title =driver.getTitle();
			
			System.out.println(title);
			
			driver.close();
	
	     		

	}

}
