package Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

 

public class Yahoo {
    @Test
    public void yahoo()throws Exception
    {
        
         System.setProperty("webdriver.chrome.driver", "B:\\driver92\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();

 

        driver.get("http://only-testing-blog.blogspot.com/p/mouse-hover.html");
        driver.manage().window().maximize();
         Actions action = new Actions(driver);
         WebElement source = driver.findElement(By.xpath("//div[@class='post-body entry-content']//div[@class='menu']/div[contains(.,'Search Engine')]"));
        action.moveToElement(source).perform();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("[href='http://www.yahoo.com/']")).click();
        Assert.assertTrue(driver.getTitle().contains("Yahoo"), "verify Application Title.");

 

    }

 

}
 