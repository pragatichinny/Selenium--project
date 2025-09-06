Feature: validate MyAccount
Scenario: verify My Account functionalities
Given home page is opened in browzer
When login with credentials
And  click on my account
And click on orders
Then Orders informations should display