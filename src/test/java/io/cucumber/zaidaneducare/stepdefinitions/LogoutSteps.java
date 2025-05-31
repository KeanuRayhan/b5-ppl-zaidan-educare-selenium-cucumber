package io.cucumber.zaidaneducare.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.zaidaneducare.utils.DriverManager;
import io.cucumber.zaidaneducare.actions.LoginPageActions;
import io.cucumber.zaidaneducare.actions.LogoutPageActions;

public class LogoutSteps {

    WebDriver driver = DriverManager.getDriver();
    LoginPageActions loginPage = new LoginPageActions(driver);
    LogoutPageActions logoutPage = new LogoutPageActions(driver);

    @Given("User has login using valid credentials as role {string} with password {string}")
    public void user_has_login_as_role(String username, String password) {
        loginPage.openLoginPage();
        loginPage.login(username, password);
        loginPage.clickLogin();
        Assert.assertTrue(loginPage.getPageDashboardTitle().contains("Dasbor - Bendahara"));
        Assert.assertTrue(loginPage.getUsernameDashboard().contains("Bendahara"));
    }

    @When("User clicks logout button on top right in the navigation bar section")
    public void user_clicks_logout_button() {
        logoutPage.clickLogout();
    }

    @And("User clicks yes on confirmation pop up")
    public void user_clicks_yes_on_confirmation_pop_up() {
        logoutPage.clickYesOnConfirmation();
    }

    @Then("User is redirected to the login page")
    public void user_is_redirected_to_login_page() {
        System.out.println("Landing Page Title: " + loginPage.getLandingPageTitle());
        
        Assert.assertTrue(driver.getCurrentUrl().contains("/login"));
        Assert.assertTrue(loginPage.getLandingPageTitle().contains("Pengelolaan Dana Pendidikan Sekolah Zaidan Educare"));
    }

    @And("User should be able to see username and password fields input")
    public void user_should_see_username_and_password_fields() {
        Assert.assertTrue(loginPage.isLoginFormDisplayed());
    }

}