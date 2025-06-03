package io.cucumber.zaidaneducare.stepdefinitions;

import io.cucumber.java.en.*;
import io.cucumber.zaidaneducare.actions.LoginPageActions;
import io.cucumber.zaidaneducare.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginNegativeSteps {

    WebDriver driver;
    LoginPageActions loginPage;

    @Given("User has opened the browser")
    public void user_has_opened_the_browser() {
        driver = DriverManager.getDriver(); // Inisialisasi driver
        loginPage = new LoginPageActions(driver); // Inisialisasi halaman
    }

    @And("User has navigated on the login page Education Fund Payment Management System for Zaidan Educare School app")
    public void user_has_navigated_to_login_page() {
        loginPage.openLoginPage();
        assertThat(loginPage.isLoginFormDisplayed()).isTrue();
    }

    @When("User enters username {string} & password {string}")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.login(username, password);
    }

    @And("User clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("User should be able to see {string} notification message")
    public void user_should_be_able_to_see_notification_message(String expectedMessage) {
        String actualMessage = loginPage.getLoginFailedMessage();
        assertThat(actualMessage).isEqualTo(expectedMessage);
    }
}
