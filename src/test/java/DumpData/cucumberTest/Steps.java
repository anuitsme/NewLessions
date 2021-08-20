package DumpData.cucumberTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	@Given("Open Chrome")
	public void open_chrome() {
	    System.out.println("Chrome Opened");
	    
	}

	@When("I enter username and valid password")
	public void i_enter_username_and_valid_password() {
		System.out.println("Username and password entered");
	   
	}

	@Then("Login must be successfull")
	public void login_must_be_successfull() {
		System.out.println("Login was successfull");
	    
	}

}
