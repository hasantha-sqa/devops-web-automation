package org.devops.dataprovider;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import org.devops.scenarios.BaseTest;
import org.testng.annotations.DataProvider;

import java.io.*;
import java.util.Objects;

public class JsonDataProvider extends BaseTest {
    @DataProvider(name = "Questionnaire")
    public Object[] getTestDate() {

        JsonArray jsonArray = null;

        try (FileReader reader = new FileReader("src/test/resources/testdata/QuestionnaireAnswers.json")) {

            jsonArray = JsonParser.parseReader(reader).getAsJsonArray();

        } catch (IOException e) {

            e.printStackTrace();

        }

        Object[] data = new Object[Objects.requireNonNull(jsonArray).size()];

        for (int i = 0; i < jsonArray.size(); i++) {

            data[i] = jsonArray.get(i).getAsJsonObject();

        }
        return data;
    }
}
