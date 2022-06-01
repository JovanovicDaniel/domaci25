import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class domaci31maj {

    @Test
    public void test1() {
        //Napisati dva smoke testa za https://www.telerik.com/support/demos:
        //Proveriti da klikom na Desktop odlazimo na tu sekciju
        //Proveriti da klikom na Mobile odlazimo na tu sekciju
        //Koristiti TestNG, asserte.

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jovan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.navigate().to("https://www.telerik.com/support/demos");

        WebElement elementDesktop = driver.findElement(By.xpath("//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/div/div[2]/a[2]"));
        elementDesktop.click();

        WebElement elementMobilText = driver.findElement(By.id("desktop"));
        String deskActual = elementMobilText.getText();
        System.out.println(deskActual);
        String deskExpected = "Desktop";

        Assert.assertEquals(deskActual, deskExpected);

        driver.close();
        }

    @Test
        public void test2() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jovan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.navigate().to("https://www.telerik.com/support/demos");

        WebElement elementMobil = driver.findElement(By.xpath("//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/div/div[2]/a[3]"));
        elementMobil.click();

        WebElement elementDeskText = driver.findElement(By.id("mobile"));
        String mobilActual = elementDeskText.getText();
        System.out.println(mobilActual);
        String mobilExpected = "Mobile";

        Assert.assertEquals(mobilActual, mobilExpected);
        driver.close();
      }
}
