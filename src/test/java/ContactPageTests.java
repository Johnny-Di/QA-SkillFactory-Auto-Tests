import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.test_flow_tech.pages.*;
import org.test_flow_tech.utils.WebDriverFactory;
import static org.junit.Assert.*;
public class ContactPageTests {
    private WebDriver driver;
    private ContactPage contactPage;

    @Before
    public void setup() {
        driver = WebDriverFactory.createWebDriver(); // Метод создания веб-драйвера
        contactPage = new ContactPage(driver);
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    //Проверка заголовка страницы Контактов:
    @Test
    public void testContactPageTitle() {
        contactPage.navigateTo();
        assertEquals("Контакты школы по работе с данными Skillfactory", contactPage.getTitle());
    }
    //Проверка перехода со страницы Контакты на нее же
    @Test
    public void testNavigateToContactPage() {
        contactPage.navigateTo();
        ContactPage contactPage;
        // Проверки на странице контактов
    }
    //Проверка перехода со страницы Контакты на страницу Бесплатно:
    @Test
    public void testNavigateToFreeCoursesPage() {
        contactPage.navigateTo();
        FreeEventsPage freeEventsPage = contactPage.clickFreeEventsLink();

    }
    //Проверка перехода со страницы Контакты на страницу Центр Карьеры:
    @Test
    public void testNavigateToCareerCenterPage() {
        contactPage.navigateTo();
        CareerCenterPage careerCenterPage = contactPage.clickCareerCenterLink();

    }

}
