package conditional_wait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Wait_for_element_visible {
public static WebDriver driver;

 @BeforeTest
public void setup() throws Exception {

System.setProperty("webdriver.chrome.driver", "B:\\driver92\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
}

@AfterTest
public void aftertest() {
//driver.quit();
}
@ Test
public void test () throws InterruptedException, IOException
{
//To wait for element visible
WebDriverWait wait = new WebDriverWait(driver, 25);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='text3']")));
driver.findElement(By.xpath("//input[@id='text3']")).sendKeys("Text box is visible now");
System.out.print("Text box text3 is now visible");
}
}