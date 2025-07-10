package practice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TakeScreenShot {
	WebDriver driver=new ChromeDriver();
TakesScreenshot tks=(TakesScreenshot) driver;
ExtentReports report=new ExtentReports();
ExtentSparkReporter spark=new ExtentSparkReporter("Reports/report.html");
ExtentTest test;
public void screenShot() throws IOException
{
	driver.get("https://artoftesting.com/rest-api-testing-tutorial");
	File src=tks.getScreenshotAs(OutputType.FILE);
	String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	File dest=new File("screenShot/" + timestamp + ".jpg");
	FileUtils.copyFile(src, dest);
	spark.config().setDocumentTitle("extentReport");
	spark.config().setTheme(Theme.STANDARD);
	spark.config().setReportName("MyReport");
	report.attachReporter(spark);
	report.setSystemInfo("QA", "Devashree");
	report.setSystemInfo("Reviewed By", "QA Lead");
	test=report.createTest("test");
	test.addScreenCaptureFromPath("screenShot/screen1.jpg");
	report.flush();
}
public static void main(String[] args) throws IOException {
	TakeScreenShot t=new TakeScreenShot();
	t.screenShot();
	
}
}
