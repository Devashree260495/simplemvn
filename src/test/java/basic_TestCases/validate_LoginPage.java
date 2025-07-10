package basic_TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class validate_LoginPage {
	//valid login test
	//invalid login test
	WebDriver driver=new ChromeDriver();
	@BeforeGroups()
	void openBrowser() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().fullscreen();
	}
	@AfterGroups()
	void closeBrowser() {
		driver.close();
	}
	@Test(priority=0,groups="ValidTC")
	void validCredUrl() {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://practicetestautomation.com/logged-in-successfully/");
	}
	@Test(priority=1,groups="ValidTC")
	void validCredText() {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		String textMsg=driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1")).getText();
		Assert.assertEquals(textMsg,"Logged In Successfully");
	}
	@Test(priority=2,groups="ValidTC")
	void validCredTittle() {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Assert.assertEquals(driver.getTitle(),"Logged In Successfully | Practice Test Automation");
	}
	@Test(priority=3,groups="inValidTC")
			void invalidCred() {
				driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student1");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password1234");
				driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
				Assert.assertEquals(driver.getCurrentUrl(),"https://practicetestautomation.com/logged-in-successfully/");
			}
	

}
