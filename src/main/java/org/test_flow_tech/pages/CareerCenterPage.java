package org.test_flow_tech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CareerCenterPage {
    private WebDriver driver;
    private String baseUrl = "https://skillfactory.ru/career-center";
    // Локаторы элементов на странице Центр карьеры
    private By contactLinkLocator = By.linkText("Контакты");
    private By freeEventsLinkLocator = By.linkText("Бесплатно");
    private By careerCenterLinkLocator = By.linkText("Центр карьеры");
    private By onlineCourcesLinkLocator = By.linkText("онлайн-курсы");

    public CareerCenterPage(WebDriver driver) {
        this.driver = driver;
    }
    public void navigateTo() {
        driver.get(baseUrl); // Переход на страницу Центра Карьеры
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

    // Другие методы для взаимодействия с элементами на странице центра карьеры
}
