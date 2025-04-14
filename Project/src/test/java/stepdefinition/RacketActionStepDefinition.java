package stepdefinition;
 
import com.aventstack.extentreports.Status;
 
import io.cucumber.java.en.*;
import pages.RacketActionPage;
import utils.ExcelFileReader;
import utils.ReadProperties;
 
public class RacketActionStepDefinition {
 
    RacketActionPage racketPage = new RacketActionPage();
    String path = ReadProperties.prop.getProperty("path");
 
    @Given("The user is on the homepage")
    public void user_is_on_homepage() {
        Hooks.test.info(ExcelFileReader.readExcelData(path, "Harshit", 4, 0));
    }
 
    @When("The user searches for {string}")
    public void user_searches_for_racket(String searchTerm) {
        Hooks.test.info("User searches for: " + searchTerm);
        racketPage.selectRacket(Hooks.test);
    }
 
    @And("The user applies a filter on racket selection")
    public void user_applies_racket_filter() {
        racketPage.applyFilter(Hooks.test);
    }
 
    @And("The user navigates to the clothing category")
    public void user_navigates_to_clothing() {
        racketPage.selectClothing(Hooks.test);
    }
 
    @And("The user navigates to the accessories category")
    public void user_navigates_to_accessories() {
        racketPage.selectAccessories(Hooks.test);
    }
 
    @And("The user navigates to the running category")
    public void user_navigates_to_running() {
        racketPage.selectRunning(Hooks.test);
    }
 
    @Then("The system should validate all performed actions")
    public void validate_all_actions() {
        racketPage.verifyRunningSelection(Hooks.test);
        Hooks.test.log(Status.PASS,ExcelFileReader.readExcelData(path, "Harshit", 5, 0));
    }
}
 
 