package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import pages.Task1Page;
import utils.ConfigReader;
import utils.Driver;

import java.util.List;

public class US2_Steps {


    WebDriver driver;
    LoginPage loginPage;
    Task1Page task1Page;

    @Given("Navigate to {string} Enter Username as {string} and Password as {string}")
    public void navigate_to_enter_username_as_and_password_as(String url, String username, String password) {
        url = ConfigReader.getProperty("url");
        username = ConfigReader.getProperty("loginUsername");
        password = ConfigReader.getProperty("loginPassword");
        driver = Driver.getDriver();
        loginPage = new LoginPage(driver);
        driver.navigate().to(url);
        loginPage.sendKeysToId(username);
        loginPage.sendKeysToPassword(password);
        loginPage.clickLoginButton();

    }


    @Then("Click the Admin function")
    public void click_the_admin_function() {
       task1Page = new Task1Page(driver);
       task1Page.adminButton.click();

    }

    @Then("Click the first checkbox next to the Username")
    public void click_the_first_checkbox_next_to_the_username() {

        task1Page.selectAll.click();
    }
    @Then("Validate that all checkboxes are selected")
    public void validate_that_all_checkboxes_are_selected() {

      // boolean allChecked = true;
        List<WebElement> checkboxes = task1Page.isClickedAll;

        for (WebElement checkbox : checkboxes) {
            //System.out.println("CheckBoxes are selected "+ checkbox.getText());
            //Assert.assertTrue(checkbox.isSelected());
        }



    }

    @Then("Click on top of username two time")
    public void click_on_top_of_username_two_time() {
        //Actions actions = new Actions(driver);
        //actions.doubleClick(clickButton).perform();
        Actions actions = new Actions(driver);
       // actions.doubleClick(doubleClickUser).
    }


    @Then("Validate usernames are listed in descending order")
    public void validate_usernames_are_listed_in_descending_order() {

    }





    }
/*
    @Then("Click Add button")
    public void click_add_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Select User role")
    public void select_user_role() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Select employee name")
    public void select_employee_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Enter username")
    public void enter_username() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Select status")
    public void select_status() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Enter the password and confirm")
    public void enter_the_password_and_confirm() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Click Save button")
    public void click_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Validate {string} message")
    public void validate_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

 */

