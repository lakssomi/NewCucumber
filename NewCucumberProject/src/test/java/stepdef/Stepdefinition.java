package stepdef;

import java.util.Random;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {

	String[] countries = { "China", "Egypt", "France", "Germany", "India", "Japan", "Kenya", "Mexico", "United Kingdom",
			"United States" };
	String[] capitols = { "Beijing", "Cairo", "Paris", "Berlin", "New Delhi", "Tokyo", "Nairobi", "Mexico City",
			"London", "Washington D.C" };
	String[] languages = { "Chinese", "Arabic", "French", "German", "Hindi", "Japanese", "Swahili", "Spanish",
			"English", "English" };
	int index;

	@Given("user initialiize four arrays with list")
	public void user_initialiize_four_arrays_with_list() {
		String[] countries = { "China", "Egypt", "France", "Germany", "India", "Japan", "Kenya", "Mexico",
				"United Kingdom", "United States" };
		String[] capitols = { "Beijing", "Cairo", "Paris", "Berlin", "New Delhi", "Tokyo", "Nairobi", "Mexico City",
				"London", "Washington D.C" };
		String[] languages = { "Chinese", "Arabic", "French", "German", "Hindi", "Japanese", "Swahili", "Spanish",
				"English", "English" };

		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("user gives a random index number")
	public void user_gives_a_random_index_number() {
		Random ran = new Random();

		index = ran.nextInt(countries.length);
		System.out.println(index);

		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("print corresponding items")
	public void print_corresponding_items() {
		System.out.println((countries[index]));
		System.out.println((capitols[index]));
		System.out.println((languages[index]));

		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
