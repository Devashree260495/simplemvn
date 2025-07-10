package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsClass {
	WebDriver driver=new ChromeDriver();
	Actions actions =new Actions(driver);
//	void performActions() {
//		driver.get("https://www.google.com/");
//		WebElement element=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
//		actions.moveToElement(element).click().perform();
//		element.sendKeys("chatgpt");
//		actions.sendKeys(Keys.ENTER).perform();
//		driver.quit();
//	}
	void performActions2() {
		driver.get("https://www.google.com/");
		WebElement element=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		WebElement element1=driver.findElement(By.xpath("//a[@class='m5Qfy']"));
		actions.contextClick(element1).perform();
		actions.moveToElement(element).click().sendKeys("chatgpt").sendKeys(Keys.ENTER).build().perform();
		
		
		
	}
	public static void main(String[] args) {
		actionsClass act=new actionsClass();
//		act.performActions();
		act.performActions2();
	}

}
