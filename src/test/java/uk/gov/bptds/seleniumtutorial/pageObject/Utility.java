package uk.gov.bptds.seleniumtutorial.pageObject;

import org.apache.commons.io.FileUtils;

import com.aventstack.extentreports.utils.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.*;


import java.io.File;
import java.io.IOException;

public class Utility {

    public static String getScreenshot(WebDriver driver){
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("/Users/vasileio.ntokas/Documents/seleniumTutorial/")+System.currentTimeMillis()+".gif";
        File destination = new File(path);

        try{
            FileUtils.copyFile(src,destination);
        }catch(IOException e){
            System.out.println("Captured Failed" + e.getMessage());
        }
        return path;


    }
}
