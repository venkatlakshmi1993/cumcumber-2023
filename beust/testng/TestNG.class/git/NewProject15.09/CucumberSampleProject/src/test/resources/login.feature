Feature: 

  Scenario Outline: validating login with valid username with vaild password
    Given user is in adactin loginpage with firefox browser
    When user enter username as "<name>" password as "<pass>" and click login
    And user go to search hotels
    And user select the hotel
    And Booked hotels as "<fstname>","<lstnme>","<ad>","<numb>","<type>","<month>","<year>"
    And again enters ccv data in booked itenary
      | ccv | 124 |
    Then user logout

    Examples: 
      | name     | pass   | fstname | lstnme  | ad                   | numb             | type | month | year |
      | manee123 | P1FGC5 | venkat  | lakshmi | D.no1234-nehrustreet | 2134567812345987 | VIsA |     4 | 2016 |
