package day02_driverMethodlari_webElementKullanimi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C02_DriverNavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {

        /*
            Bir test otomasyonu icin
            ilk yapmamiz gereken sey bir WebDriver objesi edinmektir.

            Selenium 4.12 surumu ile kendi WebDriver objesini olusturdu
            Boylece disardan bir WebDriver tanimlamamiza gerek kalmadan
            Selenium WebDriver objesini kullanabilir ve
            testlerimizi yapabiliriz.

            Bazi sirketler acik kaynakli oldugu icin
            Selenium WebDriver kullanmamizi istemeyebilirler
            ve bize kullanmamiz icin bir WebDriver dosyasi verebilirler

            Eger sirkete ozel bir WebDriver objesi kullanilacaksa
            O WebDriver'i test class'imiza tanitmak icin
            System.setProperty() gereklidir

            AMMMAAAA Selenium WebDriver kullanacaksak
            System.setProperty()'e ihtiyac yoktur.
         */

        //System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new FirefoxDriver();


        driver.get("https://www.testotomasyonu.com");


        Thread.sleep(3000);
        driver.quit();
    }
}
