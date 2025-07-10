package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class fileUpload {

ChromeOptions option=new ChromeOptions();

WebDriver driver;
@Test(groups= {"smoke"})
public void uploadFile() {
	option.addArguments("--incognito");
	driver=new ChromeDriver(option);
	driver.get("https://practice.expandtesting.com/upload");
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\Devashree\\Devashree_Naik _Resume.docx");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20)); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='fileSubmit']"))).click();
//	driver.findElement(By.xpath("//button[@id='fileSubmit']")).click();"D:\Devashree\Devashree_Naik _Resume.docx"
		
		Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText(), "File Uploaded!");
		
}
//public static void main(String[] args) {
//	fileUpload f=new fileUpload();
//	f.uploadFile();
//}
}
