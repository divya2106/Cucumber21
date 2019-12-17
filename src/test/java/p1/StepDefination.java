package p1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	@Given("Enter the url")
	public void enter_the_url() {
		System.out.println("Test Me App");
	    
	}

	@And("Enter the user name")
	public void enter_the_user_name() {
		System.out.println("user name entered");
	 
	}

	@And("Enter the password")
	public void enter_the_password() {
		System.out.println("password entered");
	  
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
		System.out.println("login button clicked");
	    
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    System.out.println("Home page is displayed");
	}



}
