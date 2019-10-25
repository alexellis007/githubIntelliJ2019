package com.ellisgroup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstChromeTest {

    public static void main(String[] args) {
	// write your code here

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yellis\\IdeaProjects\\SeleniumDrivers\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        driver.close();
        driver.quit();
        
    }
}
