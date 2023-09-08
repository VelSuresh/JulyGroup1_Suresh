package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends BaseClass

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
	 * 
	 * 
	 * @When("Click on FindLead link") public void click_on_Find_lead_link() {
	 * driver.findElement(By.linkText("Find Leads")).click(); }
	 * 
	 * @When("Click on phone link") public void click_on_phone_link() throws
	 * InterruptedException {
	 * driver.findElement(By.xpath("//span[text()='Phone']")).click();
	 * Thread.sleep(2000); }
	 * 
	 * //
	 * 
	 * @When("send phoneNumber as {string}") public void phone_numberSend(String
	 * phone) {
	 * driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone);
	 * }
	 * 
	 * @When("Click on FindLeads Button") public void Click_find_LeadsButton() {
	 * driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	 * 
	 * }
	 * 
	 * 
	 * @When("Click on LeadList to Update") public void Click_on_leadList_toUpdate()
	 * throws InterruptedException
	 * 
	 * { Thread.sleep(3000); String leadID = driver.findElement(By.
	 * xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	 * driver.findElement(By.
	 * xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click(); }
	 */ 
	
	 @When("Click on Delete lead link")
	 
	 public void deleteLeadLink()
	 
	 {
		  
		 driver.findElement(By.linkText("Delete")).click();
		  
	 }
 @When("Find Leads to be deleted")
	 
	 public void deleteLeadsList()
	 
	 {
		  
	 driver.findElement(By.linkText("Find Leads")).click();
		  
	 }
 
 @When("Send LeadID")
 public void send_lead_id(String leadID) {
     // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
     throw new io.cucumber.java.PendingException();
 }
 
 @When("Send LeadID'{int}'")
 public void send_lead_id(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	  
     
	

}

