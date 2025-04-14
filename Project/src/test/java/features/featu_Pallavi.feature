Feature: Footer

@scenario1
  Scenario: Verify all footer links
    Given user  clicks on Register or Login
    And user clicks on Delivery Charges
    And user clicks on Payment Option
    And user clicks on FAQ
    Then user clicks on Return Policy

@scenario2
  Scenario: Verify social media links in the footer
    Given user clicks on Facebook
    And user clicks on YouTube
    And user clicks on Instagram
    And user clicks on Twitter