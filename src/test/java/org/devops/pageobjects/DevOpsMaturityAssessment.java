package org.devops.pageobjects;

import org.openqa.selenium.WebDriver;

public class DevOpsMaturityAssessment {

    public AboutPage aboutPage;
    public QuestionnairePage questionnairePage;
    public SectionsPage sectionsPage;

    public DevOpsMaturityAssessment(WebDriver driver) {

        this.aboutPage = new AboutPage(driver);
        this.questionnairePage = new QuestionnairePage(driver);
        this.sectionsPage = new SectionsPage(driver);

    }
}
