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

        Allure.step("Select the Answer for Section - Security Question 1");
        WebElement q1 = driver.findElement(By.id(security.get("q1").getAsString()));
        DriverUtils.clickElementWithJS(driver, q1);
        Assert.assertTrue(q1.isSelected());

        Allure.step("Select the Answer for Section - Security Question 2");
        WebElement q2 = driver.findElement(By.id(security.get("q2").getAsString()));
        DriverUtils.clickElementWithJS(driver, q2);
        Assert.assertTrue(q2.isSelected());

        Allure.step("Select the Answer for Section - Security Question 3");
        WebElement q3 = driver.findElement(By.id(security.get("q3").getAsString()));
        DriverUtils.clickElementWithJS(driver, q3);
        Assert.assertTrue(q3.isSelected());

        Allure.step("Select the Answer for Section - Security Question 4");
        JsonArray q4 = security.get("q4").getAsJsonArray();
        for (JsonElement jsonElement : q4) {
            WebElement webElement = driver.findElement(By.id(jsonElement.getAsString()));
            DriverUtils.clickElementWithJS(driver, webElement);
            Assert.assertTrue(webElement.isSelected());
        }

    }
}
