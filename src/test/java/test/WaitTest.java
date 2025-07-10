package test;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Thread.sleep(4000);
//	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	FluentWait<WebDriver> wait=new FluentWait<>(driver)
			.withTimeout(Duration.ofSeconds(30)) //maximum wait time
			.pollingEvery(Duration.ofSeconds(5)) //Polling interval
			.ignoring(NoSuchElementException.class); //ignoring specific exception
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']"))).sendKeys("Admin");
	//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
}
}
