package jsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myntra_js {
WebDriver driver;

 @BeforeTest
public void openApp() {

 System.setProperty("webdriver.chrome.driver", "B:\\driver92\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.myntra.com/myntra?f=Coupons:MOTHERCARE10");

 }

 @Test
public void GooglePage() throws Exception {

WebElement return_policy =driver.findElement(By.xpath("//strong[contains(.,'Return within 30days')]"));
JavascriptExecutor JS = (JavascriptExecutor) driver;
JS.executeScript("arguments[0].scrollIntoView();", return_policy);

}

}