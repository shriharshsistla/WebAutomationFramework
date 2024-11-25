package com.testingpractice.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyReader {
    public PropertyReader(){

    }

    public static String readKey(String key){
        FileInputStream fileInputStream = null;
        Properties p = null;
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir")+"src/main/resource/data.properties");
            p=new Properties();
            p.load(fileInputStream);

        } catch (Exception exception) {
            exception.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            }catch (Exception exception){
                exception.printStackTrace();
            }
        }
        return p.getProperty(key);
    }
}
