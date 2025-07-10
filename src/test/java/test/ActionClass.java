package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {
	WebDriver driver=new ChromeDriver();
	Actions ac=new Actions(driver);
@Test(priority=2)
void actions() {
	
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Selenium");
	
	ac.sendKeys(Keys.ENTER).perform();
}
@Test(priority=1)
void drag_Drop() {
	driver.get("https://demoqa.com/droppable");
	WebElement sourceEle=driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement destinationEle=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	ac.scrollByAmount(0,500);
	ac.dragAndDrop(sourceEle, destinationEle).perform();
}
}
