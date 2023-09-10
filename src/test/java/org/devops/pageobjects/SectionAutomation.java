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

        Allure.step("Select the Answer for Section - Automation Question 1");
        WebElement q1 = driver.findElement(By.id(automation.get("q1").getAsString()));
        DriverUtils.clickElementWithJS(driver, q1);
        Assert.assertTrue(q1.isSelected());

        Allure.step("Select the Answer for Section - Automation Question 2");
        WebElement q2 = driver.findElement(By.id(automation.get("q2").getAsString()));
        DriverUtils.clickElementWithJS(driver, q2);
        Assert.assertTrue(q2.isSelected());

        Allure.step("Select the Answer for Section - Automation Question 3");
        JsonArray q3 = automation.get("q3").getAsJsonArray();
        for (JsonElement jsonElement : q3) {
            WebElement webElement = driver.findElement(By.id(jsonElement.getAsString()));
            DriverUtils.clickElementWithJS(driver, webElement);
            Assert.assertTrue(webElement.isSelected());
        }

        Allure.step("Select the Answer for Section - Automation Question 4");
        WebElement q4 = driver.findElement(By.id(automation.get("q4").getAsString()));
        DriverUtils.clickElementWithJS(driver, q4);
        Assert.assertTrue(q4.isSelected());

        Allure.step("Select the Answer for Section - Automation Question 5");
        WebElement q5 = driver.findElement(By.id(automation.get("q5").getAsString()));
        DriverUtils.clickElementWithJS(driver, q5);
        Assert.assertTrue(q5.isSelected());

        Allure.step("Select the Answer for Section - Automation Question 6");
        WebElement q6 = driver.findElement(By.id(automation.get("q6").getAsString()));
        DriverUtils.clickElementWithJS(driver, q6);
        Assert.assertTrue(q6.isSelected());

        Allure.step("Select the Answer for Section - Automation Question 7");
        WebElement q7 = driver.findElement(By.id(automation.get("q7").getAsString()));
        DriverUtils.clickElementWithJS(driver, q7);
        Assert.assertTrue(q7.isSelected());

        Allure.step("Select the Answer for Section - Automation Question 8");
        WebElement q8 = driver.findElement(By.id(automation.get("q8").getAsString()));
        DriverUtils.clickElementWithJS(driver, q8);
        Assert.assertTrue(q8.isSelected());

        Allure.step("Select the Answer for Section - Automation Question 9");
        WebElement q9 = driver.findElement(By.id(automation.get("q9").getAsString()));
        DriverUtils.clickElementWithJS(driver, q9);
        Assert.assertTrue(q9.isSelected());

        Allure.step("Select the Answer for Section - Automation Question 10");
        WebElement q10 = driver.findElement(By.id(automation.get("q10").getAsString()));
        DriverUtils.clickElementWithJS(driver, q10);
        Assert.assertTrue(q10.isSelected());

        Allure.step("Select the Answer for Section - Automation Question 11");
        WebElement q11 = driver.findElement(By.id(automation.get("q11").getAsString()));
        DriverUtils.clickElementWithJS(driver, q11);
        Assert.assertTrue(q11.isSelected());

        Allure.step("Select the Answer for Section - Automation Question 12");
        WebElement q12 = driver.findElement(By.id(automation.get("q12").getAsString()));
        DriverUtils.clickElementWithJS(driver, q12);
        Assert.assertTrue(q12.isSelected());

        Allure.step("Select the Answer for Section - Automation Question 13");
        WebElement q13 = driver.findElement(By.id(automation.get("q13").getAsString()));
        DriverUtils.clickElementWithJS(driver, q13);
        Assert.assertTrue(q13.isSelected());

    }
}
