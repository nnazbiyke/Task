package stepDefs;

import dataProviders.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.EmailPage;
import utils.Driver;

public class EmailPageStepDefs {
    EmailPage emailPage = new EmailPage();

    @When("Click on Почта button")
    public void click_on_почта_button() {
        Driver.getDriver().get(ConfigReader.getProperty("environment"));
        emailPage.emailButtonClick();
        
    }
    @When("Input field Email или Логин")
    public void input_field_email_или_логин() {
       emailPage.loginOrEmailInputSendKeys();
        
    }
    @Then("Click on Войти button")
    public void click_on_войти_button() {
       emailPage.signInButtonClick();
        
    }
    @Then("Send message from Yandex")
    public void send_message_from_yandex() {
        emailPage.nextButtonClick();
    }
    @When("Input field name")
    public void input_field_name() {
       emailPage.inputFakeFirstNameSendKeys();
        
    }
    @When("Input field last name")
    public void input_field_last_name() {
        emailPage.inputFakeLastNameSendKeys();
    }
    @When("Click Войти button")
    public void click_войти_button() {
        emailPage.submitButtonClick();
        
    }
    @When("Input field generate password password")
    public void input_field_generate_password_password() {
        emailPage.passwordFakeInputSendKeys();
    }
    @Then("Политика конфиденциальности и условия использования")
    public void политика_конфиденциальности_и_условия_использования() {
        emailPage.iAgreeCheckBoxClick();
    }
    @Then("Click Зарегистрироваться button")
    public void click_зарегистрироваться_button() {
        emailPage.zaregButtonClick();
    }
}
