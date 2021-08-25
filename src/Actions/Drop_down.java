package Actions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Drop_down {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "B:\\driver92\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String URL = "https://selenium08.blogspot.com/2019/11/dropdown.html";

		driver.get(URL);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));

		Select select = new Select(dropdown);

		if (select.isMultiple()) {
			System.out.println("Multiple choice accepts");
		} else {
			System.out.println("Not accepting multiple choices");
		}

		


		Thread.sleep(4000);
		select.selectByVisibleText("India");
		String getText = select.getFirstSelectedOption().getText();
		System.out.println("Selected: " + getText);
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@name='country']"));

		Thread.sleep(4000);
		Select select1 = new Select(dropdown1);

		select1.selectByValue("AR");
		String getText1 = select.getFirstSelectedOption().getText();
		System.out.println("Selected: " + getText1);
		WebElement dropdown11 = driver.findElement(By.xpath("//select[@name='country']"));

		Thread.sleep(3000);
		Select select11 = new Select(dropdown11);
        select11.selectByValue("DZ");
        String getText11 = select.getFirstSelectedOption().getText();
		System.out.println("Selected: " + getText11);
		WebElement dropdown111 = driver.findElement(By.xpath("//select[@name='country']"));

		Thread.sleep(3000);
		WebElement dropdown1111 = driver.findElement(By.xpath("//select[@name='Month']"));

		Select multiplechoicelist = new Select(dropdown1111);

		if (multiplechoicelist.isMultiple()) {
			System.out.println("True!!Multiple choice allowed");
		} else {
			System.out.println("Not Allowed multiple-choice selection");
		}
		Thread.sleep(2000);
		multiplechoicelist.selectByVisibleText("August");
		Thread.sleep(2000);
		multiplechoicelist.selectByVisibleText("April");
		Thread.sleep(2000);
		multiplechoicelist.selectByVisibleText("January");
		Thread.sleep(2000);
		multiplechoicelist.selectByVisibleText("November");
		Thread.sleep(2000);
		multiplechoicelist.selectByVisibleText("December");
		Thread.sleep(2000);

		if (multiplechoicelist.getAllSelectedOptions().size() == 5) {
			System.out.println("Yes!!! 5 options selected");
		} else {
			System.out.println("Failed");
		}

		Thread.sleep(3000);

		driver.close();
	}
}