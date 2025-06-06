package io.cucumber.zaidaneducare.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import io.cucumber.zaidaneducare.locators.LoginPageLocators;

public class LoginPageActions {
    WebDriver driver;
    WebDriverWait wait;
    LoginPageLocators loginPageLocators;

    public LoginPageActions(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        loginPageLocators = new LoginPageLocators();
        PageFactory.initElements(driver, loginPageLocators);
    }

    public void openLoginPage() {
        driver.get("http://ptbsp.ddns.net:6882/login");
    }

    public boolean isLoginFormDisplayed() {
        return loginPageLocators.loginForm.isDisplayed();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getLandingPageTitle() {
        return loginPageLocators.landingPageTitle.getText();
    }

    // TAMBAHIN KODE DI BAWAH
    // ...

    public void login(String username, String password) {
        // Tunggu sampai elemen input username terlihat
        wait.until(ExpectedConditions.visibilityOf(loginPageLocators.usernameInput)).clear();
        // Mengisi field username
        loginPageLocators.usernameInput.sendKeys(username);
        
        // Tunggu sampai elemen input password terlihat
        wait.until(ExpectedConditions.visibilityOf(loginPageLocators.passwordInput)).clear();
        // Mengisi field password
        loginPageLocators.passwordInput.sendKeys(password);
    }

    public void clickLogin() {
        loginPageLocators.loginButton.click();
    }

    public String getPageDashboardTitle() {
        return loginPageLocators.pageTitleDashboard.getText();
    }

    public String getUsernameDashboard() {
        return loginPageLocators.usernameDashboard.getText();
    }

    public List<String> getSidebarItemsText() {
        List<String> items = new ArrayList<>();
        for (WebElement item : loginPageLocators.sidebarItems) {
            items.add(item.getText().trim());
        }
        return items;
    }

    public String getLoginFailedMessage() {
        wait.until(ExpectedConditions.visibilityOf(loginPageLocators.loginFailedNotification));
        return loginPageLocators.loginFailedNotification.getText().trim();
    }

}