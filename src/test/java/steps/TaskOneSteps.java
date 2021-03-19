package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.Task1Page;
import utils.ConfigReader;
import utils.Driver;

public class TaskOneSteps {

    WebDriver driver;
    Task1Page task1Page;

    @Given("user navigates to  URL")
    public void user_navigates_to_url(String url) {
        driver = Driver.getDriver();
        driver.navigate().to(ConfigReader.getProperty("url"));

    }

    @Then("user login by Username: {string} and Password: {string}")
    public void user_login_by_username_and_password(String username, String password) {
        driver = Driver.getDriver();
        task1Page = new Task1Page(driver);
        username = ConfigReader.getProperty("loginUserName");
        password = ConfigReader.getProperty("loginPassword");
        task1Page.
    }

    @Then("Click login button")
    public void click_login_button() {


    }






    }
    @Then("Click the Admin function")
    public void click_the_admin_function() {


    }
    @Then("Click the first checkbox next to the Username Validate that all checkboxes are selected")
    public void click_the_first_checkbox_next_to_the_username_validate_that_all_checkboxes_are_selected() {


    }
    @Then("Click on top of username {int} time")
    public void click_on_top_of_username_time(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Validate usernames are listed in descending order")
    public void validate_usernames_are_listed_in_descending_order() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
