import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Login {

    WebDriver driver;

@Test(priority = 1)
    void openBrowser(){

        System.out.println("Open Browser");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }
@Test(priority = 2)
    void login(){

        System.out.println("Click on Login");
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("kena_2350@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("12345");
        driver.findElement(By.className("button-1 login-button")).click();


    }
}
