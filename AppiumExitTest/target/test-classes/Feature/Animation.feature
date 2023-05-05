Feature: Verify the animation functionality is working

  @Test1
  Scenario: verifying that hideing and showing Button is working
    When the user click on animation button and then click hide animation Button
    Then user click in hideBtn
    Then click on the below buttons one by one
    Then click on the show animation

  @Test2
  Scenario: verifying that flip functionaliy working or not
    When the user click on the view flip button
    Then the user come at View flip page and then click on the flip button

  @Test3
  Scenario: verifying that Animation/Loading is working
    When the user click on the Loading button
    Then the user come on Loading page then click on run
