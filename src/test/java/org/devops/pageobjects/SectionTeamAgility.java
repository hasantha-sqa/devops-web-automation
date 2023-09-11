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

public class SectionTeamAgility {

    WebDriver driver;

    public SectionTeamAgility(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "S2-Q1-A1")
    public WebElement radioButtonQ1Yes;
    @FindBy(how = How.ID, using = "S2-Q1-A2")
    public WebElement radioButtonQ1No;

    @FindBy(how = How.ID, using = "S2-Q2-A1")
    public WebElement checkBoxQ2Option1;
    @FindBy(how = How.ID, using = "S2-Q2-A2")
    public WebElement checkBoxQ2Option2;
    @FindBy(how = How.ID, using = "S2-Q2-A3")
    public WebElement checkBoxQ2Option3;
    @FindBy(how = How.ID, using = "S2-Q2-A4")
    public WebElement checkBoxQ2Option4;

    @FindBy(how = How.ID, using = "S2-Q3-A1")
    public WebElement radioButtonQ3Yes;
    @FindBy(how = How.ID, using = "S2-Q3-A2")
    public WebElement radioButtonQ3No;

    @FindBy(how = How.ID, using = "S2-Q4-A1")
    public WebElement radioButtonQ4Option1;
    @FindBy(how = How.ID, using = "S2-Q4-A2")
    public WebElement radioButtonQ4Option2;
    @FindBy(how = How.ID, using = "S2-Q4-A3")
    public WebElement radioButtonQ4Option3;

    @FindBy(how = How.ID, using = "S2-Q5-A1")
    public WebElement radioButtonQ5Yes;
    @FindBy(how = How.ID, using = "S2-Q5-A2")
    public WebElement radioButtonQ5No;

    @FindBy(how = How.ID, using = "S2-Q6-A1")
    public WebElement radioButtonQ6Yes;
    @FindBy(how = How.ID, using = "S2-Q6-A2")
    public WebElement radioButtonQ6No;

    @FindBy(how = How.ID, using = "S2-Q7-A1")
    public WebElement radioButtonQ7Yes;
    @FindBy(how = How.ID, using = "S2-Q7-A2")
    public WebElement radioButtonQ7No;

    @FindBy(how = How.ID, using = "S2-Q8-A1")
    public WebElement getRadioButtonS2Q8A2Yes;
    @FindBy(how = How.ID, using = "S2-Q8-A2")
    public WebElement radioButtonQ8No;

    @FindBy(how = How.ID, using = "S2-Q9-A1")
    public WebElement checkBoxQ9Option1;
    @FindBy(how = How.ID, using = "S2-Q9-A2")
    public WebElement checkBoxQ9Option2;
    @FindBy(how = How.ID, using = "S2-Q9-A3")
    public WebElement checkBoxQ9Option3;
    @FindBy(how = How.ID, using = "S2-Q9-A4")
    public WebElement checkBoxQ9Option4;

    @FindBy(how = How.ID, using = "S2-Q10-A1")
    public WebElement radioButtonQ10Yes;
    @FindBy(how = How.ID, using = "S2-Q10-A2")
    public WebElement radioButtonQ10No;

    public void selectAnswers(JsonObject teamAgility) {

        DriverUtils.selectAnswers( driver, teamAgility, "Select the Answer for Section - Team Agility Question ");

    }
}
