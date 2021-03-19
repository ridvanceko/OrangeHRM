package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Task1Page {

    public Task1Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="menu_admin_viewAdminModule")
    public WebElement adminButton;

    @FindBy(id="ohrmList_chkSelectAll")
    public WebElement selectAll;

    @FindBy(className="checkbox-col")
    public List<WebElement> isClickedAll;

    //@FindBy(id="ohrmList_chkSelectRecord_37")
    //public WebElement

    @FindBy(className="header headerSortUp")
    public WebElement doubleClickUsername;



    public void setAdminButton(){
        adminButton.click();

    }

    public void setSelectAll(){
        selectAll.click();
    }

    public void setDoubleClickUsername(){
        doubleClickUsername.click();
    }




    }





