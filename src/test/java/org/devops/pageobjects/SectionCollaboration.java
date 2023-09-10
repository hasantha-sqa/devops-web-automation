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

        Allure.step("Select the Answer for Section - Collaboration Question 1");
        WebElement q1 = driver.findElement(By.id(collaboration.get("q1").getAsString()));
        DriverUtils.clickElementWithJS(driver, q1);
        Assert.assertTrue(q1.isSelected());

        Allure.step("Select the Answer for Section - Collaboration Question 2");
        WebElement q2 = driver.findElement(By.id(collaboration.get("q2").getAsString()));
        DriverUtils.clickElementWithJS(driver, q2);
        Assert.assertTrue(q2.isSelected());

        Allure.step("Select the Answer for Section - Collaboration Question 3");
        WebElement q3 = driver.findElement(By.id(collaboration.get("q3").getAsString()));
        DriverUtils.clickElementWithJS(driver, q3);
        Assert.assertTrue(q3.isSelected());

        Allure.step("Select the Answer for Section - Collaboration Question 4");
        WebElement q4 = driver.findElement(By.id(collaboration.get("q4").getAsString()));
        DriverUtils.clickElementWithJS(driver, q4);
        Assert.assertTrue(q4.isSelected());

        Allure.step("Select the Answer for Section - Collaboration Question 5");
        WebElement q5 = driver.findElement(By.id(collaboration.get("q5").getAsString()));
        DriverUtils.clickElementWithJS(driver, q5);
        Assert.assertTrue(q5.isSelected());

        Allure.step("Select the Answer for Section - Collaboration Question 6");
        WebElement q6 = driver.findElement(By.id(collaboration.get("q6").getAsString()));
        DriverUtils.clickElementWithJS(driver, q6);
        Assert.assertTrue(q6.isSelected());

        Allure.step("Select the Answer for Section - Collaboration Question 7");
        WebElement q7 = driver.findElement(By.id(collaboration.get("q7").getAsString()));
        DriverUtils.clickElementWithJS(driver, q7);
        Assert.assertTrue(q7.isSelected());

        Allure.step("Select the Answer for Section - Collaboration Question 8");
        WebElement q8 = driver.findElement(By.id(collaboration.get("q8").getAsString()));
        DriverUtils.clickElementWithJS(driver, q8);
        Assert.assertTrue(q1.isSelected());

    }
}
