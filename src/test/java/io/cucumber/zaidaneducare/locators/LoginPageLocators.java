package io.cucumber.zaidaneducare.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPageLocators {

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/h1")
    public WebElement landingPageTitle;
    
    @FindBy(name = "username")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/form/button")
    public WebElement loginButton;

    @FindBy(tagName = "form")
    public WebElement loginForm;

    @FindBy(xpath = "/html/body/div[2]/main/div/div[1]/div/div/div[1]/h1")
    public WebElement pageTitleDashboard;

    @FindBy(xpath = "/html/body/div[2]/main/div/div[1]/div/div/div[2]/span")
    public WebElement usernameDashboard;

    @FindBy(xpath = "//ul/li/a/span")
    public List<WebElement> sidebarItems;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[2]")
    public WebElement loginFailedNotification;
}