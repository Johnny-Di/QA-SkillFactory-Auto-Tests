package org.test_flow_tech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class ContactPage {
        private WebDriver driver;
        private String baseUrl = "https://skillfactory.ru/contacts"; // URL страницы контактов

        // Локаторы элементов на странице контактов
        private By contactLinkLocator = By.linkText("Контакты");
        private By freeEventsLinkLocator = By.linkText("БЕСПЛАТНО");
        private By careerCenterLinkLocator = By.linkText("Центр карьеры");
        private By onlineCourcesLinkLocator = By.linkText("онлайн-курсы");


        public ContactPage(WebDriver driver) {
            this.driver = driver;
        }

        public void navigateTo() {
            driver.get(baseUrl); // Переход на страницу контактов
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

        // ... другие методы для взаимодействия с элементами на странице контактов ...
    }
