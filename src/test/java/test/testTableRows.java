package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testTableRows {
	@Test
	void testTableData() {
		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--headless");
		options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		WebDriver driver=new ChromeDriver(options);
		driver.get("file:///C:/selenium%20jar/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/pages/examples/users.html");
		List<WebElement> Rows=driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
		List<WebElement> Columns=driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr/th"));
		SoftAssert softassert=new SoftAssert();
		for(int i=2;i<=Rows.size();i++) {
		for(int j=1;j<=Columns.size();j++) {
			String cellData = driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
			System.out.print(cellData+" | ");
			//			softassert.assertEquals(ActResult, ExpResult);
			//softassert.assertAll(); //this is for soft assert where exception is handled and further tasks are completed
//			Assert.assertEquals(ActResult, ExpResult); //hard assert stops the execution once the exception is occured.
		}
		System.out.println();
		//softassert.assertAll();
		}
	}

}
