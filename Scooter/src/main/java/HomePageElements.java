import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageElements {
    private WebDriver driver;
    public HomePageElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    public void waitForLoadHomePage(){
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Home_Header__iJKdX")));}


    //public String parameterForWait;
    //public void waitForIt(String parameterForWait){
        //new WebDriverWait(driver, 5)
                //.until(ExpectedConditions.visibilityOfElementLocated(By.id(parameterForWait))); }

    public void scrollForImportantQuestions() {
        WebElement element = driver.findElement(By.id("accordion__heading-0"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);}



    //ТЕСТ 1:  подраздел Сколько это стоит? И как оплатить?
    private By howMuchDoesItCost = By.id("accordion__heading-0");
    public void clickHowMuchDoesItCost() {
        driver.findElement(howMuchDoesItCost).click();}
    public String textHowMuchDoesItCost() {
        return driver.findElement(By.id("accordion__panel-0")).getText();}



    //ТЕСТ 2: подраздел Хочу сразу несколько самокатов! Так можно?
    private By wantAFewScootersNow = By.id("accordion__heading-1");
    public void clickWantAFewScootersNow() {
        driver.findElement(wantAFewScootersNow).click();}
    public String textWantAFewScootersNow() {
        return driver.findElement(By.id("accordion__panel-1")).getText();}


    // ТЕСТ 3: Как рассчитывается время аренды?
    private By howDoYouCaclulateTheTime = By.id("accordion__heading-2");
    public void clickHowDoYouCaclulateTheTime() {
     driver.findElement(howDoYouCaclulateTheTime).click();}
    public String textHowDoYouCaclulateTheTime() {
      return driver.findElement(By.id("accordion__panel-2")).getText();}

    // ТЕСТ 4: Можно ли заказать самокат прямо на сегодня?
    private By isItPossibleOrderScooterForToday = By.id("accordion__heading-3");
    public void clickIsItPossibleOrderScooterForToday() {
        driver.findElement(isItPossibleOrderScooterForToday).click();}
    public String textIsItPossibleOrderScooterForToday() {
        return driver.findElement(By.id("accordion__panel-3")).getText();}


    //ТЕСТ 5: подраздел Можно ли продлить заказ или вернуть самокат раньше?
    private By canIProlongOrBackEarlie = By.id("accordion__heading-4");
    public void clickCanIProlongOrBackEarlie() {
        driver.findElement(canIProlongOrBackEarlie).click();}
    public String textCanIProlongOrBackEarlie() {
        return driver.findElement(By.id("accordion__panel-4")).getText();}



    //ТЕСТ 6: подраздел Вы привозите зарядку вместе с самокатом?
    private By doYouGiveChargeWithScooter = By.id("accordion__heading-5");
    public void clickDoYouGiveChargeWithScooter() {
        driver.findElement(doYouGiveChargeWithScooter).click();}
    public String textDoYouGiveChargeWithScooter() {
        return driver.findElement(By.id("accordion__panel-5")).getText();}

    //ТЕСТ 7: подраздел Можно ли отменить заказ?
    private By canICancelMyOrder = By.id("accordion__heading-6");
    public void clickCanICancelMyOrder() {
        driver.findElement(canICancelMyOrder).click();}
    public String textCanICancelMyOrder() {
        return driver.findElement(By.id("accordion__panel-6")).getText();}

    //ТЕСТ 8: подраздел Я жизу за МКАДом, привезёте?
    private By iLiveSoFarDoYouCome = By.id("accordion__heading-7");
    public void clickILiveSoFarDoYouCome() {
        driver.findElement(iLiveSoFarDoYouCome).click();}
    public String textILiveSoFarDoYouCome() {
        return driver.findElement(By.id("accordion__panel-7")).getText();}

}
