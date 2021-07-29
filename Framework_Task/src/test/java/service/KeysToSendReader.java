package service;

import java.util.ResourceBundle;

public class KeysToSendReader {
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle(System.getProperty("environment"));

    public static String getKeyData(String key){
        return resourceBundle.getString(key);
    }
}
