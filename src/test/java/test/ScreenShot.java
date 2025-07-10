package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShot {
	@Test
void ss() throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/selenium%20jar/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html");
//	TakesScreenshot ss= (TakesScreenshot)driver;
//	File SourceFile=ss.getScreenshotAs(OutputType.FILE);
//	File fl=new File("D:\\Devashree\\ScreenShots\\ErrorMsg.jpg");
//	FileHandler.copy(SourceFile,fl);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
	driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-flat']")).click();
	WebElement ele=driver.findElement(By.xpath("//div[@id='email_error']"));
	File SourceFile=ele.getScreenshotAs(OutputType.FILE);
	File fl=new File("D:\\Devashree\\ScreenShots\\ErrorMsg2.jpg");
	FileHandler.copy(SourceFile,fl);
}
}
