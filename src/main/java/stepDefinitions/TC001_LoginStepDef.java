package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_LoginStepDef {
	
	WebDriver driver;
	@Given("user is on home page")
	public void user_is_on_home_page() {
	    System.out.println("Launch Browser and enter url");
	    System.out.println("Class is modified...");
	}
	@When("user clicks on signin link")
	public void user_clicks_on_signin_link() {
	   System.out.println("Click on Sign in link");
	}
	@Then("next page is displayed with title")
	public void next_page_is_displayed_with_title() {
	    System.out.println("Check title");
	}
	@When("user enters username")
	public void user_enters_username() {
	    System.out.println("Enter user name");
	}
	@When("user enters password")
	public void user_enters_password() {
	    System.out.println("Enter Password");
	}
	@When("clicks on Submit button")
	public void clicks_on_submit_button() {
	    System.out.println("Click on Submit");
	}
	@Then("User should connected to inbox")
	public void user_should_connected_to_inbox() {
	   System.out.println("Validate user..");
	}
	@Then("display a message Login successful")
	public void display_a_message_login_successful() {
	    System.out.println("Login Successful...");
	}
	@When("user clicks on Logout")
	public void user_clicks_on_logout() {
	    System.out.println("Click on logout");
	}
	@Then("Application gets closed")
	public void application_gets_closed() {
	   System.out.println("Close the application");
	}



}
