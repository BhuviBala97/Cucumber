Feature: Hotel Booking In Adactin Application
@smokeTest
Scenario: user login the web Application
Given user launch the application
When user enter the username in username field
And user enter the password in password field
Then user click on login button and it navigates the search hotel page
@sanityTest
Scenario: user to fill all the fields in search hotel page
When user Select the location in location fields
And user Select the hotels in hotels fields
And user Select the Room Type in Room Type fields  
And user Select the Number of Rooms in Number of Rooms fields
And user enter the Check In Date in Check In Date fields
And user enter the Check Out Date in Check Out Date fields
And user Select the Adults per Room in Adults per Room fields
And user Select the Children per Room in Children per Room fields 
Then user click on the search button it navigates the select hotel page
@WhiteboxTest
Scenario: user Select the hotel in Select hotel page
Then user click on the select button
Then user click on the continue button and it navigates the Book hotel page
@blackboxTest
Scenario: user to fill all the fields in Book A hotel page
When user Enter the first name in First name fields
And user Enter the last name in last name fields
And  user Enter the billing address in address fields
And user Enter the 16 digit Credit card number in credit card no fields
And user 	Select the credit card Type in credit card type fields
And user Select the Month in Expiry Date fields
And user Select the  year in Expiry Date fields
And user Enter the CVV number in Cvv number fields
Then user click on the book now button Its take some time and its navigates to Booking conformation Page
@RegressionTest
Scenario: user Check the all information is correct or not  
When user will use the implicit wait for refresh page 
Then  user click on the logout button then It navigates the Home page

