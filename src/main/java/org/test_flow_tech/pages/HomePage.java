package org.test_flow_tech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    // Локаторы элементов на главной странице
    private By contactLinkLocator = By.linkText("Контакты");
    private By freeEventsLinkLocator = By.linkText("БЕСПЛАТНО");
    private By careerCenterLinkLocator = By.linkText("Центр карьеры");
    private By testCourseLinkLocator = By.linkText("Тестирование");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void navigateTo() {
        driver.get("https://skillfactory.ru/");
    }
    public String getTitle() {
        return driver.getTitle();
    }


    //Контакты
    public ContactPage clickContactLink() {
        driver.findElement(contactLinkLocator).click();
        return new ContactPage(driver);
    }
    //Бесплатно
    public FreeEventsPage clickFreeEventsLink() {
        driver.findElement(freeEventsLinkLocator).click();
        return new FreeEventsPage(driver);
    }
    //Центр Карьеры
    public CareerCenterPage clickCareerCenterLink() {
        driver.findElement(careerCenterLinkLocator).click();
        return new CareerCenterPage(driver);
    }

    //Тестирование
    public TestCoursePage clickTestCourseLink() {
        driver.findElement(testCourseLinkLocator).click();
        return new TestCoursePage(driver);
    }




    // ... другие методы ...
}
