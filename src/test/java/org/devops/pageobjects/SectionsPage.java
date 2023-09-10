package org.devops.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SectionsPage {

    public SectionTeamAgility sectionTeamAgility;
    public SectionCollaboration sectionCollaboration;
    public SectionAutomation sectionAutomation;
    public SectionDevOpsPractices sectionDevOpsPractices;
    public SectionArchitectureAndDesign sectionArchitectureAndDesign;
    public SectionOrgStruCultAndIncentives sectionOrgStruCultAndIncentives;
    public SectionStandardisation sectionStandardisation;
    public SectionSecurity sectionSecurity;

    public SectionsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

        this.sectionTeamAgility = new SectionTeamAgility(driver);
        this.sectionCollaboration = new SectionCollaboration(driver);
        this.sectionAutomation = new SectionAutomation(driver);
        this.sectionArchitectureAndDesign = new SectionArchitectureAndDesign(driver);
        this.sectionDevOpsPractices = new SectionDevOpsPractices(driver);
        this.sectionOrgStruCultAndIncentives = new SectionOrgStruCultAndIncentives(driver);
        this.sectionStandardisation = new SectionStandardisation(driver);
        this.sectionSecurity = new SectionSecurity(driver);

    }

    @FindBy(how = How.XPATH, using = ".//button[text()='Previous']")
    public WebElement buttonPrevious;
    @FindBy(how = How.XPATH, using = ".//button[text()='Next']")
    public WebElement buttonNext;
    @FindBy(how = How.XPATH, using = ".//button[text()='View Results']")
    public WebElement buttonViewResults;

}
