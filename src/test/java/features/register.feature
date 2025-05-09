Feature: Stress test chat
  As a user i send messages

  Scenario Outline: User sends a message
    Given Chat application page is displayed
    And I register with username "<username>"
    Then I send a message "Stress test from <username>"

    Examples:
      | username      |
      | PhantomUser1  |
      | PhantomUser2  |
      | PhantomUser3  |
      | PhantomUser4  |
