package stepdefinition;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

import pages.NavBarActionPage;

public class NavBarFitnessStepDefinition {

    NavBarActionPage actionPage = new NavBarActionPage();

    @Given("user is on the Navpage")
    public void user_is_on_the_Navpage() {
        actionPage.NavBar_Fitness(Hooks.test);
    }

    @When("user is clicking the NavBar Fitness")
    public void user_is_clicking_the_nav_bar_fitness() {
        actionPage.Gym_Gloves(Hooks.test);
    }

    @When("user is on the fitness module and clicking the GYM Accessories")
    public void user_is_on_the_fitness_module_and_clicking_the_gym_accessories() {
        actionPage.add_to_cart(Hooks.test);
    }

    @Then("user is on the Gym gloves and clicking the product and view cart")
    public void user_is_on_the_gym_gloves_and_clicking_the_product_and_view_cart() {
        actionPage.checkout(Hooks.test);
    }

}
