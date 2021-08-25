package dialoge_Handling;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class irctc_app_test {

 @Test
public void Iframe_PayTM() throws Exception {

 System.setProperty("webdriver.chrome.driver", "B:\\driver92\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.irctc.co.in/nget/train-search");
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[text()='OK']")).click();
}

}