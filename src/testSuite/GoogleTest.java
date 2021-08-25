package testSuite;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class GoogleTest {
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;
@Before
public void setUp() {

System.setProperty("webdriver.chrome.driver", "B:\\driver92\\chromedriver.exe");
driver = new ChromeDriver();
js = (JavascriptExecutor) driver;
setVars(new HashMap<String, Object>());
}
@After
public void tearDown() {
driver.quit();
}
@Test
public void googleSearchTest() {
driver.get("https://www.google.com/");
driver.manage().window().setSize(new Dimension(1657, 698));
driver.findElement(By.name("q")).click();
{
WebElement element = driver.findElement(By.name("btnK"));
Actions builder = new Actions(driver);
builder.moveToElement(element).perform();
}
driver.findElement(By.name("q")).sendKeys("iphone");
driver.findElement(By.name("btnK")).click();
{
WebElement element = driver.findElement(By.tagName("body"));
Actions builder = new Actions(driver);
builder.moveToElement(element, 0, 0).perform();
}
}
public Map<String, Object> getVars() {
	return vars;
}
public void setVars(Map<String, Object> vars) {
	this.vars = vars;
}
}