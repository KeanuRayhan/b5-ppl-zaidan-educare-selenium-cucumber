package io.cucumber.zaidaneducare.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

import io.cucumber.zaidaneducare.utils.DriverManager;
import io.cucumber.zaidaneducare.actions.LoginPageActions;

import static org.assertj.core.api.Assertions.assertThat;

public class AccessLoginPageSteps {

    WebDriver driver;
    LoginPageActions loginPage;

    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        driver = DriverManager.getDriver();
        loginPage = new LoginPageActions(driver);
        loginPage.openLoginPage();
    }

    @Then("I should see the login form")
    public void i_should_see_the_login_form() {
        Assert.assertTrue("Formulir login tidak ditampilkan", loginPage.isLoginFormDisplayed());
    }

    @Then("the page title should be displayed")
    public void the_page_title_should_be_displayed() {
        String title = loginPage.getPageTitle();
        Assert.assertNotNull("Judul halaman tidak tersedia", title);
        Assert.assertFalse("Judul halaman kosong", title.isEmpty());

        System.out.println("Page title: " + title);
        System.out.println("Current URL: " + driver.getCurrentUrl());
    }

}