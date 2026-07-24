package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.File;
import java.io.FileReader;

public class DataDriven {

    public static String jsonReader(String objectName, String keyName) {
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "testData" + File.separator + "testData.json";        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader(filePath)) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            JSONObject targetObject = (JSONObject) jsonObject.get(objectName);

            if (targetObject == null) {
                System.err.println("Object not found in JSON: " + objectName);
                return null;
            }

            return (String) targetObject.get(keyName);

        } catch (Exception e) {
            System.err.println("Failed to read file at path: " + filePath);
            e.printStackTrace();
            return null;
        }
    }
}