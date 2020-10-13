Feature: Login Euroland
  #Issue 1
  Scenario: Show message when login email, username is invalid
    Given The homepage is showed
    When The user input with email "huongnt.gmail.com" is invalid
    Then The message "Required" is showed
    #Issue 2
  Scenario: The messae is showed when userName is blank
    Given The homepage is showed
    When The user input password "12356"
    Then The message "Required" is showed
  #Issue 3
  Scenario: The message is showed when user, password are blank
    Given The homepage is showed
    When User, Pass are blank
    Then The message "Required" is showed
  #Issue 4
  Scenario: The Customer Interface 2 will show for valid credential.
    Given The homepage is showed
    When The user input user "support@gmail.com" and passWord "12356"
    Then The Customer Interface 2 will showed
