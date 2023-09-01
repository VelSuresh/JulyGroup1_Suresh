package group1.week6.Day1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead  extends BaseClass

{

	@Test (dataProvider="fetchData")//acting as main method for the execution
	
	public void runCreate(String cname,String fname,String lname ,String phone)
	
	{
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phone);
		driver.findElement(By.name("submitButton")).click();
		
}
	
	//@DataProvider -->supply the test data to the @Test
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException
	
	{
				
		/*
		 * String[][] data=new String[2][3];
		 * 
		 * data[0][0]="Testleaf"; data[0][1]="Vidya"; data[0][2]="R";
		 * data[0][0]=from excel [0][0]
		 * data[1][0]="Qeagle"; data[1][1]="Aravind"; data[1][2]="R";
		 */
//	ReadExcel re=new ReadExcel();
		
		//Static Method does not require any object to be created to call that Method.
		
		
			String[][] readExcel = ReadExcel.readExcel();
			return readExcel;
	
		
	}
	
	//String cnmae="testleaf";
			//table 
			//row  and col
			//cname fname lname
			//2d string array
	
	
	
	
		
}