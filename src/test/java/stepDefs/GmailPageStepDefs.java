package stepDefs;

import dataProviders.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.BasePage;
import utils.Driver;

public class GmailPageStepDefs extends BasePage {

    @Then("click on Sing in button")
    public void click_on_sing_in_button() {
        Driver.getDriver().get(ConfigReader.getProperty("environment"));
        gmailPage.gmailSingInButtonClick();
    }

    @Then("input email")
    public void input_email() {
        gmailPage.loginToSystemEmail();
    }

    @Then("click next1")
    public void click_next1() {
    }

    @Then("input password")
    public void input_password() {
        gmailPage.loginToSystemPassword();

    }

    @Then("click next2")
    public void click_next2() {
    }

    @When("user on gmail page")
    public void user_on_gmail_page() {
        gmailPage.closeBrowser();
    }
}
