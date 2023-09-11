package org.devops.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.testng.Assert;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Objects;

public class DriverUtils {

    public static void selectAnswers(WebDriver driver, JsonObject answers, String stepName) {

        for (String key : answers.keySet()) {

            Allure.step(stepName + key);

            if (answers.get(key).isJsonArray()) {

                JsonArray q = answers.get(key).getAsJsonArray();

                for (JsonElement jsonElement : q) {

                    WebElement webElement = driver.findElement(By.id(jsonElement.getAsString()));
                    clickElementWithJS(driver, webElement);
                    Assert.assertTrue(webElement.isSelected());

                }

            } else {

                WebElement q = driver.findElement(By.id(answers.get(key).getAsString()));
                clickElementWithJS(driver, q);
                Assert.assertTrue(q.isSelected());

            }
        }
    }

    public static InputStream takeScreenshot(WebDriver driver) throws IOException {

        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

        BufferedImage bufferedImage = ImageIO.read(SrcFile);

        byte[] image = null;
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            ImageIO.write(bufferedImage, "png", bos);
            image = bos.toByteArray();
        } catch (Exception ignored) {
        }
        return new ByteArrayInputStream(Objects.requireNonNull(image));

    }

    public static void clickElementWithJS(WebDriver driver, WebElement elementToClick) {

        String jsClickCode = "arguments[0].scrollIntoView(true); arguments[0].click();";

        try {

            ((JavascriptExecutor) driver).executeScript(jsClickCode, elementToClick);

        }
        catch (Exception e) {

            System.out.println("Element could not be clicked.. " + e.getMessage());

        }
    }

}
