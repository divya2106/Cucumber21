package p4;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef4 {
	@Given("User navigates to url")
	public void user_navigates_to_url() {
		System.out.println("Website opened");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@And("enters {string} and {string}")
	public void enters_and(String string, String string2) {
		System.out.println(string);
		System.out.println(string2);

	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("Click on the signup")
	public void click_on_the_signup() {
		System.out.println("SignedUp");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("welcomee page is appeared")
	public void welcomee_page_is_appeared() {
		System.out.println("Home page displayed");
		System.out.println("");

	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}



}
