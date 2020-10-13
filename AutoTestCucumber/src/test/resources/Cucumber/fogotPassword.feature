Feature: Fogot passWord
#Issue 1
  Scenario: The message is showed when email is blank
    Given The homepage is showed
    When The email is blank
    Then The message "Required" is showed

  #Issue 2
  Scenario: The message is showed with email invalid
    Given The homepage is showed
    When The email input is "huong.gmail.com"
    Then The message is showed "Not a valid email"

  #Issue 3
  Scenario: The message is showed email input is valid and move the homepage
    Given The homepage is showed
    When The email input is "support@gmail.com"
    Then The message "An email has been sent to your email address.Open the e-mail and select a link to reset your password" is showed


