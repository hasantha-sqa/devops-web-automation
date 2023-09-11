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

public class SectionOrgStruCultAndIncentives {

    WebDriver driver;

    public SectionOrgStruCultAndIncentives(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "S7-Q1-A1")
    public WebElement radioButtonQ1Yes;
    @FindBy(how = How.ID, using = "S7-Q1-A2")
    public WebElement radioButtonQ1No;

    @FindBy(how = How.ID, using = "S7-Q2-A1")
    public WebElement radioButtonQ2Yes;
    @FindBy(how = How.ID, using = "S7-Q2-A2")
    public WebElement radioButtonQ2No;

    @FindBy(how = How.ID, using = "S7-Q3-A1")
    public WebElement radioButtonQ3Yes;
    @FindBy(how = How.ID, using = "S7-Q3-A2")
    public WebElement radioButtonQ3No;

    @FindBy(how = How.ID, using = "S7-Q4-A1")
    public WebElement radioButtonQ4Yes;
    @FindBy(how = How.ID, using = "S7-Q4-A2")
    public WebElement radioButtonQ4No;

    @FindBy(how = How.ID, using = "S7-Q5-A1")
    public WebElement radioButtonQ5Yes;
    @FindBy(how = How.ID, using = "S7-Q5-A2")
    public WebElement radioButtonQ5No;

    @FindBy(how = How.ID, using = "S7-Q6-A1")
    public WebElement radioButtonQ6Yes;
    @FindBy(how = How.ID, using = "S7-Q6-A2")
    public WebElement radioButtonQ6No;

    @FindBy(how = How.ID, using = "S7-Q7-A1")
    public WebElement radioButtonQ7Yes;
    @FindBy(how = How.ID, using = "S7-Q7-A2")
    public WebElement radioButtonQ7No;

    @FindBy(how = How.ID, using = "S7-Q8-A1")
    public WebElement radioButtonQ8Yes;
    @FindBy(how = How.ID, using = "S7-Q8-A2")
    public WebElement radioButtonQ8No;

    @FindBy(how = How.ID, using = "S7-Q9-A1")
    public WebElement radioButtonQ9Yes;
    @FindBy(how = How.ID, using = "S7-Q9-A2")
    public WebElement radioButtonQ9No;

    @FindBy(how = How.ID, using = "S7-Q10-A1")
    public WebElement radioButtonQ10Yes;
    @FindBy(how = How.ID, using = "S7-Q10-A2")
    public WebElement radioButtonQ10No;

    @FindBy(how = How.ID, using = "S7-Q11-A1")
    public WebElement radioButtonQ11Yes;
    @FindBy(how = How.ID, using = "S7-Q11-A2")
    public WebElement radioButtonQ11No;

    @FindBy(how = How.ID, using = "S7-Q12-A1")
    public WebElement radioButtonQ12Yes;
    @FindBy(how = How.ID, using = "S7-Q12-A2")
    public WebElement radioButtonQ12No;

    @FindBy(how = How.ID, using = "S7-Q13-A1")
    public WebElement radioButtonQ13Yes;
    @FindBy(how = How.ID, using = "S7-Q13-A2")
    public WebElement radioButtonQ13No;

    @FindBy(how = How.ID, using = "S7-Q14-A1")
    public WebElement radioButtonQ14Yes;
    @FindBy(how = How.ID, using = "S7-Q14-A2")
    public WebElement radioButtonQ14No;

    @FindBy(how = How.ID, using = "S7-Q15-A1")
    public WebElement radioButtonQ15Yes;
    @FindBy(how = How.ID, using = "S7-Q15-A2")
    public WebElement radioButtonQ15No;

    @FindBy(how = How.ID, using = "S7-Q16-A1")
    public WebElement radioButtonQ16Option1;
    @FindBy(how = How.ID, using = "S7-Q16-A2")
    public WebElement radioButtonQ16Option2;
    @FindBy(how = How.ID, using = "S7-Q16-A3")
    public WebElement radioButtonQ16Option3;
    @FindBy(how = How.ID, using = "S7-Q16-A4")
    public WebElement radioButtonQ16Option4;

    @FindBy(how = How.ID, using = "S7-Q17-A1")
    public WebElement radioButtonQ17Option1;
    @FindBy(how = How.ID, using = "S7-Q17-A2")
    public WebElement radioButtonQ17Option2;
    @FindBy(how = How.ID, using = "S7-Q17-A3")
    public WebElement radioButtonQ17Option3;

    @FindBy(how = How.ID, using = "S7-Q18-A1")
    public WebElement radioButtonQ18Yes;
    @FindBy(how = How.ID, using = "S7-Q18-A2")
    public WebElement radioButtonQ18No;

    @FindBy(how = How.ID, using = "S7-Q19-A1")
    public WebElement radioButtonQ19Yes;
    @FindBy(how = How.ID, using = "S7-Q19-A2")
    public WebElement radioButtonQ19No;

    public void selectAnswers(JsonObject sectionOrgStruCultAndIncentives) {

        DriverUtils.selectAnswers( driver, sectionOrgStruCultAndIncentives, "Select the Answer for Section - Organization Structure, Culture And Incentives Question ");

    }
}
