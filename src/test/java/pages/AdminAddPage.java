package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminAddPage {

    public AdminAddPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "menu_admin_viewAdminModule")
    public WebElement adminButton;

    @FindBy(id = "btnAdd")
    public WebElement addButton;



public void clickAdmin() {
    adminButton.click();
}

public void clickAddButton() {
    addButton.click();
}

}