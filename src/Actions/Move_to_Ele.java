package Actions; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait; 

public class Move_to_Ele 
{ 
public static void main(String[] args) throws Exception 
{ 
	System.setProperty("webdriver.chrome.driver","B:\\driver92\\chromedriver.exe");
 WebDriver driver = new ChromeDriver(); 
 driver.manage().window().maximize(); 
 
 driver.get("https://opensource-demo.orangehrmlive.com");

 
 driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
 driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
 driver.findElement(By.cssSelector("#btnLogin")).click();
 System.out.println("*****" +driver.findElement(By.cssSelector("h1")).getText());
 WebDriverWait wait = new WebDriverWait(driver, 15);
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcome")));
 driver.findElement(By.id("welcome")).click();
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("About")));
 Actions action = new Actions(driver);
 action.moveToElement(driver.findElement(By.linkText("About"))).click().perform();
 Thread.sleep(3000);
 driver.findElement(By.xpath("//div[@id='displayAbout']//a[.='×']")).click();
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("About")));
 Actions action1 = new Actions(driver);
 action1.moveToElement(driver.findElement(By.linkText("Logout"))).click().perform();
  } 
}

