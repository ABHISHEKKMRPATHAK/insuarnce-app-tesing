@homePage
Feature: Functioning of links in Homepage
@requestDemo
Scenario: User wants to request demo
Given User is in. home page of the application
When User clicks on request demo option
Then Sytem navigates to request demo page 
@visitSupport
Scenario: User wants to visit support
Given User ..already is in homepage
When User clicks on visit support
Then System should navigates to visit support page 
@searchSupport
Scenario: User wants to search support
Given user is in .homepage
When User inputs the string and click enter on search support
Then system should display lists of suppports available regarding the input given by user
@buyautomobileinsurance
Scenario: Users wants to buy automobile insurance
Given user ,already is in homepage
When User clicks on automobiles
Then System should navigates to automobile window for entering data
@buymotorcycleinsurance
Scenario: Users wants to buy motorcycle insurance
Given user ualready is in homepage
When User clicks on Motorcycle
Then System should navigates to motorcyle window for entering data
@buytruckinsurance
Scenario: Users wants to buy truck insurance
Given user is already is in homepage
When User clicks on truck
Then System should navigates to truck window for entering data
@buycamperinsurance
Scenario: Users wants to buy camper insurance
Given user ialready is in homepage
When User clicks on camper
Then System should navigates to camper window for entering data

 
