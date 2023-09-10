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

public class SectionStandardisation {

    WebDriver driver;

    public SectionStandardisation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "S8-Q1-A1")
    public WebElement checkBoxQ1Option1;
    @FindBy(how = How.ID, using = "S8-Q1-A2")
    public WebElement checkBoxQ1Option2;
    @FindBy(how = How.ID, using = "S8-Q1-A3")
    public WebElement checkBoxQ1Option3;
    @FindBy(how = How.ID, using = "S8-Q1-A4")
    public WebElement checkBoxQ1Option4;

    @FindBy(how = How.ID, using = "S8-Q2-A1")
    public WebElement radioButtonQ2Option1;
    @FindBy(how = How.ID, using = "S8-Q2-A2")
    public WebElement radioButtonQ2Option2;
    @FindBy(how = How.ID, using = "S8-Q2-A3")
    public WebElement radioButtonQ2Option3;

    @FindBy(how = How.ID, using = "S8-Q3-A1")
    public WebElement radioButtonQ3Yes;
    @FindBy(how = How.ID, using = "S8-Q3-A2")
    public WebElement radioButtonQ3No;

    @FindBy(how = How.ID, using = "S8-Q4-A1")
    public WebElement radioButtonQ4Yes;
    @FindBy(how = How.ID, using = "S8-Q4-A2")
    public WebElement radioButtonQ4No;

    @FindBy(how = How.ID, using = "S8-Q5-A1")
    public WebElement radioButtonQ5Yes;
    @FindBy(how = How.ID, using = "S8-Q5-A2")
    public WebElement radioButtonQ5No;

    public void selectAnswers(JsonObject standardisation) {

        Allure.step("Select the Answer for Section - Standardisation Question 1");
        JsonArray q1 = standardisation.get("q1").getAsJsonArray();
        for (JsonElement jsonElement : q1) {
            WebElement webElement = driver.findElement(By.id(jsonElement.getAsString()));
            DriverUtils.clickElementWithJS(driver, webElement);
            Assert.assertTrue(webElement.isSelected());
        }

        Allure.step("Select the Answer for Section - Standardisation Question 2");
        WebElement q2 = driver.findElement(By.id(standardisation.get("q2").getAsString()));
        DriverUtils.clickElementWithJS(driver, q2);
        Assert.assertTrue(q2.isSelected());

        Allure.step("Select the Answer for Section - Standardisation Question 3");
        WebElement q3 = driver.findElement(By.id(standardisation.get("q3").getAsString()));
        DriverUtils.clickElementWithJS(driver, q3);
        Assert.assertTrue(q3.isSelected());

        Allure.step("Select the Answer for Section - Standardisation Question 4");
        WebElement q4 = driver.findElement(By.id(standardisation.get("q4").getAsString()));
        DriverUtils.clickElementWithJS(driver, q4);
        Assert.assertTrue(q4.isSelected());

        Allure.step("Select the Answer for Section - Standardisation Question 5");
        WebElement q5 = driver.findElement(By.id(standardisation.get("q5").getAsString()));
        DriverUtils.clickElementWithJS(driver, q5);
        Assert.assertTrue(q5.isSelected());
    }
}
