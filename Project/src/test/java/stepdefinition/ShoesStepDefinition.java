package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ShoesActionPage;
 
public class ShoesStepDefinition {
   
    ShoesActionPage shoes = new ShoesActionPage();
 
    @Given("the user is on the homepage")
public void the_user_is_on_the_homepage() {
    shoes.verifyHomepage() ;
   
}
@When("the user hovers over the Shoes category")
public void the_user_hovers_over_the_shoes_category() {
    shoes.hoveroverShoes(Hooks.test);
   
}
@Then("the Shoes category dropdown is displayed")
public void the_shoes_category_dropdown_is_displayed() {
    shoes.verifySubCategory() ;
   
}
@Then("the user Again hovers over the Shoes category")
public void the_user_again_hovers_over_the_shoes_category() {
    shoes.clickBadmintoninMensecandVerify(Hooks.test);
   
}
@Then("the user clicks on the Badminton option")
public void the_user_clicks_on_the_badminton_option() {
   
   shoes.clickBadmintoninMensecandVerify(Hooks.test);
}
@Then("the user hovers on shoes and clicks on the Basketball option")
public void the_user_hovers_on_shoes_and_clicks_on_the_basketball_option() {
    shoes.hoverShoesandclickBasketBallandVerify(Hooks.test);
   
   
}
@Then("the user hovers on shoes clicks on the Cricket option")
public void the_user_hovers_on_shoes_clicks_on_the_cricket_option() {
 
    shoes.clickCricketandverify(Hooks.test);
}
@Then("the user clicks on the Football option")
public void the_user_clicks_on_the_football_option() {
    shoes.hoverShoesandClickOnFootball(Hooks.test);
   
}
@Then("the user clicks on the Running option")
public void the_user_clicks_on_the_running_option() {
    shoes.hoverShoesAndclickRunningandverify(Hooks.test);
   
}
@Then("the user clicks on the Squash option")
public void the_user_clicks_on_the_squash_option() {
    shoes.hoverShoesandclickSquashandVerify(Hooks.test);
   
}
 
}
