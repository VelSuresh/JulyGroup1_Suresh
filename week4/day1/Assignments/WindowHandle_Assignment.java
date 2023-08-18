package group1.week4.day1.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_Assignment {

	public static void main(String[] args) throws InterruptedException 
	
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Clicking first one
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Thread.sleep(2000);
	
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Address of  windows are " +windowHandles );
		
		//Conversion of Set into List
		List<String> listWindowHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listWindowHandles.get(1));
		driver.close();
		driver.switchTo().window(listWindowHandles.get(0));
		System.out.println("Title of parent window is :"+driver.getTitle());
		
		//Clicking Second one
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Thread.sleep(2000);
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> listWindowHandles2 = new ArrayList<String>(windowHandles2);
		
		System.out.println("Address of  windows are " +windowHandles2 );
		
		System.out.println("Number of windows opened are "+listWindowHandles2.size());
		

		Thread.sleep(2000);
		
		for (int i = 1; i < listWindowHandles2.size(); i++)
		
		{
			driver.switchTo().window(listWindowHandles2.get(i));
			driver.close();
			System.out.println("Closed Window " + i+" Successfully ");
		}
		
		driver.switchTo().window(listWindowHandles2.get(0));
		
		//Clicking Third one
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Thread.sleep(2000);
		
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> listWindowHandles3 = new ArrayList<String>(windowHandles3);
		
		System.out.println("Address of  windows are " +windowHandles3 );
		
        Thread.sleep(3000);
		
		for (int i = 1; i < listWindowHandles3.size(); i++)
		
		{
			driver.switchTo().window(listWindowHandles3.get(i));
			driver.close();
			System.out.println("Closed Window " + i + " Successfully");
		}
		
		
		driver.switchTo().window(listWindowHandles3.get(0));
		
		
		//Clicking Fourth one
		
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		Set<String> windowHandles4 = driver.getWindowHandles();
		
		List<String> listWindowHandles4 = new ArrayList<String>(windowHandles4);
		
		for (int i = 1; i < listWindowHandles4.size(); i++)
			
		{
			Thread.sleep(2000);
			driver.switchTo().window(listWindowHandles4.get(i));
			driver.close();
			System.out.println("Closed Window " + i + " Successfully");
			System.out.println("Open with Delay Done Succcessfully");
			
			
		}
	driver.quit();
	
		
	}

}
