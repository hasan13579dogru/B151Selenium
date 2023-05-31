package techproed.day02_DriversMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigationMethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

   /* Yeni bir Class olusturalim.C05_NavigationMethods
        Youtube ana sayfasina gidelim . https://www.youtube.com/
        Amazon soyfasina gidelim. https://www.amazon.com/
        Tekrar YouTube’sayfasina donelim
        Yeniden Amazon sayfasina gidelim
        Sayfayi Refresh(yenile) yapalim
        Sayfayi kapatalim / Tum sayfalari kapatalim*/

     //Youtube ana sayfasına gidelim
       driver.navigate().to("https://Youtube.com");

      // Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://Amazon.com");

        //Tekrar YouTube’sayfasina donelim
        driver.navigate().back();

     // Yeniden Amazon sayfasina gidelim
        driver.navigate().back();

        //Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
      //  Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();

    }
}