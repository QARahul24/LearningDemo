import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginBrowser
{
    @Test
    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver", "C://Users//RahulChoubey//IdeaProjects//Learning//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Rupesh Khosla", Keys.ENTER);
    }
}
