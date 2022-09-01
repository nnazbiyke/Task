package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class EmailPage extends BasePage {

    public EmailPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[text()='Почта']")
    WebElement emailButton;

    @FindBy(xpath = "//input[@type='text']")
    WebElement loginOrEmailInput;

    @FindBy(xpath = "//button[@id='passp:sign-in']")
    WebElement signInButton;

    @FindBy(xpath = "//button[@data-t='button:action']")
    WebElement nextButton;

    @FindBy(xpath = "//input[@data-t=\"field:input-firstname\"]")
    WebElement inputFakeFirstName;

    @FindBy(xpath = "//input[@data-t=\"field:input-lastname\"]")
    WebElement inputFakeLastName;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement submitButton;

    @FindBy(xpath = "//input[@data-t=\"field:input-password\"]")
    WebElement passwordFakeInput;

    @FindBy(xpath = "//button[@data-t=\"button:action\"]")
    WebElement buttonNext;

    @FindBy(xpath = "//input[@data-t=\"checkbox\"]")
    WebElement iAgreeCheckBox;

    @FindBy(xpath = "//button[@class=\"Button2 Button2_size_l Button2_view_action Button2_width_max Button2_type_submit\"]")
    WebElement zaregButton;

    public void emailButtonClick(){
       helper.click(emailButton);
    }
    public void loginOrEmailInputSendKeys(){
        helper.sendKeys(loginOrEmailInput,"nnazbiyke@bk.ru");
    }
    public void signInButtonClick(){
        helper.click(signInButton);
    }
    public void nextButtonClick(){
        helper.click(nextButton);
    }
    public void inputFakeFirstNameSendKeys(){
        helper.sendKeys(inputFakeFirstName,mockDataGenerator.generateMockFirstName());
    }
    public void inputFakeLastNameSendKeys(){
        helper.sendKeys(inputFakeLastName,mockDataGenerator.generateMockLastName());
    }
    public void submitButtonClick(){
        helper.click(submitButton);
    }
    public void passwordFakeInputSendKeys(){
        helper.sendKeys(passwordFakeInput,mockDataGenerator.generateMockPassword());
    }
    public void buttonNextClick(){
        helper.click(buttonNext);
    }
    public void iAgreeCheckBoxClick(){
        helper.click(iAgreeCheckBox);
    }

    public void zaregButtonClick() {
        helper.click(zaregButton);
    }
}
