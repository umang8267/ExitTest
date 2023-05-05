Feature: Verify the Action bar functionality is working

  @Test4
  Scenario: verifying that Display_SHOW_TITLE Button is working
    When user click on App button and then click Action bar Button
    Then user click in Display Options
    Then click on the Display_SHOW_TITLE Button
    Then user validate that button is hidden
    Then user click again Display_SHOW_TITLE Button
    Then user validate Title is visible again

  @Test5
  Scenario: verifying that toggle_navigation Button is working
    When click on AppButton and then click ActionBar Button
    Then click in Display Options
    Then click on the Navigation Button

  @Test7
  Scenario Outline: Set the password of emulator
    When user click on app button and then device Admin
    And open password quality Button
    Then click on set password and then select continue Without Fingerprint option
    Then user select the type of Unloacking like pin,pasword
    Then user enter the 4 digit password "<password>" and then click on next button
    Then user reenter password "<renterpassword>" then click on Ok Button and
    Then click on Done Button

    Examples: 
      | password | renterpassword |
      |     1111 |           1111 |
      |     1123 |           1123 |
 
