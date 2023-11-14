package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ComHerokuapp {

        // setup Chrome browser
        static String browser = "Chrome";
        static String baseUrl = "http://the-internet.herokuapp.com/login";
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
            //enter the email to email field
            driver.findElement(By.id("username")).sendKeys("peter");
            //enter the password to password field
            driver.findElement(By.id("Passwpord")).sendKeys("4567");
            //click on login button
            driver.findElement(By.className("radius")).click();
            // print the current url
            System.out.println(driver.getCurrentUrl());
            //refresh page
            driver.navigate().refresh();
            //close the browser
            driver.quit();

        }
    }


