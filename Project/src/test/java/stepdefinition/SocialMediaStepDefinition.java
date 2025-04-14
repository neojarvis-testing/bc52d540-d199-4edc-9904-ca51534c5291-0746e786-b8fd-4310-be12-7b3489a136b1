package stepdefinition;
 
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.FooterActionPage;
 
public class SocialMediaStepDefinition {
 
    FooterActionPage footerPage = new FooterActionPage();
 
    @Given("user clicks on Facebook")
    public void userClicksOnFacebook() {
        footerPage.clickFacebook(Hooks.test);
    }
 
    @And("user clicks on YouTube")
    public void userClicksOnYoutube() {
        footerPage.clickYoutube(Hooks.test);
    }
 
    @And("user clicks on Instagram")
    public void userClicksOnInstagram() {
        footerPage.clickInstagram(Hooks.test);
    }
 
    @And("user clicks on Twitter")
    public void userClicksOnTwitter() {
        footerPage.clickTwitter(Hooks.test);
    }
}
 