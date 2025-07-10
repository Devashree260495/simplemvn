package basic_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	WebDriver driver=new ChromeDriver();
	@BeforeMethod()
	void openBrowser() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@AfterMethod()
	void closeBrowser() {
		driver.quit();
	}

	@Test(dataProvider ="td")
	void testLogin(String userName,String Password) {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://practicetestautomation.com/logged-in-successfully/");
	}
	@DataProvider(name="td")
	Object [][]testData(){
		Object obj [][]=new Object[4][4];
		obj[0][0]="student";
		obj[0][1]="Password123";
		obj[1][0]="%&*#%";
		obj[1][1]="#%&@#";
		obj[2][0]="";
		obj[2][1]="";
		obj[3][0]="Abc123";
		obj[3][1]="ABC@123";
		return obj;
	}

}
