@tag
Feature: Hotel Search Functionality
  As a user i should able to search the hotels

  @tag2 @run
  Scenario Outline: Hotel Search
    Given User provide <nearme>,<city>,<checkin>,<checkout>,<adultsCount> and <placeId> with Api type as <apiType> and module as <module>
    Then User verify status code as 200

    Examples: 
      | nearme | city  | checkin | checkout | adultsCount | placeId                     | apiType      | module |
      | false  | Dubai | +12     | +15      |           2 | ChIJRcbZaklDXz4RYlEphFBu5r0 | hotel_search | hotel  |
      | false  | Dubai | +0      | +15      |           2 | ChIJRcbZaklDXz4RYlEphFBu5r0 | hotel_search | hotel  |
      | false  | Dubai | +11     | +19      |           3 | ChIJRcbZaklDXz4RYlEphFBu5r0 | hotel_search | hotel  |
