@insurantData
Feature: Insurant Data
Scenario Outline: enters the insurant data
Given User already filled the vehicle data 
When User enters "<firstname>","<lastname>","<dateofbirth>","<StreetAddress>","<country>","<zipcode>","<city>","<occupation>"
Then System accepts the details of insurant data
Examples:
| firstname | lastname | dateofbirth  | streetaddress | country | zipcode | city  |  occupation | 
| tester    |    one   | 2/1/1970     | Magarpatta    | India   | 2200435 | Pune  |  Employee   |