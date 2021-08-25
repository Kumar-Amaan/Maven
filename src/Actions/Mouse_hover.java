package Actions; 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Mouse_hover 
{ 
public static void main(String[] args) throws Exception 
{ 
	System.setProperty("webdriver.chrome.driver","B:\\driver92\\chromedriver.exe");
 WebDriver driver = new ChromeDriver(); 
 driver.manage().window().maximize(); 
 
 driver.get("https://www.amazon.in/");
 
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

Actions action = new Actions(driver);
WebElement source=driver.findElement(By.id("nav-link-accountList"));
action.moveToElement(source).perform();
//action.moveToElement(source)
Thread.sleep(3000);
WebElement source1=driver.findElement(By.xpath("//span[.='Your Account']"));
action.moveToElement(source1).click().perform();

Thread.sleep(3000);
WebElement prime=driver.findElement(By.id("nav-link-prime"));
action.moveToElement(prime).click().perform();

Thread.sleep(3000);
WebElement bestSeller=driver.findElement(By.xpath("//div[@id='nav-xshop']/a[.='Best Sellers']"));
action.moveToElement(bestSeller).click().perform();

Thread.sleep(3000);
WebElement launchPad=driver.findElement(By.xpath("//a[.='Amazon Launchpad']"));
action.moveToElement(launchPad).click().perform();

Thread.sleep(3000);
WebElement Food=driver.findElement(By.xpath("//span[contains(.,'FOOD')]"));
action.moveToElement(Food).click().perform();

WebElement Attri=driver.findElement(By.xpath("//div[.='Make Money with Us']"));
String typeValue=Attri.getAttribute("class");
System.out.println("Value of attribute: "+typeValue);

String typeValue1=Attri.getAttribute("text");
System.out.println("Value of attribute: "+typeValue1);

//driver.findElement(By.cssSelector("[href='http://www.yahoo.com/']")).click();
Assert.assertTrue(driver.getTitle().contains("Amazon"), "verify Application Title.");

driver.close();

}
}
