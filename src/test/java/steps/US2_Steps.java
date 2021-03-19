package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;

public class US2_Steps {


    WebDriver driver;
    LoginPage loginPage;

    @Given("Navigate to {string} Enter Username as {string} and Password as {string}")
    public void navigate_to_enter_username_as_and_password_as(String url, String username, String password) {
        url= ConfigReader.getProperty("url");
        username=ConfigReader.getProperty("loginUsername");
        password=ConfigReader.getProperty("loginPassword");
        driver= Driver.getDriver();
        loginPage=new LoginPage(driver);
        driver.navigate().to(url);
        loginPage.sendKeysToId(username);
        loginPage.sendKeysToPassword(password);
        loginPage.clickLoginButton();

    }

    @Then("Click the Admin function")
    public void click_the_admin_function() {




    }

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
}
