package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass

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
	 */
	  
	  
	  
	  
	  @When("Click on CRMSFA link") public void click_on_crmsfa_link() {
	  driver.findElement(By.linkText("CRM/SFA")).click();
	  
	  }
	  
	  @When("Click on Leads link") public void click_on_leads_link() {
	  driver.findElement(By.linkText("Leads")).click();
	  
	  }
	  
	  @When("Click on CreateLead link") public void click_on_create_lead_link() {
	  driver.findElement(By.linkText("Create Lead")).click();
	  
	  }
	  
	  @When("Enter the companyName as {string}") public void
	  enter_the_company_name_as(String cname) {
	  driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	  
	  }
	  
	  @When("Enter the firstName as {string}") public void
	  enter_the_first_name_as(String fname) {
	  driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	  
	  }
	  
	  @When("Enter the lastName as {string}") public void
	  enter_the_last_name_as(String lname) {
	  driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	  
	  }
	  
	  @When("Click on Create button") public void click_on_create_button() {
	  driver.findElement(By.name("submitButton")).click();
	  
	  }
	  
	  @Then("ViewLead page is displayed") public void view_lead_page_is_displayed()
	  { System.out.println(driver.getTitle()); }
	  
	 
	
}
