import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.stealmylogin.com/demo.html");

        driver.findElement(By.name("username")).sendKeys("nikolina30");
        driver.findElement(By.name("password")).sendKeys("nina_03!");
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        inputs.get(inputs.size()-1).click();

        String secondPageUrl = "https://example.com/";
        if(driver.getCurrentUrl().equals(secondPageUrl)) {
            System.out.println("Nice");
        }
        else {
            System.out.println("Not nice");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();
    }
}
