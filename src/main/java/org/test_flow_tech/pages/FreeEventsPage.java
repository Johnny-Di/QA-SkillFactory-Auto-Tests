package org.test_flow_tech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FreeEventsPage {
    private WebDriver driver;

    private String baseUrl = "https://skillfactory.ru/free-events";

    // Локаторы элементов на странице Бесплатных курсов
    private By contactLinkLocator = By.linkText("Контакты");
    private By freeEventsLinkLocator = By.linkText("БЕСПЛАТНО");
    private By careerCenterLinkLocator = By.linkText("Центр карьеры");
    private By onlineCourcesLinkLocator = By.linkText("онлайн-курсы");


    public FreeEventsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void navigateTo() {
        driver.get(baseUrl); // Переход на страницу бесплатных курсов
    }
    public String getTitle() {
        return driver.getTitle();
    }
    //Бесплатно
    public ContactPage clickContactLink() {
        driver.findElement(contactLinkLocator).click();
        return new ContactPage(driver);
    }
    //Контакты
    public FreeEventsPage clickFreeEventsLink() {
        driver.findElement(freeEventsLinkLocator).click();
        return new FreeEventsPage(driver);
    }
    //Центр Карьеры
    public CareerCenterPage clickCareerCenterLink() {
        driver.findElement(careerCenterLinkLocator).click();
        return new CareerCenterPage(driver);
    }

    // Другие методы для взаимодействия с элементами на странице

    // ...
}
