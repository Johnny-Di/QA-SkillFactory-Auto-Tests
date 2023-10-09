import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.test_flow_tech.pages.*;
import org.test_flow_tech.utils.WebDriverFactory;

import static org.junit.Assert.assertEquals;

public class CareerCenterPageTests {
    private WebDriver driver;
    private CareerCenterPage careerCenterPage;
    @Before
    public void setup() {
        driver = WebDriverFactory.createWebDriver(); // Метод создания веб-драйвера
        careerCenterPage = new CareerCenterPage(driver);
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    //Проверка заголовка страницы Центра Карьеры:
    @Test
    public void testCareerCenterPageTitle() {
        careerCenterPage.navigateTo();
        assertEquals("Центр карьеры SkillFactory", careerCenterPage.getTitle());
    }
    //Проверка перехода со страницы Центр Карьеры на страницу Контакты:
    @Test
    public void testNavigateToContactPage() {
        careerCenterPage.navigateTo();
        ContactPage contactPage = careerCenterPage.clickContactLink();
        // Проверки на странице контактов
    }
    //Проверка перехода со страницы Центр Карьеры на страницу Бесплатно:
    @Test
    public void testNavigateToFreeCoursesPage() {
        careerCenterPage.navigateTo();
        FreeEventsPage freeEventsPage = careerCenterPage.clickFreeEventsLink();
        // Проверки на странице бесплатных курсов
    }
    // Проверка перехода со страницы Центр Карьеры на нее же
    @Test
    public void testNavigateToCareerCenterPage() {
        careerCenterPage.navigateTo();
        CareerCenterPage careerCenterPage;

    }
}
