package stepdefinition;
 
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomepageActionPage;
 
public class TeamsportsStepdefintions3 {
    HomepageActionPage actionPage1 = new HomepageActionPage();
 
    @When("the user is on the website homepage hovers over the Racket Sports category in the nav bar clicks the shop sportswear")
    public void the_user_is_on_the_website_homepage_hovers_over_the_racket_sports_category_in_the_nav_bar_clicks_the_shop_sportswear() {
        actionPage1.hoversportsandsports(Hooks.test);
    }
 
    @When("the user is on the listing view page of products  hovers over a product in the listing view")
    public void the_user_is_on_the_listing_view_page_of_products_hovers_over_a_product_in_the_listing_view() {
        actionPage1.listingviewcompare(Hooks.test);
    }
 
    @When("the user clicks on the product to view details selects two products to compare")
    public void the_user_clicks_on_the_product_to_view_details_selects_two_products_to_compare() {
        actionPage1.twoproductsComparing(Hooks.test);
    }
 
    @When("the user clicks on the Compare button sees the comparison of the selected products")
    public void the_user_clicks_on_the_compare_button_sees_the_comparison_of_the_selected_products() {
        actionPage1.compareButFirsttwo(Hooks.test);
 
    }
 
    @When("after selected products should be removed from the cart lists")
    public void after_selected_products_should_be_removed_from_the_cart_lists() {
        actionPage1.removingProducts(Hooks.test);
    }
 
    @Then("capturing the removed products screenshots when empty")
    public void capturing_the_removed_products_screenshots_when_empty() {
        actionPage1.afterremoveScreenshot(Hooks.test);
    }
}
 
 