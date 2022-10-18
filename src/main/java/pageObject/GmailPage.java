package pageObject;

import dataProviders.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class GmailPage extends BasePage {

    public GmailPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-action='sign in']")
    WebElement singInButton;

    @FindBy(xpath = "//input[@type='email']")
    WebElement emailField;

    @FindBy(xpath = "//span[text()='Next']")
    WebElement nextButton1;

    @FindBy(xpath = "//input[@type='password']")
    WebElement passwordField;

    @FindBy(xpath = "//span[text()='Next']")
    WebElement nextButton2;


    public void gmailSingInButtonClick(){
       helper.click(singInButton);
    }
//    public void accountGoogleButtonClick(){
//        helper.click(accountGoogle);
//    }
//    public void nextButton1Click(){
//        helper.click(nextButton1);
//    }
//    public void inputPassword(){
//        helper.sendKeys(passwordField,"Test#123Test!");
//    }
//    public void nextButton2Click(){
//        helper.click(nextButton2);
//    }
    public void loginToSystemEmail() {
        helper.sendKeys(emailField, ConfigReader.getProperty("email"));
        helper.click(nextButton1);
    }
    public void loginToSystemPassword(){
        helper.sendKeys(passwordField, ConfigReader.getProperty("passwordEmail"));
        helper.click(nextButton2);
    }
    public void closeBrowser(){
        Driver.closeDriver();
    }

}
