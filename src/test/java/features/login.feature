Feature: Account login information

  Scenario Outline: sucessfull Account login with positive response
    Given initilize browser with chrome
    And navigate to "http://uniformm1.upskills.in" site
    And enter <E-mail address>,  <password>
    And Click on login 
    And click on continue
     And close the browser

     