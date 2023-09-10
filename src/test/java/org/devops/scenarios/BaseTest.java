package org.devops.scenarios;

import io.qameta.allure.Allure;
import org.devops.pageobjects.DevOpsMaturityAssessment;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public DevOpsMaturityAssessment devOpsMaturityAssessment;

    @Parameters({"browser"})
    @BeforeMethod
    public void beforeMethod(@Optional("firefox") String browser) {

        initDriver(browser);
        this.devOpsMaturityAssessment = new DevOpsMaturityAssessment(this.driver);
    }

    @AfterMethod
    public void afterMethod() {

        Allure.step("Close Browser");
        this.driver.quit();

    }

    public void initDriver(String browser) {

        switch (browser) {
            case "chrome" -> {
                Allure.step("Initialize Chrome Driver");
                this.driver = new ChromeDriver();
            }
            case "firefox" -> {
                Allure.step("Initialize FireFox Driver");
                this.driver = new FirefoxDriver();
            }
            case "edge" -> {
                Allure.step("Initialize Edge Driver");
                this.driver = new EdgeDriver();
            }
            default -> throw new RuntimeException("Unsupported browser: " + browser);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

}
