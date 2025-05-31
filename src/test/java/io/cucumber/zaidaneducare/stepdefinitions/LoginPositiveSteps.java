package io.cucumber.zaidaneducare.stepdefinitions;

import io.cucumber.java.en.*;
import io.cucumber.zaidaneducare.actions.LoginPageActions;
import io.cucumber.zaidaneducare.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPositiveSteps {

    WebDriver driver = DriverManager.getDriver();
    LoginPageActions loginPage = new LoginPageActions(driver);

    @Given("User has navigated to the login page")
    public void user_has_navigated_to_the_login_page() {
        // Buka halaman login
        loginPage = new LoginPageActions(driver);
        loginPage.openLoginPage();
        assertThat(loginPage.isLoginFormDisplayed()).isTrue();
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.login(username, password);
    }

    @And("User clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.clickLogin();
    }

    @Then("User is navigated to the dashboard page with title {string}")
    public void user_is_navigated_to_the_dashboard_page_with_title(String expectedTitle) {
        String actualTitle = loginPage.getPageDashboardTitle();
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @And("User should see navigation bar for bendahara")
    public void user_should_see_navigation_bar_for_bendahara() {
        LoginPageActions loginPage = new LoginPageActions(driver);
        List<String> actualItems = loginPage.getSidebarItemsText();

        assertThat(actualItems).containsExactlyInAnyOrder(
                "Dasbor",
                "Tagihan Siswa",
                "Transaksi Penerimaan Dana",
                "Pengaturan Notifikasi",
                "Status Pembayaran",
                "Rekapitulasi",
                "Progres Transaksi Penerima Dana"
        );
    }

}
