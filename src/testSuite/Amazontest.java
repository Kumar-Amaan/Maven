package testSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontest {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "B:\\driver92\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("https://www.amazon.in/");
			
			

			
////			driver.findElement(By.className(".L0Z3Pu")).click();
//			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("rolex");
			driver.findElement(By.id("nav-search-submit-button")).click();
//			driver.findElement(By.cssSelector("[cel_widget_id='MAIN-SEARCH_RESULTS-2'] .a-size-mini")).click();
			driver.findElement(By.xpath("//span[.='Rolex: El fantástico viaje de un reloj (Spanish Edition)']")).click();
			
			
//			.........................................................................................
			driver.findElement(By.xpath("//div[@id='nav-xshop']/a[.='Best Sellers']")).click();
//			driver.findElement(By.cssSelector("#checkout-button")).click();
//			driver.findElement(By.id("a-size-mini a-spacing-none a-color-base s-line-clamp-2")).click();
		
		}

	

	}


