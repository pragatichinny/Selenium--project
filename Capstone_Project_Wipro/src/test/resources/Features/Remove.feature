Feature: validate remove item from cart
Scenario: verify cart
Given open home page
When add any item to cart
And  click on cart icon
And click on remove
Then item should be removed from cart