package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass

{
	
	
	/*
	 * @Given("Enter the Username as {string}") public void enterUsername(String
	 * uname) { driver.findElement(By.id("username")).sendKeys(uname);
	 * 
	 * }
	 * 
	 * @Given("Enter the Password as {string}") public void enterPassword(String
	 * pwd) { driver.findElement(By.id("password")).sendKeys(pwd);
	 * 
	 * }
	 * 
	 * @When("Click on the Login button") public void clickLogin() {
	 * driver.findElement(By.className("decorativeSubmit")).click();
	 * 
	 * }
	 * 
	 * @Then("WelcomePage is dispalyed") public void verifyWelcomePage() {
	 * System.out.println(driver.getTitle()); }
	 * 
	 * @When("Click on CRMSFA link") public void click_on_crmsfa_link() {
	 * driver.findElement(By.linkText("CRM/SFA")).click();
	 * 
	 * }
	 * 
	 * @When("Click on Leads link") public void click_on_leads_link() {
	 * driver.findElement(By.linkText("Leads")).click();
	 * 
	 * }
	 */
	  
	  @When("Click on FindLead link") public void click_on_Find_lead_link() {
	  driver.findElement(By.linkText("Find Leads")).click(); }
	  
	  @When("Click on phone link") public void click_on_phone_link() throws
	  InterruptedException {
	  driver.findElement(By.xpath("//span[text()='Phone']")).click();
	  Thread.sleep(2000); }
	  
	  //
	  
	  @When("send phoneNumber as {string}") public void phone_numberSend(String
	  phone) {
	  driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone);
	  }
	  
	  @When("Click on FindLeads Button") public void Click_find_LeadsButton() {
	  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	  
	  }
	  
	  
	  @When("Click on LeadList to Update") 
	  public void Click_on_leadList_toUpdate() throws InterruptedException
	 
	  { 
		 Thread.sleep(3000); 
		 String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		  driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click(); 
	  }
	  
	  @When("Click on Edit lead link") public void editLeadLink() {
	  
	  driver.findElement(By.linkText("Edit")).click();
	  
	  }
	  
	  @When("update the companyName as {string}") public void
	  update_companyName(String cname) 
	  {
		  
	  WebElement CompanyName =driver.findElement(By.id("updateLeadForm_companyName"));
	  CompanyName.clear();
	  CompanyName.sendKeys(cname); 
	  }
	  
	  @Then("Click on submit button") public void click_on_create_button() {
	  driver.findElement(By.name("submitButton")).click();
	  
	  
	  }
	 

}
