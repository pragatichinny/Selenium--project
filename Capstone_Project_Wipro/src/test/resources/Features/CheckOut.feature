Feature: validate checkout
Scenario: verify checkout functionalities
Given home page is open
When login the website
And  add item to cart
And click on cart
And  click on checkout
And fill billing address details
And click on continue for four times
And click on confirm order
Then order confirmed