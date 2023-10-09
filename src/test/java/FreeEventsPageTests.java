import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.test_flow_tech.pages.*;
import org.test_flow_tech.utils.WebDriverFactory;

import static org.junit.Assert.assertEquals;

public class FreeEventsPageTests {
    private WebDriver driver;
    private FreeEventsPage freeEventsPage;

    @Before
    public void setup() {
        driver = WebDriverFactory.createWebDriver(); // Метод создания веб-драйвера
        freeEventsPage = new FreeEventsPage(driver);
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    //Проверка заголовка страницы Бесплатных курсов:
    @Test
    public void freeEventsPageTitle() {
        freeEventsPage.navigateTo();
        assertEquals("Бесплатные курсы, онлайн обучение профессиям с " +
                "получением сертификата, семинары и вебинары бесплатно от Skillfactory", freeEventsPage.getTitle());
    }

    //Проверка перехода со страницы Бесплатно на страницу Контакты:
    @Test
    public void testNavigateToContactPage() {
        freeEventsPage.navigateTo();
        ContactPage contactPage = freeEventsPage.clickContactLink();
        // Проверки на странице контактов
    }
    //Проверка перехода со страницы Бесплатно на нее же:
    @Test
    public void testNavigateToFreeCoursesPage() {
        freeEventsPage.navigateTo();
        FreeEventsPage freeEventsPage;

    }
    //Проверка перехода со страницы Бесплатно на страницу Центр Карьеры:
    @Test
    public void testNavigateToCareerCenterPage() {
        freeEventsPage.navigateTo();
        CareerCenterPage careerCenterPage = freeEventsPage.clickCareerCenterLink();
        // Проверки на странице центра карьеры
    }
}
