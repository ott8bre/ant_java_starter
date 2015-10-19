package features;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import it.ott8bre.HelloWorld;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class GreetSteps {
	HelloWorld manager;
 
	@Given("^I have made a program$")
	public void i_have_made_a_program() throws Throwable {
	    manager = new HelloWorld();
	}

	@When("^I run the program$")
	public void i_run_the_program() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	
	@Then("^I should get '(.+)'$")
	public void i_should_get(final String str) throws Throwable {
		String says = manager.greet();
		assertThat(str, equalTo(says));
	}
}