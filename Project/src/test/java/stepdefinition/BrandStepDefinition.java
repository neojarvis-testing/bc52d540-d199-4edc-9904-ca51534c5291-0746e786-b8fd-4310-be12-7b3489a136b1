package stepdefinition;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

import pages.BrandActionPage;



public class BrandStepDefinition {



    BrandActionPage brand = new BrandActionPage();



    @Given("the user verifies the homepage URL")

public void the_user_verifies_the_homepage_url() {

    brand.verifyHomepageandclickOnBrands(Hooks.test);

}



@When("the user searches for {string}")

public void the_user_searches_for(String string) {



    brand.verifyBrandPageandTypePuma("Puma");

}

@Then("the search results for Puma are displayed")

public void the_search_results_for_puma_are_displayed() {

    brand.clickNextAndverifySearchResults(Hooks.test);



}

@When("the user lists all products")

public void the_user_lists_all_products() {

    brand.verifyBrandpagelistingallproducts(Hooks.test);

   

}

@Then("the product details are validated")

public void the_product_details_are_validated() {

    brand.clickAccessoriesandverifyUpdate();

    brand.hoveroverproductandclickQuickView();

    brand.verifyandclickWishList(Hooks.test);

    brand.verifypromt(Hooks.test);

   

}

@When("the user enters login credentials {string} and {string}")

public void the_user_enters_login_credentials_and(String email, String pass) {

    brand.logincredentials(email, pass);

}

@Then("an error message {string} is displayed")

public void an_error_message_is_displayed(String string) {

    brand.signInAndverifyerrorMessage(Hooks.test);

   

}

}





 