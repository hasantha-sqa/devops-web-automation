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

public class SectionDevOpsPractices {

    WebDriver driver;

    public SectionDevOpsPractices(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "S6-Q1-A1")
    public WebElement checkBoxQ1Option1;
    @FindBy(how = How.ID, using = "S6-Q1-A2")
    public WebElement checkBoxQ1Option2;
    @FindBy(how = How.ID, using = "S6-Q1-A3")
    public WebElement checkBoxQ1Option3;
    @FindBy(how = How.ID, using = "S6-Q1-A4")
    public WebElement checkBoxQ1Option4;

    @FindBy(how = How.ID, using = "S6-Q2-A1")
    public WebElement radioButtonQ2Option1;
    @FindBy(how = How.ID, using = "S6-Q2-A2")
    public WebElement radioButtonQ2Option2;
    @FindBy(how = How.ID, using = "S6-Q2-A3")
    public WebElement radioButtonQ2Option3;
    @FindBy(how = How.ID, using = "S6-Q2-A4")
    public WebElement radioButtonQ2Option4;

    @FindBy(how = How.ID, using = "S6-Q3-A1")
    public WebElement radioButtonQ3Option1;
    @FindBy(how = How.ID, using = "S6-Q3-A2")
    public WebElement radioButtonQ3Option2;
    @FindBy(how = How.ID, using = "S6-Q3-A3")
    public WebElement radioButtonQ3Option3;

    @FindBy(how = How.ID, using = "S6-Q4-A1")
    public WebElement radioButtonQ4Option1;
    @FindBy(how = How.ID, using = "S6-Q4-A2")
    public WebElement radioButtonQ4Option2;
    @FindBy(how = How.ID, using = "S6-Q4-A3")
    public WebElement radioButtonQ4Option3;
    @FindBy(how = How.ID, using = "S6-Q4-A4")
    public WebElement radioButtonQ4Option4;

    @FindBy(how = How.ID, using = "S6-Q5-A1")
    public WebElement radioButtonQ5Option1;
    @FindBy(how = How.ID, using = "S6-Q5-A2")
    public WebElement radioButtonQ5Option2;
    @FindBy(how = How.ID, using = "S6-Q5-A3")
    public WebElement radioButtonQ5Option3;
    @FindBy(how = How.ID, using = "S6-Q5-A4")
    public WebElement radioButtonQ5Option4;

    @FindBy(how = How.ID, using = "S6-Q6-A1")
    public WebElement radioButtonQ6Yes;
    @FindBy(how = How.ID, using = "S6-Q6-A2")
    public WebElement radioButtonQ6No;

    @FindBy(how = How.ID, using = "S6-Q7-A1")
    public WebElement radioButtonQ7Yes;
    @FindBy(how = How.ID, using = "S6-Q7-A2")
    public WebElement radioButtonQ7No;

    @FindBy(how = How.ID, using = "S6-Q8-A1")
    public WebElement radioButtonQ8Option1;
    @FindBy(how = How.ID, using = "S6-Q8-A2")
    public WebElement radioButtonQ8Option2;

    @FindBy(how = How.ID, using = "S6-Q9-A1")
    public WebElement radioButtonQ9Yes;
    @FindBy(how = How.ID, using = "S6-Q9-A2")
    public WebElement radioButtonQ9No;

    @FindBy(how = How.ID, using = "S6-Q10-A1")
    public WebElement radioButtonQ10Yes;
    @FindBy(how = How.ID, using = "S6-Q10-A2")
    public WebElement radioButtonQ10No;

    @FindBy(how = How.ID, using = "S6-Q11-A1")
    public WebElement radioButtonQ11Option1;
    @FindBy(how = How.ID, using = "S6-Q11-A2")
    public WebElement radioButtonQ11Option2;
    @FindBy(how = How.ID, using = "S6-Q11-A3")
    public WebElement radioButtonQ11Option3;

    @FindBy(how = How.ID, using = "S6-Q12-A1")
    public WebElement radioButtonQ12Yes;
    @FindBy(how = How.ID, using = "S6-Q12-A2")
    public WebElement radioButtonQ12No;

    @FindBy(how = How.ID, using = "S6-Q13-A1")
    public WebElement radioButtonQ13Yes;
    @FindBy(how = How.ID, using = "S6-Q13-A2")
    public WebElement radioButtonQ13No;

    @FindBy(how = How.ID, using = "S6-Q14-A1")
    public WebElement radioButtonQ14Yes;
    @FindBy(how = How.ID, using = "S6-Q14-A2")
    public WebElement radioButtonQ14No;

    public void selectAnswers(JsonObject devops) {

        DriverUtils.selectAnswers( driver, devops, "Select the Answer for Section - DevOps Practices Question ");

    }
}
