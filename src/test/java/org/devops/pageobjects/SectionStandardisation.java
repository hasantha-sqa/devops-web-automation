package org.devops.pageobjects;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.qameta.allure.Allure;
import org.devops.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SectionStandardisation {

    WebDriver driver;

    public SectionStandardisation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "S8-Q1-A1")
    public WebElement checkBoxQ1Option1;
    @FindBy(how = How.ID, using = "S8-Q1-A2")
    public WebElement checkBoxQ1Option2;
    @FindBy(how = How.ID, using = "S8-Q1-A3")
    public WebElement checkBoxQ1Option3;
    @FindBy(how = How.ID, using = "S8-Q1-A4")
    public WebElement checkBoxQ1Option4;

    @FindBy(how = How.ID, using = "S8-Q2-A1")
    public WebElement radioButtonQ2Option1;
    @FindBy(how = How.ID, using = "S8-Q2-A2")
    public WebElement radioButtonQ2Option2;
    @FindBy(how = How.ID, using = "S8-Q2-A3")
    public WebElement radioButtonQ2Option3;

    @FindBy(how = How.ID, using = "S8-Q3-A1")
    public WebElement radioButtonQ3Yes;
    @FindBy(how = How.ID, using = "S8-Q3-A2")
    public WebElement radioButtonQ3No;

    @FindBy(how = How.ID, using = "S8-Q4-A1")
    public WebElement radioButtonQ4Yes;
    @FindBy(how = How.ID, using = "S8-Q4-A2")
    public WebElement radioButtonQ4No;

    @FindBy(how = How.ID, using = "S8-Q5-A1")
    public WebElement radioButtonQ5Yes;
    @FindBy(how = How.ID, using = "S8-Q5-A2")
    public WebElement radioButtonQ5No;

    public void selectAnswers(JsonObject standardisation) {

        DriverUtils.selectAnswers( driver, standardisation, "Select the Answer for Section - Standardisation Question ");

    }
}
