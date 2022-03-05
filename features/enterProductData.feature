@productData
Feature: Product Data
Scenario Outline: enter  the product data
Given User already filled the insurant data
When Users enters "<startdate>","<insurancesum>","<damageInsuranceSum>"
Then System accepts the details of product and navigates forward
Examples:
|   startdate  |  insurancesum |damageInsuranceSum   |  
|  09/07/2022  | 5.000.000,00  |Partial Coverage     |  
