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

        Allure.step("Select the Answer for Section - Team Agility Question 1");
        WebElement q1 = driver.findElement(By.id(teamAgility.get("q1").getAsString()));
        DriverUtils.clickElementWithJS(driver, q1);
        Assert.assertTrue(q1.isSelected());

        Allure.step("Select the Answer for Section - Team Agility Question 2");
        JsonArray q2 = teamAgility.get("q2").getAsJsonArray();
        for (JsonElement jsonElement : q2) {
            WebElement webElement = driver.findElement(By.id(jsonElement.getAsString()));
            DriverUtils.clickElementWithJS(driver, webElement);
            Assert.assertTrue(webElement.isSelected());
        }

        Allure.step("Select the Answer for Section - Team Agility Question 3");
        WebElement q3 = driver.findElement(By.id(teamAgility.get("q3").getAsString()));
        DriverUtils.clickElementWithJS(driver, q3);
        Assert.assertTrue(q3.isSelected());

        Allure.step("Select the Answer for Section - Team Agility Question 4");
        WebElement q4 = driver.findElement(By.id(teamAgility.get("q4").getAsString()));
        DriverUtils.clickElementWithJS(driver, q4);
        Assert.assertTrue(q4.isSelected());

        Allure.step("Select the Answer for Section - Team Agility Question 5");
        WebElement q5 = driver.findElement(By.id(teamAgility.get("q5").getAsString()));
        DriverUtils.clickElementWithJS(driver, q5);
        Assert.assertTrue(q5.isSelected());

        Allure.step("Select the Answer for Section - Team Agility Question 6");
        WebElement q6 = driver.findElement(By.id(teamAgility.get("q6").getAsString()));
        DriverUtils.clickElementWithJS(driver, q6);
        Assert.assertTrue(q6.isSelected());

        Allure.step("Select the Answer for Section - Team Agility Question 7");
        WebElement q7 = driver.findElement(By.id(teamAgility.get("q7").getAsString()));
        DriverUtils.clickElementWithJS(driver, q7);
        Assert.assertTrue(q7.isSelected());

        Allure.step("Select the Answer for Section - Team Agility Question 8");
        WebElement q8 = driver.findElement(By.id(teamAgility.get("q8").getAsString()));
        DriverUtils.clickElementWithJS(driver, q8);
        Assert.assertTrue(q8.isSelected());

        Allure.step("Select the Answer for Section - Team Agility Question 9");
        JsonArray q9 = teamAgility.get("q9").getAsJsonArray();
        for (JsonElement jsonElement : q9) {
            WebElement webElement = driver.findElement(By.id(jsonElement.getAsString()));
            DriverUtils.clickElementWithJS(driver, webElement);
            Assert.assertTrue(webElement.isSelected());
        }

        Allure.step("Select the Answer for Section - Team Agility Question 10");
        WebElement q10 = driver.findElement(By.id(teamAgility.get("q10").getAsString()));
        DriverUtils.clickElementWithJS(driver, q10);
        Assert.assertTrue(q10.isSelected());

    }
}
