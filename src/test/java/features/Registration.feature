Feature: Registration

  Scenario: Registration
    Given User has open page "My Store"
    When User in page header clicks link 'Sign up'
    Then System opens 'Authentication' page
    When User on 'Authentication' page in 'Create an account' from types 'email' in input field 'Email address'
    And User on 'Authentication' page in 'Create an account' from clicks button 'Create an account'
    Then System opens 'Create an Account' page
    When User on 'Create an Account' page on "Your personal information" form chooses "Mr." radiobutton
    And User on 'Create an Account' page on "Your personal information" form types "John" in input field "First name"
    And User on 'Create an Account' page on "Your personal information" form types "Smith" in input field "Last name"
    And User on 'Create an Account' page on "Your personal information" form types "12345" in input field "Password"
    And User on 'Create an Account' page on "Your personal information" form in 'Date of Birth' parameter in combobox "Day" choose "1"
    And User on 'Create an Account' page on "Your personal information" form in 'Date of Birth' parameter in combobox "Month" choose "January"
    And User on 'Create an Account' page on "Your personal information" form in 'Date of Birth' parameter in combobox "Year" choose "2000"
    And User on 'Create an Account' page on "Your personal information" form set checkbox "Sign up for our newsletter!"
    And User on 'Create an Account' page on "Your address" form types "John" in input field "First name"
    And User on 'Create an Account' page on "Your address" form types "Smith" in input field "First name"
    And User on 'Create an Account' page on "Your address" form types "Google LLC." in input field "Company"
    And User on 'Create an Account' page on "Your address" form types "1600 Amphitheatre Parkway" in input field "Address"
    And User on 'Create an Account' page on "Your address" form types "Mountain View" in input field "City"
    And User on 'Create an Account' page on "Your address" form in combobox "State" choose "California"
    And User on 'Create an Account' page on "Your address" form types "94043" in input field "Zip/Postal Code"
    And User on 'Create an Account' page on "Your address" form types "No additional info" in text area "Additional information"
    And User on 'Create an Account' page on "Your address" form types "0800 328 6081" in input field "Mobile phone"
    And User on 'Create an Account' page clicks on button 'Register'
    Then System opens 'My account' page

