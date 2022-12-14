import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrderScooterTest {

    public static OrderScooterTest orderScooterTest;
    public static WebDriver driver;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru");
    }

    @Test //тест с первой кнопкой заказа самоката
    public void Test1() {
        OrderScooterElements orderScooterElements = new OrderScooterElements(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        orderScooterElements.clickOrderButton1(); //шаг1
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        orderScooterElements.clickNameForOrder(); //шаг2
        orderScooterElements.setUsername("Имя");
        orderScooterElements.clickSurnameForOrder(); //шаг3
        orderScooterElements.setUserSurname("Фамилия");
        orderScooterElements.clickAdressForOrder(); //шаг4
        orderScooterElements.setAdress("Адрес");
        orderScooterElements.clickMetroStationForOrder(); //шаг5
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        orderScooterElements.clickChooseMetroStationForOrder();
        orderScooterElements.clickTelephoneForOrder(); //шаг6
        orderScooterElements.setTelephone("12345678900");
        orderScooterElements.clickNextButtonForOrder(); //шаг7
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        orderScooterElements.clickWhenDoYouWantToGetScooter(); //шаг8
        orderScooterElements.clickWhenDoYouWantToGetScooterCalendar();
        orderScooterElements.clickTimeOfRent(); //шаг9
        orderScooterElements.clickTimeOfRentChoose();
        orderScooterElements.clickColorOfScooter(); //шаг10
        orderScooterElements.clickFinalOrderButton(); //шаг11
        orderScooterElements.clickYesButtonConfirmOrder(); //шаг12
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.className(".//div[@class='Order_ModalHeader__3FDaJ']//*[text()='Заказ оформлен']")); //Шаг 13: проверяем, что появилось всплывающее окно с сообщением "Заказ оформлен"
    }

    @Test //тест со второй кнопкой заказа самоката
    public void Test2() {
        OrderScooterElements orderScooterElements = new OrderScooterElements(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        orderScooterElements.scrollForOrderButton2(); //шаг0
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        orderScooterElements.clickOrderButton2(); //шаг1
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        orderScooterElements.clickNameForOrder(); //шаг2
        orderScooterElements.setUsername("Имя");
        orderScooterElements.clickSurnameForOrder(); //шаг3
        orderScooterElements.setUserSurname("Фамилия");
        orderScooterElements.clickAdressForOrder(); //шаг4
        orderScooterElements.setAdress("Адрес");
        orderScooterElements.clickMetroStationForOrder(); //шаг5
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        orderScooterElements.clickChooseMetroStationForOrder();
        orderScooterElements.clickTelephoneForOrder(); //шаг6
        orderScooterElements.setTelephone("12345678900");
        orderScooterElements.clickNextButtonForOrder(); //шаг7
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        orderScooterElements.clickWhenDoYouWantToGetScooter(); //шаг8
        orderScooterElements.clickWhenDoYouWantToGetScooterCalendar();
        orderScooterElements.clickTimeOfRent(); //шаг9
        orderScooterElements.clickTimeOfRentChoose();
        orderScooterElements.clickColorOfScooter(); //шаг10
        orderScooterElements.clickFinalOrderButton(); //шаг11
        orderScooterElements.clickYesButtonConfirmOrder(); //шаг12
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.className(".//div[@class='Order_ModalHeader__3FDaJ']//*[text()='Заказ оформлен']")); //Шаг 13: проверяем, что появилось всплывающее окно с сообщением "Заказ оформлен"
    }


    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
