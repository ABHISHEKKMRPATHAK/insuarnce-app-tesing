@SendQuotefunctions
Feature: Functions available in Send Quote Page
@RedirecToHomepage
Scenario: user wants to naviagte to homepage after buying one motorcycle insurance
Given User bought a motorcycle insurance
When User clicks on main page
Then system moves to main page 

@anotherMotorcycleInsurance
Scenario: user wants to buy another motorcyle insurance after buying one motorcycle insurance
Given User alraedy bought a motorcycle insurance
When User clicks on Motorcycle Insurance
Then system again show form to fill data for motorcycle

@anotherAutomobileInsurance
Scenario: user wants to buy automobile insurance after buying one motorcycle insurance
Given User is in send quote page of motorcycle insurance
When User clicks on Automobile Insurance
Then System to be show form for filling automobile data

@anotherTruckInsurance
Scenario: user wants to buy  truck insurance after buying one motorcycle insurance
Given User filled and sent the data for one of the insurance and in the send quote page
When user clicks on Truck insurance
Then System to display form for entering data of truck

@anotherCamperInsurance
Scenario: user wants to buy  camper insurance after buying one motorcycle insurance
Given User bought a insurance and wants to buy a camper insurance
When User clicks on Camper Insurance
Then System to show form for filling details of the truck 

