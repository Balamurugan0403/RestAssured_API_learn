package in.Demo_RestAssured;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void testURL() {

        ChromeDriver driver = new ChromeDriver();

        try {

            driver.get("https://jsonplaceholder.typicode.com");

            String currentUrl = driver.getCurrentUrl();

            System.out.println(currentUrl);

            Assert.assertTrue(currentUrl.contains("jsonplaceholder"));

        } finally {

            driver.quit();

        }
    }
}