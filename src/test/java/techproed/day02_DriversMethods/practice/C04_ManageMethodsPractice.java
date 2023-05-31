package techproed.day02_DriversMethods.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_ManageMethodsPractice {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

  /* Yeni bir class olusturun (TekrarTesti)
Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify),
eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        Youtube sayfasina geri donun
        Sayfayi yenileyin
        Amazon sayfasina donun
        Sayfayi tamsayfa yapin
        Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
        Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        URL'yi yazdırın
        Sayfayi kapatin*/


        //Youtube web sayfasına gidin
        driver.navigate().to("https://Youtube.com");

        // Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify),
        //        eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.navigate().to("https://Youtube.com");
        String actualTitle = driver.getTitle();

        if (driver.getTitle().contains("youtube")) {
            System.out.println("Test PASSED");
        } else System.out.println("Actual Title");

        //  Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın,
        //  içermiyorsa doğru  URL'yi yazdırın
        if (driver.getTitle().contains("youtube")) {
            System.out.println("Test PASSED");
        }else System.out.println("Actual Title");

        //Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

        //Youtube sayfasina geri donun
        driver.navigate().back();

        //Sayfayi yenileyin
        driver.navigate().refresh();

        //Amazon sayfasina donun
        driver.navigate().back();
        //Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        // sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
        //  Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //  URL'yi yazdırın

       driver.getTitle();
       String expectedTitle= "Amazon";
       if(actualTitle.contains(expectedTitle)) {
           System.out.println("Test PASSED");
       }else System.out.println("Test FAİLED ->"+actualTitle);

        //Sayfayi kapatin
        driver.close();
       }
        }


