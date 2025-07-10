package test;

import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testTable {

	@Test
	void testTableData() {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/selenium%20jar/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/pages/examples/users.html");
		ArrayList<String> arr=new ArrayList<>(Arrays.asList("#","Username","Email","Mobile","Course","Gender","State","Action"));
		SoftAssert softassert=new SoftAssert();
		for(int j=1;j<=8;j++) {
			String ExpResult=arr.get(j-1);
			String ActResult=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th["+j+"]")).getText();
			//			softassert.assertEquals(ActResult, ExpResult);
			//softassert.assertAll(); //this is for soft assert where exception is handled and further tasks are completed
			Assert.assertEquals(ActResult, ExpResult); //hard assert stops the execution once the exception is occured.
		}
		//softassert.assertAll();
	}

}
