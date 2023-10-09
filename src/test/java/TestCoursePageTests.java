import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.test_flow_tech.pages.*;
import org.test_flow_tech.utils.WebDriverFactory;
import static org.junit.Assert.*;

public class TestCoursePageTests {

    private WebDriver driver;
    private TestCoursePage testCoursePage;

    @Before
    public void setup() {
        driver = WebDriverFactory.createWebDriver(); // Метод создания веб-драйвера
        testCoursePage = new TestCoursePage(driver);
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    //Проверка заголовка страницы Курсов Тестирования:
    @Test
    public void testTestCoursePageTitle() {
        testCoursePage.navigateTo();
        assertEquals("Курсы тестировщиков, обучение QA-инженеров с нуля", testCoursePage.getTitle());
    }
    //Проверка перехода со страницы Курсов Тестирования на страницу Контакты
    @Test
    public void testNavigateToContactPage() {
        testCoursePage.navigateTo();
        ContactPage contactEventsPage = testCoursePage.clickContactLink();
        // Проверки на странице контактов
    }
    //Проверка перехода со страницы Курсов Тестирования на страницу Бесплатно:
    @Test
    public void testNavigateToFreeCoursesPage() {
        testCoursePage.navigateTo();
        FreeEventsPage freeEventsPage = testCoursePage.clickFreeEventsLink();

    }
    //Проверка перехода со страницы Курсов Тестирования на страницу Центр Карьеры:
    @Test
    public void testNavigateToCareerCenterPage() {
        testCoursePage.navigateTo();
        CareerCenterPage careerCenterPage = testCoursePage.clickCareerCenterLink();

    }
}
