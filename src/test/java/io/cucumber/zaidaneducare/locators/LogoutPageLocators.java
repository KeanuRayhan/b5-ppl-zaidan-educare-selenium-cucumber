package io.cucumber.zaidaneducare.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPageLocators {
    
    @FindBy(xpath = "/html/body/div[2]/main/div/div[1]/div/div/div[2]/button")
    public WebElement logoutButton;

    @FindBy(xpath = "/html/body/div[4]/div[2]/button[2]")
    public WebElement yesConfirmLogoutButton;

}