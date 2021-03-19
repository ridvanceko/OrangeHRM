package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LoginPage {


    public LoginPage(WebDriver driver){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (id = "txtUsername")
    public WebElement idInputBox;

    @FindBy (id = "txtPassword")
    public WebElement passwordInputBox;

    @FindBy (id = "btnLogin")
    public WebElement loginButton;











    public void sendKeysToId(String username ){
        this.idInputBox.sendKeys(username);
    }

    public void sendKeysToPassword(String password ){
        this.passwordInputBox.sendKeys(password);
    }

    public void clickLoginButton(){
        this.loginButton.click();
    }

}
