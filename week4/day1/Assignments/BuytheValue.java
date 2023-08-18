package group1.week4.day1.Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BuytheValue {

	public static void main(String[] args) throws InterruptedException 
	
	{
      
		/*
		 *
1. Load https://buythevalue.in/
2. Click on first product (eg: Hamdard Hing - 50GM)
3. Enter the pincode 
4. Click on Check
5. Click on ADD TO CART
6. Click on View
7. Click on CHECK OUT
//Handle alert
8. Accept the alert


		 */
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://buythevalue.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Product_1 = driver.findElement(By.xpath("(//div[@class='product-image'])[1]"));
		System.out.println(Product_1.getLocation());
		
		//Using Action class to Scroll down
		
		Actions Product_Scrolling = new Actions(driver);
		Product_Scrolling.scrollByAmount(46, 922);
		
		Product_1.click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).sendKeys("560070");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='wk_zipfinder_btn']//input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='product-add-to-cart']/span")).click();
		//Alert alert =driver.switchTo().alert();
		//alert.accept();
		
		Thread.sleep(3000);
		WebElement ViewButton = driver.findElement(By.xpath("(//a[text()='View Cart'])[1]"));
		
		//Javascript method
		//Due to improper handling of dom , elementinterceptor /javascript exception
		
		driver.executeScript("arguments[0].click();", ViewButton);
		
		
		driver.findElement(By.xpath("//input[@id='checkout']")).click();
		
		Alert alert =driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		driver.close();
		
		
		
		
		
		

	}

}
