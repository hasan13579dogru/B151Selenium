package techproed.day02_DriversMethods.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriversMethods_ClassWorkPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

  /*  Yeni bir package olusturalim : day01
        Yeni bir class olusturalim : C03_GetMethods
        Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin “Amazon” icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url’inin “amazon” icerdigini test edin.
        Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        Sayfayi kapatin.*/

        // Amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //Sayfa baslıgını yazdırın
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test PASSED");
        }else System.out.println("Test FAİLED");

        //Url in https://www.amazon.com
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com/";
        if(actualUrl.equals(expectedUrl)) {
            System.out.println("Test PASSED");
        }else System.out.println("Test FAİLED ->"+ actualUrl);

          //Handle degerini yazdırın
        System.out.println("Amazon Window Handle Değeri : " + driver.getWindowHandle());

       // Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin


        }


        }





