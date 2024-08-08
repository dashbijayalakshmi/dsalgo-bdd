
Feature:  Verify Registion for https://dsportalapp.herokuapp.com 
 

  Scenario: TC01_ Verfying  Valid Register credentials 
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User  clicks on Register
   And User enters valid username as "seena"
   And User enters password as "asdf@1234"
   And User enters password confirmation as "asdf@1234"
   And User should clicks on verification Register
   And Homepage should be displayed with text "NumpyNinja"
   Then User clicks on Logout
   
   
   
 # Scenario: TC02_Verfying  Invalid Register credentials
  # Given  Request base url is "https://dsportalapp.herokuapp.com"
   #When User clicks on Get Started
 #  And Homepage should be displayed with text "NumpyNinja"
  # And User  clicks on Register
   #And User enters vaild username as "ruby"
  # And User enters password as "ruby@123"
  # And User enters password confirmation as "ruy@234"
 #  And User should click on verification Register
 #  Then Mismatch label should be displayed with text "password_mismatch:The two password fields didn’t match." 