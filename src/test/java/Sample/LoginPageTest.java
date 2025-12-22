package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginPageTest {

    @Parameters("Browser")
    @Test
    public void Lpge(String browserName) throws InterruptedException {

        WebDriver driver = null;
        if(browserName.contains("Chrome"))  driver = new ChromeDriver();
        else if (browserName.contains("Edge")) driver = new EdgeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.className("orangehrm-login-button")).click();
        Thread.sleep(2000);
        driver.quit();

    }


}
