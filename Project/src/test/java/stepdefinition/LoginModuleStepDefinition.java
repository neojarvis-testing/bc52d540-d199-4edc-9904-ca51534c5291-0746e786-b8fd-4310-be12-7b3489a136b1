package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomepageActionPage;

public class LoginModuleStepDefinition {

    HomepageActionPage actions = new HomepageActionPage();

    @Given("user navigates to the login page")
    public void user_navigates_to_the_login_page() {
        actions.navigateToLoginPage(Hooks.test);
    }

    @And("user navigates to the create account page")
    public void user_navigates_to_the_create_account_page() {
        actions.navigateToCreateAccountPage(Hooks.test);
    }

    @And("user creates a new account with {string}, {string} and {string}")
    public void user_creates_a_new_account_with_and(String firstname, String lastname, String password) {
        actions.createAccount(Hooks.test, firstname, lastname, password);
    }

    @And("user logs out from the application")
    public void user_logs_out_from_the_application() {
        actions.logout(Hooks.test);
    }

    @Then("Start to type your Then step here user logs in with an existing user using {string} and {string}")
    public void start_to_type_your_then_step_here_user_logs_in_with_an_existing_user_using_and(String loginEmail,
            String loginPassword) {
        actions.loginWithExistingUser(Hooks.test, loginEmail, loginPassword);
    }
}
