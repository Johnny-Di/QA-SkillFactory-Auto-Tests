package org.test_flow_tech.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.net.URL;

public class WebDriverFactory {
    public static WebDriver createWebDriver() {
        // Получение URL к chromedriver в директории resources
        URL chromedriverUrl = WebDriverFactory.class.getClassLoader().getResource("chromedriver.exe");

        if (chromedriverUrl == null) {
            throw new IllegalStateException("Failed to load chromedriver");
        }

        // Преобразование URL в File
        File chromedriverFile = new File(chromedriverUrl.getFile());

        // Установка системного свойства и создание WebDriver
        System.setProperty("webdriver.chrome.driver", chromedriverFile.getAbsolutePath());
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        return driver;
    }
}
