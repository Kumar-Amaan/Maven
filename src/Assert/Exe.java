package Assert; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exe
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "B:\\driver92\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://duckduckgo.com/");

WebElement searchTextBox= driver.findElement(By.id("search_form_input_homepage"));

// retrieving html attribute value using getAttribute() method
String typeValue=searchTextBox.getAttribute("type");
System.out.println("Value of type attribute: "+typeValue);
//searchTextBox
String autocompleteValue=searchTextBox.getAttribute("autocomplete");
System.out.println("Value of autocomplete attribute: "+autocompleteValue);

// Retrieving value of attribute which does not exist
String nonExistingAttributeValue=searchTextBox.getAttribute("nonExistingAttribute");
System.out.println("Value of nonExistingAttribute attribute: "+nonExistingAttributeValue);

}
}