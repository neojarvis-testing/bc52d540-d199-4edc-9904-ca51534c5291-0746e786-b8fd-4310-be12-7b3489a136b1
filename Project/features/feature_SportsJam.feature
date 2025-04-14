Feature: Racket Selection and Actions
 
  @Racket
  Scenario Outline: Perform racket selection and related actions
    Given The user is on the homepage
    When The user searches for "<searchTerm>"
    And The user applies a filter on racket selection
    And The user navigates to the clothing category
    And The user navigates to the accessories category
    And The user navigates to the running category
    Then The system should validate all performed actions
 
    Examples:
      | searchTerm |
      | ADIDAS    |


  @Racket_sports
    Scenario: Navigate to badminton rackets from the racket sports dropdown
    When the user hovers over the Racket Sports section in the navigation bar sees the Badminton Rackets option in the dropdown
    When the user sees the first product in the rackets list the user clicks on the first racket product
    And the user increases the quantity of the racket  the user clicks the Add to Cart button
    And the user enters the zip code "641001" in the input box after that user clicks the Check button
 

   @Racket_sports_back
    Scenario: Navigate back to the home page and shop badminton shoes
    Given user back to the home page hovers over the Racket Sports section nav bar user click on badminton shoes
    And  first product in the shoes list user clicks on the first shoe product selects a size after that clicks the Add to Cart button
    Then the user successfully adds the product to the cart also done a screenshot for it
 

    @sports_clothing
    Scenario: Navigating to sportswear section
    When  the user is on the website homepage hovers over the Racket Sports category in the nav bar clicks the shop sportswear
    And the user is on the listing view page of products  hovers over a product in the listing view
    And the user clicks on the product to view details selects two products to compare
    And the user clicks on the Compare button sees the comparison of the selected products
    And after selected products should be removed from the cart lists
    Then capturing the removed products screenshots when empty

    Scenario Outline: Clicking the Team Sport sub modules
      Given user is on the Homepage 
      And user is clicking the TEAM Sport
      And user is clicking the all modules of the Protective Gear 
      When user is clicking the Batting Gloves 
      And user is navigating back to the home page for the further clicking 
      Then user is clicking all over modules of the Protective Gear


    Scenario Outline: Clicking the NavBar Fitness Sub Modules
        Given user is on the Navpage
        When user is clicking the NavBar Fitness 
        And user is on the fitness module and clicking the GYM Accessories
        Then user is on the Gym gloves and clicking the product and view cart

    
    Scenario Outline: Create account and login 
        Given user navigates to the login page
        And user navigates to the create account page
        And user creates a new account with "<firstname>", "<lastname>" and "<password>"
        And user logs out from the application
        Then Start to type your Then step here user logs in with an existing user using "<loginEmail>" and "<loginPassword>"

        Examples:
          | firstname | lastname | password       | loginEmail            | loginPassword |
          | John      | Wick     | Password@12345 | test134@gmail.com     | test140@ga    |

    
    Scenario: Verify all footer links
        Given user  clicks on Register or Login
        And user clicks on Delivery Charges
        And user clicks on Payment Option
        And user clicks on FAQ
        Then user clicks on Return Policy
 
    
    Scenario: Verify social media links in the footer
        Given user clicks on Facebook
        And user clicks on YouTube
        And user clicks on Instagram
        And user clicks on Twitter
 
    Scenario Outline: Validate Brand Page and User Actions
        Given the user verifies the homepage URL
        When the user searches for "<searchTerm>"
        Then the search results for Puma are displayed
        When the user lists all products
        Then the product details are validated
        When the user enters login credentials "<email>" and "<password>"
        Then an error message "<errorMessage>" is displayed
 
    Examples:

      | email              | password     | errorMessage                                                                                                | searchTerm |
      | test134@gmail.com  | test140@ga   | The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later. | Puma       |

 
    Scenario: Hover over Shoes category
        Given the user is on the homepage
        When the user hovers over the Shoes category
        Then the Shoes category dropdown is displayed
        Then the user Again hovers over the Shoes category
        Then the user clicks on the Badminton option
        Then the user hovers on shoes and clicks on the Basketball option
        Then the user hovers on shoes clicks on the Cricket option
        Then the user clicks on the Football option
        Then the user clicks on the Running option
        Then the user clicks on the Squash option



 