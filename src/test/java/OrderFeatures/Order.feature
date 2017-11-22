@all @order @smoke @regression
Feature: ODH:Verify by creating an order

Scenario: Create order

Given Homepage
And naviagte to order department
And select the category
Then verify the specific category page is displayed
And add an item to the cart
And navigate to the cart page
And click on process order now
Then verify order is created


