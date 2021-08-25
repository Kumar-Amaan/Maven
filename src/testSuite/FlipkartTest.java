package testSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "B:\\driver92\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		
		
//		By using => .name
//		driver.findElement(By.name("q")).sendKeys("iphone");
//		driver.findElement(By.name("q")).sendKeys("rolex");
//		driver.findElement(By.className(".L0Z3Pu")).click();		
//		By using xpath
//		  driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("iphone");
		
//		By using classNmae
		driver.findElement(By.className("_3704LK")).sendKeys("oppo");
		driver.findElement(By.className("L0Z3Pu")).click();
	
//		Using CSS Selector:::::faster as compare to to XPATH and having lots of shortcut
//		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("iphone");
//		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("iphone");
//		driver.getPageSource();
		
		
//		driver.findElement(By.className(".L0Z3Pu")).click();
		
	}

}
