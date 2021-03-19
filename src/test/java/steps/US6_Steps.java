package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.AdminAddPage;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;

public class US6_Steps {

    WebDriver driver;
    LoginPage loginPage;
    AdminAddPage adminAddPage;


    @Then("user click the add user button")
    public void user_click_the_add_user_button() {
        driver = Driver.getDriver();
        adminAddPage = new AdminAddPage(driver);

        adminAddPage.clickAdmin();

    }

    @Then("user enter a username which already exist")
    public void user_enter_a_username_which_already_exist() {




    }

    @Then("user validate already exists text is displayed")
    public void user_validate_already_exists_text_is_displayed() {


    }


}
