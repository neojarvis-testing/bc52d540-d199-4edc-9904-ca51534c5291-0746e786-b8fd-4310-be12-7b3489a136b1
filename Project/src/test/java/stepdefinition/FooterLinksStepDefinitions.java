package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.FooterActionPage;

public class FooterLinksStepDefinitions {

    FooterActionPage footerPage = new FooterActionPage();

    @Given("user  clicks on Register or Login")
    public void user_clicks_on_register_or_login() {
        footerPage.clickRegisterLogin(Hooks.test); 
    }

    @When("user clicks on Delivery Charges")
    public void userClicksOnDeliveryCharges() {
        footerPage.clickDeliveryCharges(Hooks.test); 
    }

    @When("user clicks on Payment Option")
    public void userClicksOnPaymentOption() {
        footerPage.clickPaymentOption(Hooks.test); 
    }

    @When("user clicks on FAQ")
    public void userClicksOnFAQ() {
        footerPage.clickFAQ(Hooks.test); 
    }

    @Then("user clicks on Return Policy")
    public void userClicksOnReturnPolicy() {
        footerPage.clickReturnPolicy(Hooks.test); 
    }
}