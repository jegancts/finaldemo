#Check visa requirement for tourism from Russia to UK  -- DEMO Feature File
#Created By : Vimalnath N
#Creation Date: 02-Aug-2020
Feature: UK Tourism visa from Japan


  Scenario Outline: Visa requirement for tourism from Japan to UK
    Given I provide the nationality of japan "<Nationality>"
    And I select a reason "<Tourism>"
    When I submit a form for tourist
    Then I will be informed You wont need visa to come to UK
    Examples:
      |Nationality|Tourism|
      |Japan      |tourism|
