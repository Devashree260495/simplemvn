package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButton {
@Test
void radioButton() {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/selenium%20jar/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/pages/examples/add_user.html");
WebElement RadioBtn=driver.findElement(By.xpath("//*[@id=\"Female\"]"));
RadioBtn.click();
Assert.assertTrue(RadioBtn.isSelected());


}
}
