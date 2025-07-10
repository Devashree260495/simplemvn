package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertHandling {
WebDriver driver=new ChromeDriver();

public void handleAlert()
{
	driver.get("https://artoftesting.com/samplesiteforselenium");
	WebElement al=driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
	Actions action=new Actions(driver);
	action.doubleClick(al).perform();
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
}
public static void main(String[] args) {
	AlertHandling a=new AlertHandling();
	a.handleAlert();
}
}
