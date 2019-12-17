package p5;

import java.util.List;
import java.util.Map;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef5 {
	@Given("I want to give name")
	public void i_want_to_give_name(DataTable dt) {
	  /* List<Map<String, String>> list =dt.asMaps(String.class, String.class);
	   
	   for(int i=0;i<list.size();i++)
	   {
		  System.out.println(list.get(i).get("name"));
		  System.out.println(list.get(i).get("password"));

	   }*/
		
		List<String> list =dt.asList(String.class);
		   
		   for(int i=2;i<list.size();i++)
		   {
			  System.out.println(list.get(i));
			 // System.out.println(list.get(i).get("password"));

		   }
	   
	}

	@And("some other action")
	public void some_other_action() {
		System.out.println("user actions");
	    
	}

	@When("I complete action")
	public void i_complete_action() {
	    System.out.println("action completed");
	}

	@Then("I finish")
	public void i_finish() {
	System.out.println("finish");
	}
	



}
