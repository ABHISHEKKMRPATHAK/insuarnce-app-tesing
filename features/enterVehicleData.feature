Feature: entering vehicle data for customers
@enteringVehicleData
Scenario Outline: customers entering vehicle data into the application
Given when the user in enter vehicle data window
When he enters "<make>","<model>","<cylindercapacity>","<engineperformance>","<dateofmanufacture>","<numberofseats>","<listprice>","<annualmileage>"
Then the system enter vehicle data it
Examples:
|  make |    model      | cylindercapacity | engineperformance | dateofmanufacture | numberofseats | listprice | annualmileage |
|  Audi |   Motorcycle  |       500        |         1000      |    01/20/2022     |      2        |   60000   |  30000        |

