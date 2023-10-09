import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.test_flow_tech.pages.*;
import org.test_flow_tech.utils.WebDriverFactory;

import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;


public class HomePageTests {
    private WebDriver driver;
    private HomePage homePage;



    @Before
    public void setup() {
        driver = WebDriverFactory.createWebDriver(); // Метод создания веб-драйвера
        homePage = new HomePage(driver);
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    //Проверка заголовка Главной страницы:
    @Test
    public void testHomePageTitle() {
        homePage.navigateTo();
        assertEquals("Онлайн-школа Skillfactory — онлайн-обучение востребованным IT-профессиям", homePage.getTitle());
    }

    //Проверка перехода с Главной страницы на Контакты:
    @Test
    public void testNavigateToContactPage() {
        homePage.navigateTo();
        ContactPage contactPage = homePage.clickContactLink();
        // Проверки на странице контактов
    }
    //Проверка перехода с Главной страницы на страницу Бесплатно:
    @Test
    public void testNavigateToFreeCoursesPage() {
        homePage.navigateTo();
        FreeEventsPage freeEventsPage = homePage.clickFreeEventsLink();

    }
    //Проверка перехода с Главной страницы на страницу Центр Карьеры:
    @Test
    public void testNavigateToCareerCenterPage() {
        homePage.navigateTo();
        CareerCenterPage careerCenterPage = homePage.clickCareerCenterLink();

    }

    //Проверка перехода с Главной страницы на страницу Курсов Тестирования:
    @Test
    public void testNavigateToTestCoursePage() {
        homePage.navigateTo();
        TestCoursePage testCoursePage = homePage.clickTestCourseLink();

    }



    // Другие тесты для главной страницы
}

