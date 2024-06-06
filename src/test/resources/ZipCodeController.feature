Feature: the message can be retrieved
  Scenario: client makes call to GET zipcode
    When the client calls GET zipcode
    Then the client receives status code of 200
    And the client receives server version hello
