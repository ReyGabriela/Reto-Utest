# Autor: Gabriela Rey
@stories
Feature: utest
  As a user, I want to register in the web page as a new user.
  @scenario1
  Scenario Outline: You are singing up to Utest.com
    Given that gabriela wants to sign up to utest
    When she clicks the JoinToday button
    And she introduces the personal data
    | strFirstName      | strLastName   |   strEmailAddress    |  strMonth  |  strDay  |  strYear   |  strUserLanguage  | strCity  |  strZipPostalCode  |  strCountry  | strComputer | strVersion |  strComputerLanguage  |  strMobileDevice  |  strModel   |  strMobileOs  |strPassword  |
    |  <strFirstName>   | <strLastName> |   <strEmailAddress>  | <strMonth> | <strDay> |  <strYear> | <strUserLanguage> | <strCity> | <strZipPostalCode> | <strCountry> | <strComputer> | <strVersion> | <strComputerLanguage> | <strMobileDevice> | <strModel> | <strMobileOs> |<strPassword> |
    Then the registration is complete
      |                       strSuccessfulSignUpMessage                         |
      | Welcome to the world's largest community of freelance software testers!  |
    Examples:
      | strFirstName | strLastName |   strEmailAddress    | strMonth | strDay | strYear  | strUserLanguage  |strCity | strZipPostalCode | strCountry|strComputer | strVersion |  strComputerLanguage  |  strMobileDevice  |  strModel   |  strMobileOs  |strPassword   |
      |   Gabriela  |  Rey| gabrielareyrincon1@gmail.com  |      February      |      19     |     2001      |     Spanish      |  Villavicencio |500003     |  Colombia   |    Windows    |      10      |    Spanish            |   Huawei          | Y9 Prime (2019)| Android 10 |Contrasena.1!  |
