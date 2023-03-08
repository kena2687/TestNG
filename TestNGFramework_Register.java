import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGFramework_Register {

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
    void register() throws Exception{

        System.out.println("Click on Register");
        //driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.cssSelector("a[class='ico-register']")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Kena123");
        driver.findElement(By.id("LastName")).sendKeys("12345");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]/option[16]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]/option[7]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]/option[76]")).click();
        driver.findElement(By.id("Email")).sendKeys("kena_23@gmail.com");
    }
}
