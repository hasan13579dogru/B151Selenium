package techproed.day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        System.out.println(System.getProperty("webdriver.chrome.driver"));
        WebDriver driver = new ChromeDriver();
        driver.get("https://techproeducation.com");

        System.out.println("deneme git");
    }
}





