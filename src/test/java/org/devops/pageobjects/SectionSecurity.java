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

public class SectionSecurity {

    WebDriver driver;

    public SectionSecurity(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "S9-Q1-A1")
    public WebElement radioButtonQ1Yes;
    @FindBy(how = How.ID, using = "S9-Q1-A2")
    public WebElement radioButtonQ1No;

    @FindBy(how = How.ID, using = "S9-Q2-A1")
    public WebElement radioButtonQ2Yes;
    @FindBy(how = How.ID, using = "S9-Q2-A2")
    public WebElement radioButtonQ2No;

    @FindBy(how = How.ID, using = "S9-Q3-A1")
    public WebElement radioButtonQ3Option1;
    @FindBy(how = How.ID, using = "S9-Q3-A2")
    public WebElement radioButtonQ3Option2;
    @FindBy(how = How.ID, using = "S9-Q3-A3")
    public WebElement radioButtonQ3Option3;
    @FindBy(how = How.ID, using = "S9-Q3-A4")
    public WebElement radioButtonQ3Option4;

    @FindBy(how = How.ID, using = "S9-Q4-A1")
    public WebElement checkBoxQ4Option1;
    @FindBy(how = How.ID, using = "S9-Q4-A2")
    public WebElement checkBoxQ4Option2;
    @FindBy(how = How.ID, using = "S9-Q4-A3")
    public WebElement checkBoxQ4Option3;

    public void selectAnswers(JsonObject security) {

        DriverUtils.selectAnswers( driver, security, "Select the Answer for Section - Security Question ");

    }
}
