#Check visa requirement for tourism from Russia to UK  -- DEMO Feature File
#Created By : Vimalnath N
#Creation Date: 02-Aug-2020
Feature: UK Tourism visa


  Scenario Outline: Visa requirement for tourism from Russia to UK
    Given I provide a nationality "<Nationality>"
    And I select the reason of "<Tourism>"
    And I state I am not travelling or visiting a partner or family
    When I submit form in portal
    Then I will be informed I need a visa to come to the UK
    Examples:
      |Nationality|Tourism|
      |russia      |tourism|
