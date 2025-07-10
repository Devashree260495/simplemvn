package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClass {
	WebDriver driver=new ChromeDriver();
	void getDropdown() {
		driver.get("https://practice.expandtesting.com/dropdown");
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("Aruba");
		select.selectByIndex(4);
		select.selectByValue("AQ");
		String e1=select.getFirstSelectedOption().getText();
		System.out.println(e1);
//		List<WebElement> options=select.getOptions();
//		for(WebElement e:options) {
//			System.out.println(e.getText());	
//		}
			List <WebElement>allSelected=select.getAllSelectedOptions();
			for(WebElement e2:allSelected) {
				System.out.println(e2.getText());
			}
		
	}
	public static void main(String[] args) {
		selectClass s=new selectClass();
		s.getDropdown();
	}

}
