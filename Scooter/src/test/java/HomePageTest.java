import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class HomePageTest {
    public static HomePageElements homePageElements;
    public static WebDriver driver;

    @Before
    public void startUp() {WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.get("https://qa-scooter.praktikum-services.ru");
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void Test1() {
        HomePageElements homePageElements = new HomePageElements(driver);
        homePageElements.scrollForImportantQuestions();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePageElements.clickHowMuchDoesItCost();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actual = homePageElements.textHowMuchDoesItCost();
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        assertEquals(expected, actual);
    }
    @Test
    public void Test2() {
        HomePageElements homePageElements = new HomePageElements(driver);
        homePageElements.scrollForImportantQuestions();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePageElements.clickWantAFewScootersNow();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actual = homePageElements.textWantAFewScootersNow();
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        assertEquals(expected, actual);
    }
    @Test
    public void Test3() {
        HomePageElements homePageElements = new HomePageElements(driver);
        homePageElements.scrollForImportantQuestions();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePageElements.clickHowDoYouCaclulateTheTime();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actual = homePageElements.textHowDoYouCaclulateTheTime();
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        assertEquals(expected, actual);
    }
    @Test
    public void Test4() {
        HomePageElements homePageElements = new HomePageElements(driver);
        homePageElements.scrollForImportantQuestions();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePageElements.clickIsItPossibleOrderScooterForToday();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actual = homePageElements.textIsItPossibleOrderScooterForToday();
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        assertEquals(expected, actual);
    }
    @Test
    public void Test5() {
        HomePageElements homePageElements = new HomePageElements(driver);
        homePageElements.scrollForImportantQuestions();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePageElements.clickCanIProlongOrBackEarlie();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actual = homePageElements.textCanIProlongOrBackEarlie();
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        assertEquals(expected, actual);
    }
    @Test
    public void Test6() {
        HomePageElements homePageElements = new HomePageElements(driver);
        homePageElements.scrollForImportantQuestions();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePageElements.clickDoYouGiveChargeWithScooter();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actual = homePageElements.textDoYouGiveChargeWithScooter();
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        assertEquals(expected, actual);
    }
    @Test
    public void Test7() {
        HomePageElements homePageElements = new HomePageElements(driver);
        homePageElements.scrollForImportantQuestions();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePageElements.clickCanICancelMyOrder();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actual = homePageElements.textCanICancelMyOrder();
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        assertEquals(expected, actual);
    }
    @Test
    public void Test8() {
        HomePageElements homePageElements = new HomePageElements(driver);
        homePageElements.scrollForImportantQuestions();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePageElements.clickILiveSoFarDoYouCome();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actual = homePageElements.textILiveSoFarDoYouCome();
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        assertEquals(expected, actual);
    }
    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}



