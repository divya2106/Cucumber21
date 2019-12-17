package p3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef3 {
	@Given("User navigates to website")
	public void user_navigates_to_website() {
		System.out.println("1");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@And("enters {string} and {int}")
	public void enters_and(String string, Integer int1) {
		System.out.println("2");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("Click on the signup")
	public void click_on_the_signup() {
		System.out.println("3");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("welcomee page is appeared")
	public void welcomee_page_is_appeared() {
		System.out.println("4");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("User enters user name")
	public void user_enters_user_name() {
		System.out.println("5");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@And("User enters password")
	public void user_enters_password() {
		System.out.println("6");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("7");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("8");
	}
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();



}
