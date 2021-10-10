import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseClass {

     WebDriver driver;
    @BeforeClass
    public void setupApplication() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver .manage() .timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
    }
    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(500);
        driver.close();
    }

}

