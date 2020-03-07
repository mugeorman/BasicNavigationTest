package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {


        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com" ,
                "https://westelm.com/");





        for (String eachUrls: urls){
            WebDriver driver= BrowserFactory.getDriver("chrome");
            driver.get(eachUrls);
            if(eachUrls.contains(driver.getTitle().replace(" ","").toLowerCase())){

                System.out.println("TEST PASSED");
                System.out.println("url = "+eachUrls );
                System.out.println("title = "+ driver.getTitle());
            }else{
                System.out.println("TEST FAILED");
                System.out.println("url = "+eachUrls );
                System.out.println("title = "+ driver.getTitle());
            }
            driver.quit();
        }




    }
}
