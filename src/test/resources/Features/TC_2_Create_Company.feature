Feature: Validate create company Page

  @First @Smoke @Reg
  Scenario: To validate create company page
  When Click on Create company button
  And User click on CreateNewJob Button
  And User enter jobname
  And User Select Priority
  And User select active
  And User select Onscreen
  And User Enter Valid Domain Name
  And User Enter Country code
    And Click on Submit Button
    And Click on Yes Button
    And Refresh the page
    And Click on AllButton
#    And Move the Orchestration Website Screen Down
#    And Move the Orchestration Website Screen Up

 @First @Smoke @Reg
  Scenario: Create Company with upload CSV
   Then User click on CreateNewJob Button
   And User enter jobname
   And User Select Priority
   And User select active
   Then Click On Browse Button
   And Upload File From Local Directory
   And Click on Submit Button
   And Click on Yes Button
   And Refresh the page
   And Click on AllButton
   And Download the Uploaded CSV