import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class OrderScooterElements {
    private WebDriver driver;
    public OrderScooterElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

      //ШАГ 1-1: кликнуть в первую кнопку «Заказать» (вверху страницы)
      private By orderButton1= By.className("Button_Button__ra12g");
      public void clickOrderButton1() {
      driver.findElement(orderButton1).click();}

    //ШАГ 1-2: кликнуть во вторую кнопку «Заказать» (посередине страницы)

    public void scrollForOrderButton2() {
        WebElement element = driver.findElement(By.id("accordion__heading-0"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);}
    private By orderButton2 = By.className("Button_Middle__1CSJM"); //окно открывается программа открывает всегда в одном размере, поэтому записала локатор для кнопки Middle
    public void clickOrderButton2() {
        driver.findElement(orderButton2).click();}

     //ШАГ 2: кликнуть в поле Имя + ввести имя
     private By nameForOrder = By.xpath("//*[@placeholder='* Имя']");
    public void clickNameForOrder() {
        driver.findElement(nameForOrder).click();}
           String username;
           public void setUsername(String userName) {
            driver.findElement(nameForOrder).sendKeys(userName);}
        
      //ШАГ 3: кликнуть в поле Фамилия + ввести фамилию
      private By surnameForOrder = By.xpath("//*[@placeholder='* Фамилия']");

         public void clickSurnameForOrder() {
         driver.findElement(surnameForOrder).click();}
               String userSurname;
              public void setUserSurname(String userSurname) {
              driver.findElement(surnameForOrder).sendKeys(userSurname);}

       //ШАГ 4: кликнуть в поле Адрес + ввести адрес
       private By adressForOrder = By.xpath("//*[@placeholder='* Адрес: куда привезти заказ']");
                   public void clickAdressForOrder() {
                   driver.findElement(adressForOrder).click();}
                          String adress;
                          public void setAdress(String adress) {
                          driver.findElement(adressForOrder).sendKeys(adress);}

         //ШАГ 5: кликнуть в поле Станция метро + выбрать станцию
        private By metroStationForOrder = By.className("select-search__value");
                public void clickMetroStationForOrder() {
                driver.findElement(metroStationForOrder).click();}
        private By chooseMetroStationForOrder = By.xpath(String.format(".//div[@class='select-search__select']//*[text()='Бульвар Рокоссовского']"));
                 public void clickChooseMetroStationForOrder() {
                 driver.findElement(chooseMetroStationForOrder).click();}

          //ШАГ 6: кликнуть в поле Телефон + ввести номер телефона
        private By telephoneForOrder = By.xpath("//*[@placeholder='* Телефон: на него позвонит курьер']");
                 public void clickTelephoneForOrder() {
                 driver.findElement(telephoneForOrder).click();}
                       String telephone;
                       public void setTelephone(String telephone) {
                       driver.findElement(telephoneForOrder).sendKeys(telephone);}

        //ШАГ 7: кликнуть в кнопку "Далее"
        private By nextButtonForOrder = By.className("Button_Middle__1CSJM");
                        public void clickNextButtonForOrder() {
                        driver.findElement(nextButtonForOrder).click();}

        //ШАГ 8: кликнуть в поле "Когда привезти самокат" + выбрать дату
        private By whenDoYouWantToGetScooter = By.xpath("//*[@placeholder='* Когда привезти самокат']");
                           public void clickWhenDoYouWantToGetScooter() {
                           driver.findElement(whenDoYouWantToGetScooter).click();}
        private By whenDoYouWantToGetScooterCalendar = By.className("react-datepicker__day--025");
                            public void clickWhenDoYouWantToGetScooterCalendar() {
                            driver.findElement(whenDoYouWantToGetScooterCalendar).click();}

         //ШАГ 9: кликнуть в поле "Срок аренды" + выбрать срок

            private By timeOfRent = By.className("Dropdown-root");
                           public void clickTimeOfRent() {
                           driver.findElement(timeOfRent).click();}
            private By timeOfRentChoose = By.xpath(String.format(".//div[@class='Dropdown-menu']//*[text()='двое суток']"));
                           public void clickTimeOfRentChoose() {
                           driver.findElement(timeOfRentChoose).click();}

          //ШАГ 10: кликнуть в цекбокс и выбрать цвета самоката
            private By colorOfScooter = By.id("grey");
                          public void clickColorOfScooter() {
                          driver.findElement(colorOfScooter).click();}

           //ШАГ 11: кликнуть в кнопку "Заказать"
            private By finalOrderButton = By.xpath("//*/div/div[2]/div[3]/button[2]");
                               public void clickFinalOrderButton() {
                                   driver.findElement(finalOrderButton).click();}

            //ШАГ 12: кликнуть в кнопку "Да" в окне "Хотите оформить заказ?"
                       private By yesButtonConfirmOrder = By.xpath("//*/div/div[2]/div[5]/div[2]/button[2]");
                       public void clickYesButtonConfirmOrder () {
                       driver.findElement(yesButtonConfirmOrder).click();

                                   }

}