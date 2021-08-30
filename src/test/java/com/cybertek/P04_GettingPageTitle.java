package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class P04_GettingPageTitle {

    public static void main(String[] args) {

    // set up chrome and create WebDriver instance
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    // navigate to google and get page title from the tab
        driver.get("https://cybertekschool.com");

        String pageTitle = driver.getTitle();
        System.out.println("pageTitle = " + pageTitle);


        //quit the browser
        driver.quit();
}
}
