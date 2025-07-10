package test;

import java.awt.Point;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleElements {
	@Test
void getMultipleElements() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	//driver.manage().window().setPosition(+8);
	Thread.sleep(6000);
	List<WebElement> ele=driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div[3]/footer/div/div[3]/div[1]"));
	System.out.println(ele.size());
	for(WebElement el:ele) {
		String text=el.getText();
		System.out.println(text);
		if(text.equals("Careers")) {
			el.click();
			System.out.println("clicked");
		}
	}
	
}
}
