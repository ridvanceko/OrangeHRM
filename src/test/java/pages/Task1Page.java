package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task1Page {

    public Task1Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(id="txtUsername")
    public WebElement loginUsername;

    @FindBy(id="txtPassword")
    public WebElement loginPassword;

    @FindBy(id="btnLogin")
    public WebElement loginButton;



    public void setUsername(String usernameValue){
        loginUsername.sendKeys(usernameValue);

    }

    public void setPassword(String passwordValue){
       loginPassword.sendKeys(passwordValue);

    }

    public void setLoginButton(){
        loginButton.click();
    }





    }





