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

        Allure.step("Select the Answer for Section - DevOps Practices Question 1");
        JsonArray q1 = devops.get("q1").getAsJsonArray();
        for (JsonElement jsonElement : q1) {
            WebElement webElement = driver.findElement(By.id(jsonElement.getAsString()));
            DriverUtils.clickElementWithJS(driver, webElement);
            Assert.assertTrue(webElement.isSelected());
        }


        Allure.step("Select the Answer for Section - DevOps Practices Question 2");
        WebElement q2 = driver.findElement(By.id(devops.get("q2").getAsString()));
        DriverUtils.clickElementWithJS(driver, q2);
        Assert.assertTrue(q2.isSelected());

        Allure.step("Select the Answer for Section - DevOps Practices Question 3");
        WebElement q3 = driver.findElement(By.id(devops.get("q3").getAsString()));
        DriverUtils.clickElementWithJS(driver, q3);
        Assert.assertTrue(q3.isSelected());

        Allure.step("Select the Answer for Section - DevOps Practices Question 4");
        WebElement q4 = driver.findElement(By.id(devops.get("q4").getAsString()));
        DriverUtils.clickElementWithJS(driver, q4);
        Assert.assertTrue(q4.isSelected());

        Allure.step("Select the Answer for Section - DevOps Practices Question 5");
        WebElement q5 = driver.findElement(By.id(devops.get("q5").getAsString()));
        DriverUtils.clickElementWithJS(driver, q5);
        Assert.assertTrue(q5.isSelected());

        Allure.step("Select the Answer for Section - DevOps Practices Question 6");
        WebElement q6 = driver.findElement(By.id(devops.get("q6").getAsString()));
        DriverUtils.clickElementWithJS(driver, q6);
        Assert.assertTrue(q6.isSelected());

        Allure.step("Select the Answer for Section - DevOps Practices Question 7");
        WebElement q7 = driver.findElement(By.id(devops.get("q7").getAsString()));
        DriverUtils.clickElementWithJS(driver, q7);
        Assert.assertTrue(q7.isSelected());

        Allure.step("Select the Answer for Section - DevOps Practices Question 8");
        WebElement q8 = driver.findElement(By.id(devops.get("q8").getAsString()));
        DriverUtils.clickElementWithJS(driver, q8);
        Assert.assertTrue(q8.isSelected());

        Allure.step("Select the Answer for Section - DevOps Practices Question 9");
        WebElement q9 = driver.findElement(By.id(devops.get("q9").getAsString()));
        DriverUtils.clickElementWithJS(driver, q9);
        Assert.assertTrue(q9.isSelected());

        Allure.step("Select the Answer for Section - DevOps Practices Question 10");
        WebElement q10 = driver.findElement(By.id(devops.get("q10").getAsString()));
        DriverUtils.clickElementWithJS(driver, q10);
        Assert.assertTrue(q10.isSelected());

        Allure.step("Select the Answer for Section - DevOps Practices Question 11");
        WebElement q11 = driver.findElement(By.id(devops.get("q11").getAsString()));
        DriverUtils.clickElementWithJS(driver, q11);
        Assert.assertTrue(q11.isSelected());

        Allure.step("Select the Answer for Section - DevOps Practices Question 12");
        WebElement q12 = driver.findElement(By.id(devops.get("q12").getAsString()));
        DriverUtils.clickElementWithJS(driver, q12);
        Assert.assertTrue(q12.isSelected());

        Allure.step("Select the Answer for Section - DevOps Practices Question 13");
        WebElement q13 = driver.findElement(By.id(devops.get("q13").getAsString()));
        DriverUtils.clickElementWithJS(driver, q13);
        Assert.assertTrue(q13.isSelected());

        Allure.step("Select the Answer for Section - DevOps Practices Question 14");
        WebElement q14 = driver.findElement(By.id(devops.get("q14").getAsString()));
        DriverUtils.clickElementWithJS(driver, q14);
        Assert.assertTrue(q14.isSelected());
    }
}
