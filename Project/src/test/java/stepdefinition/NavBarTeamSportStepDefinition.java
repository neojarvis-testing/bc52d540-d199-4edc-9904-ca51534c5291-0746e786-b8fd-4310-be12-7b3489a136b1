package stepdefinition;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NavBarActionPage;
 
public class NavBarTeamSportStepDefinition {
    NavBarActionPage actionPage = new NavBarActionPage();
   
    @Given("user is on the Homepage")
    public void user_is_on_the_homepage() {
        actionPage.NavBar_Batting_Gloves(Hooks.test);
    }
 
    @Given("user is clicking the TEAM Sport")
    public void user_is_clicking_the_team_sport() {
        actionPage.NavBar_Batting_Leg_Guards(Hooks.test);
 
    }
 
    @Given("user is clicking the all modules of the Protective Gear")
    public void user_is_clicking_the_all_modules_of_the_protective_gear() {
        actionPage.NavBar_Wicket_Keeping_Gloves(Hooks.test);
    }
 
    @When("user is clicking the Batting Gloves")
    public void user_is_clicking_the_batting_gloves() {
        actionPage.NavBar_Wicket_Keeping_Leg_Guards(Hooks.test);
    }
 
    @When("user is navigating back to the home page for the further clicking")
    public void user_is_navigating_back_to_the_home_page_for_the_further_clicking() {
        actionPage.NavBar_Cricket_Helmets(Hooks.test);
    }
 
    @Then("user is clicking all over modules of the Protective Gear")
    public void user_is_clicking_all_over_modules_of_the_protective_gear() {
        actionPage.NavBar_Inner_Thigh_Pads(Hooks.test);
    }
 
}
 
 