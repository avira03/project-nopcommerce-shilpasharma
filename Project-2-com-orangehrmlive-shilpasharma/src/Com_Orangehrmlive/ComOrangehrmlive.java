package Com_Orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ComOrangehrmlive {
    // setup Chrome browser
    static String browser = "Chrome";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        // multiple browser
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firepox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");


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
            // Click on ‘Forgot your password?’ link.
            WebElement pass = driver.findElement(By.className("orangehrm-login-forgot-header"));
            pass.click();
            //Print current URL
            System.out.println(driver.getCurrentUrl());
            //Navigate back to the login page.
            driver.navigate().to(baseUrl);
            //Refresh the page
            driver.navigate().refresh();
            //Enter the email to email field
            driver.findElement(By.name("username")).sendKeys("Admin");
            //Enter the password field
            driver.findElement(By.name("password")).sendKeys("admin123");
            //Click on login button
            WebElement login = driver.findElement(By.className("orangehrm-login-button"));
            login.click();
            //close the browser
            driver.quit();

        }
        }

    }