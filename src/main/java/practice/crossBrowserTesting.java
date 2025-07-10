package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTesting {
	WebDriver driver;
@Test
@Parameters("browser")
public void testBrowser(String browser) {
switch(browser)
{
case "chrome":
	driver=new ChromeDriver();
	
	break;
case "edge":
	driver=new EdgeDriver();
	
	break;
}
driver.get("https://www.google.com/");
}
}
