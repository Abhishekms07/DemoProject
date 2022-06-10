Feature: Forgot Password

  Scenario Outline: Sucessfully forgot password with positive response
    Given initilize browser with chrome
    And navigate to "http://uniformm1.upskills.in" site
    And enter <E-mail address>
    And click on CONTINUE button
    Then close the browser
