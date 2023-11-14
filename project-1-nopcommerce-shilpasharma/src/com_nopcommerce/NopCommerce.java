package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class NopCommerce {
    // setup Chrome browser
    static String browser = "Chrome";
    static String baseUrl = "https://demo.nopcommerce.com";
    static WebDriver driver;

    public static void main(String[] args) {
        // multiple browser
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firepox")){
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        // open url
        driver.get(baseUrl);
        // maximize the window
        driver.manage().window().maximize();
        // time out for hold the page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // print the title of page
        System.out.println(driver.getTitle());
        // print the current url
        System.out.println(driver.getCurrentUrl());
        //print the page source
        System.out.println(driver.getPageSource());
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F" ;
        //navigate to other url
        driver.navigate().to(loginUrl);
        //print current url
        //Print current URL
        System.out.println("This is the current URL : " + driver.getCurrentUrl());
        //navigate back to home page
        driver.navigate().back();
        //navigate to the login page
        driver.navigate().forward();
        // print the current url
        System.out.println("This is the current URL : " + driver.getCurrentUrl());
        //refresh page
        driver.navigate().refresh();
        //enter the email to email field
        driver.findElement(By.id("Email")).sendKeys("shilpa@gmail.com");
         //enter the password to password field
        driver.findElement(By.id("Passwpord")).sendKeys("4567");
        //click on login button
        driver.findElement(By.linkText("log in")).click();
        //close the browser
        driver.quit();


        }

    }


