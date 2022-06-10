Feature: Register new account
Scenario Outline: sucessfull registration with positive response
Given initilize browser with chrome
And navigate to "http://uniformm1.upskills.in/index.php?route=account/register" site
And Click on Register link in home page to land on Register account page
And  user enters <first name>,<last name> ,<email>,<telephone> ,<address1>,<address2>,<City>,<Postal code>,<Country>,<Region> ,<state> ,<password> ,<confirm password> 
And Click on yes or no
And Click on  I have read and agree to the Privacy Policy
And Click on continue
Then verify that user sucessfully regestried the account
And close the browser
