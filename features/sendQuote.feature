@sendQuote
Feature: Send the quote
Scenario: user wants to send the quote
Given User fills the vehicle data,insurant data ,product and selects a price option 
When user wants to confirms the all the filled data
Then quote is sent to user's mail

