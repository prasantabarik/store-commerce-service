Feature: Test Template Service

  Scenario: Test Get Offer By Id
    Given I call /store/1001
    And I set Content-Type header to application/json
    When Send a GET HTTP request
    Then response code should be 200
    And cluster is 522

