import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginPage {
    public static void main(String[] args) {


        @Test
            public void loginpageui(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.get("https://qamoviesapp.ccbp.tech");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("success-image")));
        }



    }

}
