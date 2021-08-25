package attendace_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_attendance {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "B:\\driver92\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("https://docs.google.com/forms/d/16CMFBaHVPctpXyTQZo1sylgo4le7dqO6Fk6-BsqUrG0/viewform?edit_requested=true");
			
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//div[@class='quantumWizTextinputPaperinputEl freebirdThemedInput freebirdFormviewerComponentsQuestionDateDateInput modeLight']//input[@class='quantumWizTextinputPaperinputInput exportInput']")).sendKeys("25-08-2021");
			driver.findElement(By.xpath("//div[@class='freebirdFormviewerViewItemList']/div[2]//input[@class='quantumWizTextinputPaperinputInput exportInput']")).sendKeys("00092937");
			driver.findElement(By.cssSelector("[aria-labelledby='i10']")).sendKeys("Aman");
			driver.findElement(By.cssSelector("[aria-labelledby='i14']")).sendKeys("Kumar");
			driver.findElement(By.xpath("//div[5]//input[@class='quantumWizTextinputPaperinputInput exportInput']")).sendKeys("Aman.1.Kumar@coforgetech.com");
			driver.findElement(By.xpath("//span[@class='appsMaterialWizButtonPaperbuttonContent exportButtonContent']")).click();
		}

	

	}


