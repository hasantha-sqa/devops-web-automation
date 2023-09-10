package org.devops.utils;

import org.openqa.selenium.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Objects;

public class DriverUtils {

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
        } catch (Exception e) {
            System.out.println("Element could not be clicked.. " + e.getMessage());
        }

    }

}
