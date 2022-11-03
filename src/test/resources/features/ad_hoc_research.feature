@wip
Feature: Ad Hoc Research Web Page Automation

  Background:
    Given user is on the main page


  Scenario:
    When user hovers over the About Us module
    When user selects Executive Team
    When user scrolls down to Drop us a message section
    And user enters correct credentials, phone number, company name
    And user types in a message
    And user clicks on CONTACT US button
    Then the following message should be displayed "Thank you for your message. It has been sent."


  Scenario Outline:
    When user hovers over Solutions module
    And user selects each "<option>"
    Then user verifies he is on the correct page by verifying the "<title>" is displayed correctly
    Examples:
      | option                     | title                                        |
      | Cyber Analytics            | Cyber Analytics - Ad hoc Research            |
      | Cyber Experimentation      | Cyber Experimentation - Ad hoc Research      |
      | Modeling Simulation V&V    | Modeling Simulation V&V - Ad hoc Research    |
      | Test & Evaluation          | Test & Evaluation - Ad hoc Research          |
      | Big Data & Cyber Defense   | Big Data & Cyber Defense - Ad hoc Research   |
      | Tactical Network Emulation | Tactical Network Emulation - Ad hoc Research |


  Scenario:
    When user clicks on Careers module
    And user scrolls down to Open Positions
    And user enters "Network Technician" to job title input box
    And user selects "United States (5)" from the Country drop down
    And user clicks on search button
    And user clicks on Apply now button
    And user fills out all the information'
    And user uploads resume
    And user clicks on Submit your application button
    Then user should see the following message "Your application was successfully submitted."





