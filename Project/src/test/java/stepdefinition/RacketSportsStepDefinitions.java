package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomepageActionPage;
import io.cucumber.java.en.Then;

public class RacketSportsStepDefinitions {
    HomepageActionPage actionPage = new HomepageActionPage();

    @When("the user hovers over the Racket Sports section in the navigation bar sees the Badminton Rackets option in the dropdown")
    public void the_user_hovers_over_the_racket_sports_section_in_the_navigation_bar_sees_the_badminton_rackets_option_in_the_dropdown() {
        actionPage.rackethoverclick(Hooks.test);
    }

    @When("the user sees the first product in the rackets list the user clicks on the first racket product")
    public void the_user_sees_the_first_product_in_the_rackets_list_the_user_clicks_on_the_first_racket_product() {
        actionPage.clickingfirstProduct(Hooks.test);
    }

    @When("the user increases the quantity of the racket  the user clicks the Add to Cart button")
    public void the_user_increases_the_quantity_of_the_racket_the_user_clicks_the_add_to_cart_button() {
        actionPage.increasingquantingplus(Hooks.test);
    }

    @When("the user enters the zip code {string} in the input box after that user clicks the Check button")
    public void the_user_enters_the_zip_code_in_the_input_box_after_that_user_clicks_the_check_button(String string) {
        actionPage.enteringthezipcoderequired(Hooks.test, string);
    }

    @Given("user back to the home page hovers over the Racket Sports section nav bar user click on badminton shoes")
    public void user_back_to_the_home_page_hovers_over_the_racket_sports_section_nav_bar_user_click_on_badminton_shoes() {
        actionPage.navigateBackHomeUrl(Hooks.test);
    }

    @Given("first product in the shoes list user clicks on the first shoe product selects a size after that clicks the Add to Cart button")
    public void first_product_in_the_shoes_list_user_clicks_on_the_first_shoe_product_selects_a_size_after_that_clicks_the_add_to_cart_button() {
        actionPage.clicksshoeproductadd(Hooks.test);
    }

    @Then("the user successfully adds the product to the cart also done a screenshot for it")
    public void the_user_successfully_adds_the_product_to_the_cart_also_done_a_screenshot_for_it() {
        actionPage.screenshotofthecart(Hooks.test);
    }
}
