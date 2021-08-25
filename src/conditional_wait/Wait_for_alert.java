package conditional_wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Wait_for_alert {
public static WebDriver driver;

 @BeforeTest
public void setup() throws Exception {

System.setProperty("webdriver.chrome.driver", "B:\\driver92\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.get("http://only-testing-blog.blogspot.in/2014/01/new-testing.html");
}

@AfterTest
public void aftertest() {
//driver.quit();
}
@Test
public void test ()
{
driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("My Name");

WebDriverWait wait = new WebDriverWait(driver, 60);
wait.until(ExpectedConditions.alertIsPresent());

String alrt = driver.switchTo().alert().getText();
System.out.print(alrt);
driver.switchTo().alert().accept();
}


}