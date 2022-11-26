@tag
Feature: Flight Manifest Json value verification

  @manifest
  Scenario Outline: Title of your scenario outline
    Given I want to trigger <apiType> api from <module> module
    When I check for the status code <statusCode> in response
    Then I verify the <name>,<short_name> and <description> in response

    Examples: 
      | apiType  | module | statusCode | name      | short_name | description                                                        |
      | manifest | flight |        200 | Almosafer | Almosafer  | Book Family Friendly Hotels & Compare hotels prices with Almosafer |
