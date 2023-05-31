package techproed.day02_DriversMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageWindowSet {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*Yeni bir Class olusturalim.C07_ManageWindowSet
Amazon soyfasina gidelim. https://www.amazon.com/
Sayfanin konumunu ve boyutlarini yazdirin
Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
8. Sayfayi kapatin*/

      //  Amazon soyfasina gidelim. https://www.amazon.com/
       driver.navigate().to("https://www.amazon.com/");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları = "+driver.manage().window().getSize());

        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(100,100));

         //8. Sayfayi kapatin
        //Object page=8.;
        driver.close();


    }
}