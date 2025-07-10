package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownList {
	@Test
	void dropDown() {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/selenium%20jar/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/pages/examples/add_user.html");
WebElement DrpDwnList=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
Select sc=new Select(DrpDwnList);
//sc.selectByIndex(1);
//sc.selectByValue("Delhi");
sc.selectByVisibleText("Punjab");
String selectedOption=sc.getFirstSelectedOption().getText();
Assert.assertEquals(selectedOption, "Punjab");

}
}
