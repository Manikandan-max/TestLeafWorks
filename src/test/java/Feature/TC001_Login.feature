Feature: LeafTaps Login Functionality
  Scenario: Login with Positive Credentials
    Given Launch the browser
    And Load the url
    And Enter the Username as 'demoSalesManager'
    And Enter the Password as 'crmsfa'
    When click on the login Button
    Then WelcomePage is Displayed
  Scenario: Login with Negative Credentials
    Given Launch the browser
    And Load the url
    And Enter the Username as 'demos'
    And Enter the Password as 'csmdf'
    When click on the login Button
    But Error Message is Displayed
