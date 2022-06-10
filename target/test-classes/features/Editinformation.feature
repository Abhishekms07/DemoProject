
Feature: edit account information
Scenario Outline: sucessfull edit information with positive response
Given initilize browser with chrome
And navigate to "http://retailm1.upskills.in/account/account" site

Then Click on Edit your information
And enter <Telephone> and <Last name>
And click on continue
Then verify you get<Success: Your account has been successfully updated.>
And close the browser