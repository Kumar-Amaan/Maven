package dialoge_Handling;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class modal_Handling2 {

 @Test
public void ModelDialog() throws Exception {

 System.setProperty("webdriver.chrome.driver", "B:\\driver92\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.uitestpractice.com/Students/Switchto");
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[@data-target='#myModal']")).click();
//Click on Cancel and Ok button on MOdal dialog
Thread.sleep(3000);

String modal_header = driver.findElement(By.xpath("//h4[@class='modal-title']")).getText();
String modal_body = driver.findElement(By.xpath("//div[@class='modal-body']")).getText();

System.out.println(">>>>>>>" + modal_header + " ========" + modal_body);
Thread.sleep(2000);
driver.findElement(By.xpath("//button[contains(text(),'O')]")).click();


}

}