package Actions; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions; 

public class Click_and_hold 
{ 
 public static void main(String[] args) 
 { 
		System.setProperty("webdriver.chrome.driver","B:\\driver92\\chromedriver.exe");
   WebDriver driver = new ChromeDriver(); 
   driver.manage().window().maximize(); 
   
  driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");


     WebElement charE = driver.findElement(By.xpath("//li[text()= 'E']")); 


     Actions actions = new Actions(driver); 


     actions.moveToElement(charE); 
     actions.clickAndHold().perform(); 
  } 
}