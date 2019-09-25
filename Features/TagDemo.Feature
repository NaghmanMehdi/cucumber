@FunctionalTest

Feature: ECommerce Application
Scenario: HI
Given hello 


@SmokeTest 

Scenario: Successful Login

Given Yes

 

@RegressionTest

Scenario: UnSuccessful Login

Given NO

 

@SmokeTest

Scenario: Add a product to bag

Given YEEEEEEEEES

 

Scenario: Add multiple product to bag

Given YEEEEEEEEEEEEEES

 

@SmokeTest @RegressionTest

Scenario: Remove a product from bag

Given OK

 

@RegressionTest

Scenario: Remove all products from bag

Given OK_ALL

 

@SmokeTest

Scenario: Increase product quantity from bag page

Given This is a blank test

 

Scenario: Decrease product quantity from bag page

Given This is a blank test

 

@SmokeTest @End2End

Scenario: Buy a product with cash payment

Given This is a blank test

 

@SmokeTest @End2End

Scenario: Buy a product with CC payment

Given This is a blank test

 

@End2End

Scenario Outline: Payment declined

Given This is a blank test

Examples:

|PaymentMethod|

|CC Card|

|DD Card|

|Bank Transfer|

|PayPal|

|Cash|