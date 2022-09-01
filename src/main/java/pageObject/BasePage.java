package pageObject;

import helperMethods.Helper;
import helperMethods.MockDataGenerator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class BasePage {

//    public BasePage() {
//        PageFactory.initElements(Driver.getDriver(), this);
//    }
    protected static Helper helper = new Helper();
    protected static MockDataGenerator mockDataGenerator = new MockDataGenerator();

}
