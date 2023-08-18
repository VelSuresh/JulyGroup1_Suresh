package group1.week4.day1.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact

{

	public static void main(String[] args) throws InterruptedException

	{

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement UserName = driver.findElement(By.xpath("//input[@id='username']"));

		UserName.sendKeys("demoSalesManager");

		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));

		Password.sendKeys("crmsfa");

		WebElement Login = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));

		Login.click();

		WebElement CRM = driver.findElement(By.linkText("CRM/SFA"));

		CRM.click();

		//
		WebElement Contacts = driver.findElement(By.linkText("Leads"));

		Contacts.click();

		WebElement MergeContact = driver.findElement(By.linkText("Merge Leads"));

		MergeContact.click();

		WebElement FromWidget = driver.findElement(By.xpath("//img[@alt='Lookup'][@border='0'][@height='14']"));

		FromWidget.click();
		
		Set<String> windowHandles = driver.getWindowHandles();

		List<String> WindowHandling = new ArrayList<String>(windowHandles);

		driver.switchTo().window(WindowHandling.get(1));
		
		//(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]
		
		//"(//table[@class='x-grid3-row-table'])[2]/tbody/tr[1]/td[1]/div/a"

		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();

		driver.switchTo().window(WindowHandling.get(0));

		driver.findElement(By.xpath("(//table[@id='widget_ComboBox_partyIdFrom']/following::a/img)[2]")).click();

		Set<String> windowHandles_2 = driver.getWindowHandles();

		List<String> WindowHandling_2 = new ArrayList<String>(windowHandles_2);

		driver.switchTo().window(WindowHandling_2.get(1));
		
		
		//driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[5]/tbody/tr[1]/td[1]/div/a")).click();

		//To Widget Click in Belo
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
		
		Thread.sleep(3000);
				
		driver.switchTo().window(WindowHandling_2.get(0));

		WebElement Merge = driver.findElement(By.linkText("Merge"));

		Merge.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().alert().accept();

		System.out.println(driver.getTitle());
		
		
		//It closes all the active windows
		//driver.quit();

	}

}
