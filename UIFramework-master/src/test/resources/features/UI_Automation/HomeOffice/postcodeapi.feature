#Check the response code for Postcode API -- DEMO Feature File
#Created By : Vimalnath N
#Creation Date: 02-Aug-2020
Feature: Query a postcode and receive a 200 response


  Scenario Outline: Query a postcode and receive a 200 response
    Given I send a query to post code api "<url>"
    Then I will get a successful response code
    Examples:
      |url|
      |https://api.postcodes.io/postcodes/SW1P4JA      |

