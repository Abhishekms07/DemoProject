Feature: To test the changepassword functionality

Scenario: Sucessfull Change password with positive response
    Given initilize browser with chrome
    And navigate to "http://uniformm1.upskills.in" site
    And enter <E-mail address>,  <password>
    And Click on login 
    And Click on My Account
    And click password
    And enter <Password>, <Password Confirm>
    And click on continue
    And close the browser
