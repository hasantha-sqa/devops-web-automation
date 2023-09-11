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

public class SectionAutomation {

    WebDriver driver;

    public SectionAutomation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "S4-Q1-A1")
    public WebElement radioButtonQ1Yes;
    @FindBy(how = How.ID, using = "S4-Q1-A2")
    public WebElement radioButtonQ1No;

    @FindBy(how = How.ID, using = "S4-Q2-A1")
    public WebElement radioButtonQ2Option1;
    @FindBy(how = How.ID, using = "S4-Q2-A2")
    public WebElement radioButtonQ2Option2;
    @FindBy(how = How.ID, using = "S4-Q2-A3")
    public WebElement radioButtonQ2Option3;

    @FindBy(how = How.ID, using = "S4-Q3-A1")
    public WebElement checkBoxQ3Option1;
    @FindBy(how = How.ID, using = "S4-Q3-A2")
    public WebElement checkBoxQ3Option2;
    @FindBy(how = How.ID, using = "S4-Q3-A3")
    public WebElement checkBoxQ3Option3;
    @FindBy(how = How.ID, using = "S4-Q3-A4")
    public WebElement checkBoxQ3Option4;
    @FindBy(how = How.ID, using = "S4-Q3-A5")
    public WebElement checkBoxQ3Option5;
    @FindBy(how = How.ID, using = "S4-Q3-A6")
    public WebElement checkBoxQ3Option6;

    @FindBy(how = How.ID, using = "S4-Q3-A1")
    public WebElement radioButtonQ3Yes;
    @FindBy(how = How.ID, using = "S4-Q3-A2")
    public WebElement radioButtonQ3No;

    @FindBy(how = How.ID, using = "S4-Q4-A1")
    public WebElement radioButtonQ4Yes;
    @FindBy(how = How.ID, using = "S4-Q4-A2")
    public WebElement radioButtonQ4No;

    @FindBy(how = How.ID, using = "S4-Q5-A1")
    public WebElement radioButtonQ5Option1;
    @FindBy(how = How.ID, using = "S4-Q5-A2")
    public WebElement radioButtonQ5Option2;
    @FindBy(how = How.ID, using = "S4-Q5-A3")
    public WebElement radioButtonQ5Option3;

    @FindBy(how = How.ID, using = "S4-Q6-A1")
    public WebElement radioButtonQ6Option1;
    @FindBy(how = How.ID, using = "S4-Q6-A2")
    public WebElement radioButtonQ6Option2;
    @FindBy(how = How.ID, using = "S4-Q6-A3")
    public WebElement radioButtonQ6Option3;

    @FindBy(how = How.ID, using = "S4-Q7-A1")
    public WebElement radioButtonQ7Option1;
    @FindBy(how = How.ID, using = "S4-Q7-A2")
    public WebElement radioButtonQ7Option2;
    @FindBy(how = How.ID, using = "S4-Q7-A3")
    public WebElement radioButtonQ7Option3;

    @FindBy(how = How.ID, using = "S4-Q8-A1")
    public WebElement radioButtonQ8Option1;
    @FindBy(how = How.ID, using = "S4-Q8-A2")
    public WebElement radioButtonQ8Option2;
    @FindBy(how = How.ID, using = "S4-Q8-A3")
    public WebElement radioButtonQ8Option3;

    @FindBy(how = How.ID, using = "S4-Q9-A1")
    public WebElement radioButtonQ9Option1;
    @FindBy(how = How.ID, using = "S4-Q9-A2")
    public WebElement radioButtonQ9Option2;
    @FindBy(how = How.ID, using = "S4-Q9-A3")
    public WebElement radioButtonQ9Option3;

    @FindBy(how = How.ID, using = "S4-Q10-A1")
    public WebElement radioButtonQ10Option1;
    @FindBy(how = How.ID, using = "S4-Q10-A2")
    public WebElement radioButtonQ10Option2;
    @FindBy(how = How.ID, using = "S4-Q10-A3")
    public WebElement radioButtonQ10Option3;

    @FindBy(how = How.ID, using = "S4-Q11-A1")
    public WebElement radioButtonQ11Option1;
    @FindBy(how = How.ID, using = "S4-Q11-A2")
    public WebElement radioButtonQ11Option2;
    @FindBy(how = How.ID, using = "S4-Q11-A3")
    public WebElement radioButtonQ11Option3;

    @FindBy(how = How.ID, using = "S4-Q12-A1")
    public WebElement radioButtonQ12Option1;
    @FindBy(how = How.ID, using = "S4-Q10-A2")
    public WebElement radioButtonQ12Option2;
    @FindBy(how = How.ID, using = "S4-Q10-A3")
    public WebElement radioButtonQ12Option3;

    @FindBy(how = How.ID, using = "S4-Q13-A1")
    public WebElement radioButtonQ13Yes;
    @FindBy(how = How.ID, using = "S4-Q13-A2")
    public WebElement radioButtonQ13ONo;

    public void selectAnswers(JsonObject automation) {

        DriverUtils.selectAnswers( driver, automation, "Select the Answer for Section - Automation Question ");

    }
}
