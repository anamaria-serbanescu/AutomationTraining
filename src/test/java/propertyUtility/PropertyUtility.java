package propertyUtility;

import java.io.FileInputStream;
import java.util.*;

public class PropertyUtility {

    private Properties properties;

    public PropertyUtility(String testName){
        loadFile(testName);
    }
    //facem o metoda care sa incarce fisierul de properties
    public void loadFile(String testName){
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/"+testName+"Data.Properties");
            properties.load(fileInputStream);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    //facem o metoda prin care luam o sg valoare de pe cheie
    public String getProperty(String key){
        return properties.getProperty(key);
    }

    //facem o metoda care scoate valoarea de pe o cheie ca si lista de string-uri
    public List<String> getPropertyAsList(String key){
        String value = getProperty(key);
        if (value.contains(",")){
            return Arrays.asList(value.split(","));
        }
        return new ArrayList<>(List.of(value));
    }

    //facem o metoda prin care scoatem intr-un hashmap toate cheile si valorile
   public Map <String, Object> getAllProperties () {
       Map<String, Object> allProperties = new HashMap<>();
       for (String key : properties.stringPropertyNames()){
           String value = getProperty(key);
           if (value.contains(",")){
               allProperties.put(key, getPropertyAsList(key));
           }
           else {
               allProperties.put(key, value);
           }

       }
       return allProperties;
    }


}









