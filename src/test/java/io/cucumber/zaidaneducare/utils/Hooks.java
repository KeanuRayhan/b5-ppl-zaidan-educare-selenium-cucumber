package io.cucumber.zaidaneducare.utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;

public class Hooks {
    
    @Before
    public void setUp() {
        // Initialize WebDriver sebelum setiap skenario
        DriverManager.initializeDriver("chrome");
    }
    
    @After
    public void tearDown(Scenario scenario) {        
        // Tutup browser setelah setiap skenario
        DriverManager.quitDriver();
    }
}