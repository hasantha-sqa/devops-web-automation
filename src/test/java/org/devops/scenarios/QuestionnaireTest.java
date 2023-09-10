package org.devops.scenarios;

import com.google.gson.JsonObject;
import io.qameta.allure.Allure;
import org.devops.dataprovider.JsonDataProvider;
import org.devops.utils.DriverUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class QuestionnaireTest extends BaseTest {

    @Test(dataProvider = "Questionnaire", dataProviderClass = JsonDataProvider.class)
    public void zxcTest(JsonObject data) throws IOException {

        Allure.step("Navigate to the URL");
        driver.get("https://do1assessment-e7b0797b1bea.herokuapp.com/");
        Allure.attachment("AboutPage", DriverUtils.takeScreenshot(driver));

        Allure.step("Assert Page Title");
        Assert.assertEquals(driver.getTitle(), "DevOps Maturity Assessment");

        Allure.step("Click Start the Questionnaire Button");
        devOpsMaturityAssessment.aboutPage.buttonStartTheQuestionnaire.click();
        Allure.attachment("QuestionnairePage", DriverUtils.takeScreenshot(driver));

        Allure.step("Click the Next Button");
        devOpsMaturityAssessment.questionnairePage.buttonNext.click();
        Allure.attachment("SectionPage-TeamAgility", DriverUtils.takeScreenshot(driver));

        devOpsMaturityAssessment.sectionsPage.sectionTeamAgility.selectAnswers(data.get("teamAgility").getAsJsonObject());

        Allure.step("Click the Next Button");
        devOpsMaturityAssessment.sectionsPage.buttonNext.click();
        Allure.attachment("SectionPage-Collaboration", DriverUtils.takeScreenshot(driver));

        devOpsMaturityAssessment.sectionsPage.sectionCollaboration.selectAnswers(data.get("collaboration").getAsJsonObject());

        Allure.step("Click the Next Button");
        devOpsMaturityAssessment.sectionsPage.buttonNext.click();
        Allure.attachment("SectionPage-Automation", DriverUtils.takeScreenshot(driver));

        devOpsMaturityAssessment.sectionsPage.sectionAutomation.selectAnswers(data.get("automation").getAsJsonObject());

        Allure.step("Click the Next Button");
        devOpsMaturityAssessment.sectionsPage.buttonNext.click();
        Allure.attachment("SectionPage-ArchitectureAndDesign", DriverUtils.takeScreenshot(driver));

        devOpsMaturityAssessment.sectionsPage.sectionArchitectureAndDesign.selectAnswers(data.get("archAndDesign").getAsJsonObject());

        Allure.step("Click the Next Button");
        devOpsMaturityAssessment.sectionsPage.buttonNext.click();
        Allure.attachment("SectionPage-DevopsPractices", DriverUtils.takeScreenshot(driver));

        devOpsMaturityAssessment.sectionsPage.sectionDevOpsPractices.selectAnswers(data.get("devops").getAsJsonObject());

        Allure.step("Click the Next Button");
        devOpsMaturityAssessment.sectionsPage.buttonNext.click();
        Allure.attachment("SectionPage-OrganizationStructureCultureAndIncentives", DriverUtils.takeScreenshot(driver));

        devOpsMaturityAssessment.sectionsPage.sectionOrgStruCultAndIncentives.selectAnswers(data.get("orgstruc").getAsJsonObject());

        Allure.step("Click the Next Button");
        devOpsMaturityAssessment.sectionsPage.buttonNext.click();
        Allure.attachment("SectionPage-Standardisation", DriverUtils.takeScreenshot(driver));

        devOpsMaturityAssessment.sectionsPage.sectionStandardisation.selectAnswers(data.get("standardisation").getAsJsonObject());

        Allure.step("Click the Next Button");
        devOpsMaturityAssessment.sectionsPage.buttonNext.click();
        Allure.attachment("SectionPage-Security", DriverUtils.takeScreenshot(driver));

        devOpsMaturityAssessment.sectionsPage.sectionSecurity.selectAnswers(data.get("security").getAsJsonObject());

        Allure.step("Click the View Results Button");
        devOpsMaturityAssessment.sectionsPage.buttonViewResults.click();
        Allure.attachment("ResultsPage", DriverUtils.takeScreenshot(driver));

    }


}
