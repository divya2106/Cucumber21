package p2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef2 {

@Given("User navigates to URL")
public void user_navigates_to_URL() {
	System.out.println("Test Me App");
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@And("Enter {string} and {int}")
public void enter_and(String username, Integer password) {
	System.out.println("UserName "+username);
	System.out.println("Password "+password);
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@When("Click on the signup button")
public void click_on_the_signup_button() {
	System.out.println("SignUp button ");
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Then("welcomee page is displayed")
public void welcomee_page_is_displayed() {
	System.out.println("Welcome page opened");

    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}



}
