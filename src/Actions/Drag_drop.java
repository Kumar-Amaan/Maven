package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_drop {

	@Test
	public void Drag_Drop() throws Exception{
		System.setProperty("webdriver.chrome.driver","B:\\driver92\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		WebElement frameElement=driver.findElement(By.cssSelector("[data-src='../../demoSite/practice/droppable/photo-manager.html']"));
		
		driver.switchTo().frame(frameElement);
	
//		WebElement source=driver.findElement(By.cssSelector("#gallery"));
//		WebElement source=driver.findElement(By.cssSelector(""));
		WebElement source1=driver.findElement(By.cssSelector("[alt='On top of Kozi kopka']"));
		WebElement target=driver.findElement(By.cssSelector("div#trash"));
		
				action.dragAndDrop(source1, target).perform();
				
				Thread.sleep(3000);
//				WebElement frameElement1=driver.findElement(By.cssSelector("[data-src='../../demoSite/practice/droppable/photo-manager.html']"));
				
//				driver.switchTo().frame(frameElement1);	
				WebElement source=driver.findElement(By.cssSelector("[alt='Planning the ascent']"));
				
						action.dragAndDrop(source, target).perform();
						Thread.sleep(3000);
						
						WebElement source2=driver.findElement(By.cssSelector("[alt='The chalet at the Green mountain lake']"));
	action.dragAndDrop(source2, target).perform();
	Thread.sleep(3000);
	
	WebElement source3=driver.findElement(By.cssSelector("//img[@alt='The peaks of High Tatras']"));
	action.dragAndDrop(source3, target).perform();
	
	}
}
