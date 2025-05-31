package io.cucumber.zaidaneducare.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import io.cucumber.zaidaneducare.locators.LogoutPageLocators;

public class LogoutPageActions {
    WebDriver driver;
    LogoutPageLocators logoutPageLocators;

    public LogoutPageActions(WebDriver driver) {
        this.driver = driver;
        logoutPageLocators = new LogoutPageLocators();
        PageFactory.initElements(driver, logoutPageLocators);
    }

    public void clickLogout() {
        logoutPageLocators.logoutButton.click();
    }

    public void clickYesOnConfirmation() {
        logoutPageLocators.yesConfirmLogoutButton.click();
    }

}