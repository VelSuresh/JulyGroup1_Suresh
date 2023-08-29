package group1.week4.day2.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException
	
	{
        
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//label[@for='twotabsearchtextbox']/following-sibling::input")).sendKeys("oneplus 9 pro",Keys.ENTER);
		String Price_of_Product = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("The price of OnePlus 9 pro is "+Price_of_Product);
		String product_Rating = driver.findElement(By.xpath("(//div[@class='a-row a-size-small']/span/span)[1]")).getText();
		System.out.println("The rating of the product is "+product_Rating);
		driver.findElement(
				By.xpath("(//div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']/h2/a)[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindowHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listWindowHandles.get(1));
		WebElement productImage = driver.findElement(By.xpath("(//span[@data-action='main-image-click']/div/img)[1]"));
		File screenshotAs = productImage.getScreenshotAs(OutputType.FILE);
		File dstn = new File("./snap/amazon.png");
		FileUtils.copyFile(screenshotAs, dstn);
		Thread.sleep(2000);
		WebElement adding_to_Cart = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(adding_to_Cart).click().build().perform();
		String cartValue = driver.findElement(By.xpath("(//div[@class='a-row a-spacing-none'])[4]/div/span/following-sibling::span/span")).getText();
		if(cartValue.contains(Price_of_Product)) {
			System.out.println("Product price matched");
		}
		else {
			System.out.println("Product price not matched");
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
