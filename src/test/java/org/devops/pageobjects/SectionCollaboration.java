package org.devops.pageobjects;

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

public class SectionCollaboration {

    WebDriver driver;

    public SectionCollaboration(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "S3-Q1-A1")
    public WebElement radioButtonS3Q1Option1;
    @FindBy(how = How.ID, using = "S3-Q1-A2")
    public WebElement radioButtonS3Q1Option2;
    @FindBy(how = How.ID, using = "S3-Q1-A3")
    public WebElement radioButtonS3Q1Option3;

    @FindBy(how = How.ID, using = "S3-Q2-A1")
    public WebElement radioButtonS3Q2Yes;
    @FindBy(how = How.ID, using = "S3-Q2-A2")
    public WebElement radioButtonS3Q2No;

    @FindBy(how = How.ID, using = "S3-Q3-A1")
    public WebElement radioButtonS3Q3Yes;
    @FindBy(how = How.ID, using = "S3-Q3-A2")
    public WebElement radioButtonS3Q3No;

    @FindBy(how = How.ID, using = "S3-Q4-A1")
    public WebElement radioButtonS3Q4Option1;
    @FindBy(how = How.ID, using = "S3-Q4-A2")
    public WebElement radioButtonS3Q4Option2;
    @FindBy(how = How.ID, using = "S3-Q4-A3")
    public WebElement radioButtonS3Q4Option3;

    @FindBy(how = How.ID, using = "S3-Q5-A1")
    public WebElement radioButtonS3Q5Option1;
    @FindBy(how = How.ID, using = "S3-Q5-A2")
    public WebElement radioButtonS3Q5Option2;
    @FindBy(how = How.ID, using = "S3-Q5-A3")
    public WebElement radioButtonS3Q5Option3;

    @FindBy(how = How.ID, using = "S3-Q6-A1")
    public WebElement radioButtonS3Q6Yes;
    @FindBy(how = How.ID, using = "S3-Q6-A2")
    public WebElement radioButtonS3Q6No;

    @FindBy(how = How.ID, using = "S3-Q7-A1")
    public WebElement radioButtonS3Q7Option1;
    @FindBy(how = How.ID, using = "S3-Q7-A2")
    public WebElement radioButtonS3Q7Option2;
    @FindBy(how = How.ID, using = "S3-Q7-A3")
    public WebElement radioButtonS3Q7Option3;

    @FindBy(how = How.ID, using = "S3-Q8-A1")
    public WebElement radioButtonS3Q8Option1;
    @FindBy(how = How.ID, using = "S3-Q8-A2")
    public WebElement radioButtonS3Q8Option2;
    @FindBy(how = How.ID, using = "S3-Q8-A3")
    public WebElement radioButtonS3Q8Option3;
    
    public void selectAnswers(JsonObject collaboration) {

        DriverUtils.selectAnswers( driver, collaboration, "Select the Answer for Section - Collaboration Question ");

    }
}
