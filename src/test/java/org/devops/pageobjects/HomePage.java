package org.devops.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String pageTitle = "DevOps Maturity Assessment";

    @FindBy(how = How.XPATH, using = ".//div[@id='navbarNav']//a[text()='Questionaire']")
    public WebElement navigationQuestionaire;

    @FindBy(how = How.XPATH, using = ".//div[@id='navbarNav']//a[text()='Sections']")
    public WebElement navigationSections;

    @FindBy(how = How.XPATH, using = ".//div[@id='navbarNav']//a[text()='Results']")
    public WebElement navigationResults;

    @FindBy(how = How.XPATH, using = ".//div[@id='navbarNav']//a[text()='Detailed Reports']")
    public WebElement navigationDetailedReports;

    @FindBy(how = How.XPATH, using = ".//div[@id='navbarNav']//a[text()='Resources']")
    public WebElement navigationResources;

    @FindBy(how = How.XPATH, using = ".//div[@id='navbarNav']//a[text()='About']")
    public WebElement navigationAbout;
}
