package Cucumber.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition {
	@Given("^This is my first step$")
	public void FirstStep() throws Throwable{
		System.out.println("First Step");
	}

	@When("^This is second step$")
	public void SecondStep() throws Throwable {
		System.out.println("Second Step");
	}

	@Then("^This is third step$")
	public void ThirdStep() throws Throwable {
		System.out.println("Third Step");
	}

}