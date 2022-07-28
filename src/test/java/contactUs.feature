Feature: Contact Us Test

  Scenario: Go to website and test Contact us Page
    Given navigate to website
    And type email
    And type password
    When click on send button
    Then verify success message