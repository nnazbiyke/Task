Feature: Sing in Email
  @email
  Scenario: User on Home Page
    When Click on Почта button
    And Input field Email или Логин
    Then Click on Войти button
    And Send message from Yandex
    Then Click on Войти button
    When Input field name
    And Input field last name
    And Click Войти button
    And Input field generate password password
    Then Политика конфиденциальности и условия использования
    And Click Зарегистрироваться button

