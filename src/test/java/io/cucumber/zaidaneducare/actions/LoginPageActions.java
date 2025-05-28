package io.cucumber.zaidaneducare.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import io.cucumber.zaidaneducare.locators.LoginPageLocators;

public class LoginPageActions {
    WebDriver driver;
    LoginPageLocators loginPageLocators;

    public LoginPageActions(WebDriver driver) {
        this.driver = driver;
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

    // TAMBAHIN KODE DI BAWAH
    // ...

}