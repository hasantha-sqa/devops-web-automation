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

public class SectionArchitectureAndDesign {

    WebDriver driver;

    public SectionArchitectureAndDesign(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "S5-Q1-A1")
    public WebElement radioButtonQ1Option1;
    @FindBy(how = How.ID, using = "S5-Q1-A2")
    public WebElement radioButtonQ1Option2;
    @FindBy(how = How.ID, using = "S5-Q1-A3")
    public WebElement radioButtonQ1Option3;
    @FindBy(how = How.ID, using = "S5-Q1-A4")
    public WebElement radioButtonQ1Option4;

    @FindBy(how = How.ID, using = "S5-Q2-A1")
    public WebElement checkBoxQ2Option1;
    @FindBy(how = How.ID, using = "S5-Q2-A2")
    public WebElement checkBoxQ2Option2;
    @FindBy(how = How.ID, using = "S5-Q2-A3")
    public WebElement checkBoxQ2Option3;
    @FindBy(how = How.ID, using = "S5-Q2-A4")
    public WebElement checkBoxQ2Option4;
    @FindBy(how = How.ID, using = "S5-Q2-A5")
    public WebElement checkBoxQ2Option5;

    @FindBy(how = How.ID, using = "S5-Q3-A1")
    public WebElement radioButtonQ3Option1;
    @FindBy(how = How.ID, using = "S5-Q3-A2")
    public WebElement radioButtonQ3Option2;
    @FindBy(how = How.ID, using = "S5-Q3-A3")
    public WebElement radioButtonQ3Option3;

    @FindBy(how = How.ID, using = "S5-Q4-A1")
    public WebElement radioButtonQ4Yes;
    @FindBy(how = How.ID, using = "S5-Q4-A2")
    public WebElement radioButtonQ4No;

    public void selectAnswers(JsonObject archAndDesign) {

        DriverUtils.selectAnswers( driver, archAndDesign, "Select the Answer for Section - Architecture And Design Question ");

    }
}
