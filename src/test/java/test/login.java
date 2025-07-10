package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class login {
	WebDriver driver=new ChromeDriver();
@Test(priority=2)
void login1() {
	driver.get("https://practicetestautomation.com/practice-test-login/");
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
	driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	WebElement msg=driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1"));
	System.out.println(msg);
	String ActualUrl=driver.getCurrentUrl();
	AssertJUnit.assertEquals(ActualUrl, "https://practicetestautomation.com/logged-in-successfully/");
}



}
