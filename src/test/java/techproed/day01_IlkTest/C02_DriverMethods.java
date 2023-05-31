package techproed.day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        System.out.println("Amazon Actual Title : " + driver.getTitle());
        System.out.println("Amazon Actual Url : " + driver.getCurrentUrl());
        driver.get("https://techproeducation.com");
        System.out.println("Techproed Actual Title : " + driver.getTitle());
        System.out.println("Techproed Actual Url : " + driver.getCurrentUrl());
        System.out.println("Techproed Window Handle Değeri : " + driver.getWindowHandle());

    }
}


