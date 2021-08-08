# Autor: Margoth
@stories
Feature: Community Utest
  as a user, I want to join with a new user and be in the utest community tester
  @scenario1
  Scenario: Join as new user
    Given than brandon wants to join to utest

    When he clic on Join Today option
      |strJoin|strFirstName|strLastName|strEmail|strBirthM|strBirthD|strBirthY|strZip|strDevice|strModel|strOS|strPass|strConfirmPass|
      |Join Today|Margoth A|Del R |2491margoth@gmail.com| number:11|number:24|number:1991|123|Samsumg|Galaxy A71|Android 11|Panam@2021|Panam@2021|
    Then he create a new user
      | strJoin               |
      | Join Today  |