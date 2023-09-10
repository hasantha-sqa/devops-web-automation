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

        Allure.step("Select the Answer for Section - Organization Structure, Culture And Incentives Question 1");
        WebElement q1 = driver.findElement(By.id(sectionOrgStruCultAndIncentives.get("q1").getAsString()));
        DriverUtils.clickElementWithJS(driver, q1);
        Assert.assertTrue(q1.isSelected());

        Allure.step("Select the Answer for Section - Organization Structure, Culture And Incentives Question 2");
        WebElement q2 = driver.findElement(By.id(sectionOrgStruCultAndIncentives.get("q2").getAsString()));
        DriverUtils.clickElementWithJS(driver, q2);
        Assert.assertTrue(q2.isSelected());

        Allure.step("Select the Answer for Section - Organization Structure, Culture And Incentives Question 3");
        WebElement q3 = driver.findElement(By.id(sectionOrgStruCultAndIncentives.get("q3").getAsString()));
        DriverUtils.clickElementWithJS(driver, q3);
        Assert.assertTrue(q3.isSelected());

        Allure.step("Select the Answer for Section - Organization Structure, Culture And Incentives Question 4");
        WebElement q4 = driver.findElement(By.id(sectionOrgStruCultAndIncentives.get("q4").getAsString()));
        DriverUtils.clickElementWithJS(driver, q4);
        Assert.assertTrue(q4.isSelected());

        Allure.step("Select the Answer for Section - Organization Structure, Culture And Incentives Question 5");
        WebElement q5 = driver.findElement(By.id(sectionOrgStruCultAndIncentives.get("q5").getAsString()));
        DriverUtils.clickElementWithJS(driver, q5);
        Assert.assertTrue(q5.isSelected());

        Allure.step("Select the Answer for Section - Organization Structure, Culture And Incentives Question 6");
        WebElement q6 = driver.findElement(By.id(sectionOrgStruCultAndIncentives.get("q6").getAsString()));
        DriverUtils.clickElementWithJS(driver, q6);
        Assert.assertTrue(q6.isSelected());

        Allure.step("Select the Answer for Section - Organization Structure, Culture And Incentives Question 7");
        WebElement q7 = driver.findElement(By.id(sectionOrgStruCultAndIncentives.get("q7").getAsString()));
        DriverUtils.clickElementWithJS(driver, q7);
        Assert.assertTrue(q7.isSelected());

        Allure.step("Select the Answer for Section - Organization Structure, Culture And Incentives Question 8");
        WebElement q8 = driver.findElement(By.id(sectionOrgStruCultAndIncentives.get("q8").getAsString()));
        DriverUtils.clickElementWithJS(driver, q8);
        Assert.assertTrue(q8.isSelected());

        Allure.step("Select the Answer for Section - Organization Structure, Culture And Incentives Question 9");
        WebElement q9 = driver.findElement(By.id(sectionOrgStruCultAndIncentives.get("q9").getAsString()));
        DriverUtils.clickElementWithJS(driver, q9);
        Assert.assertTrue(q9.isSelected());

        Allure.step("Select the Answer for Section - Organization Structure, Culture And Incentives Question 10");
        WebElement q10 = driver.findElement(By.id(sectionOrgStruCultAndIncentives.get("q10").getAsString()));
        DriverUtils.clickElementWithJS(driver, q10);
        Assert.assertTrue(q10.isSelected());

        Allure.step("Select the Answer for Section - Organization Structure, Culture And Incentives Question 11");
        WebElement q11 = driver.findElement(By.id(sectionOrgStruCultAndIncentives.get("q11").getAsString()));
        DriverUtils.clickElementWithJS(driver, q11);
        Assert.assertTrue(q11.isSelected());

        Allure.step("Select the Answer for Section - Organization Structure, Culture And Incentives Question 12");
        WebElement q12 = driver.findElement(By.id(sectionOrgStruCultAndIncentives.get("q12").getAsString()));
        DriverUtils.clickElementWithJS(driver, q12);
        Assert.assertTrue(q12.isSelected());

        Allure.step("Select the Answer for Section - Organization Structure, Culture And Incentives Question 13");
        WebElement q13 = driver.findElement(By.id(sectionOrgStruCultAndIncentives.get("q13").getAsString()));
        DriverUtils.clickElementWithJS(driver, q13);
        Assert.assertTrue(q13.isSelected());

        Allure.step("Select the Answer for Section - Organization Structure, Culture And Incentives Question 14");
        WebElement q14 = driver.findElement(By.id(sectionOrgStruCultAndIncentives.get("q14").getAsString()));
        DriverUtils.clickElementWithJS(driver, q14);
        Assert.assertTrue(q14.isSelected());

        Allure.step("Select the Answer for Section - Organization Structure, Culture And Incentives Question 15");
        WebElement q15 = driver.findElement(By.id(sectionOrgStruCultAndIncentives.get("q15").getAsString()));
        DriverUtils.clickElementWithJS(driver, q15);
        Assert.assertTrue(q15.isSelected());

        Allure.step("Select the Answer for Section - Organization Structure, Culture And Incentives Question 16");
        WebElement q16 = driver.findElement(By.id(sectionOrgStruCultAndIncentives.get("q16").getAsString()));
        DriverUtils.clickElementWithJS(driver, q16);
        Assert.assertTrue(q16.isSelected());

        Allure.step("Select the Answer for Section - Organization Structure, Culture And Incentives Question 17");
        WebElement q17 = driver.findElement(By.id(sectionOrgStruCultAndIncentives.get("q17").getAsString()));
        DriverUtils.clickElementWithJS(driver, q17);
        Assert.assertTrue(q17.isSelected());

        Allure.step("Select the Answer for Section - Organization Structure, Culture And Incentives Question 18");
        WebElement q18 = driver.findElement(By.id(sectionOrgStruCultAndIncentives.get("q18").getAsString()));
        DriverUtils.clickElementWithJS(driver, q18);
        Assert.assertTrue(q18.isSelected());

        Allure.step("Select the Answer for Section - Organization Structure, Culture And Incentives Question 19");
        WebElement q19 = driver.findElement(By.id(sectionOrgStruCultAndIncentives.get("q19").getAsString()));
        DriverUtils.clickElementWithJS(driver, q19);
        Assert.assertTrue(q19.isSelected());
    }
}
