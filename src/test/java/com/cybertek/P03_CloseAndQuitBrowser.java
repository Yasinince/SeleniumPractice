package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_CloseAndQuitBrowser {

    public static void main(String[] args) throws InterruptedException {

        //set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to a practice page that open new tab
        driver.get("https://practice.cybertekschool.com/open_new_tab");

        Thread.sleep(5000);
        //close method any current browser tab that in focus
        driver.close();

        //close all browsers window opened by driver
        driver.quit();


    }

}
