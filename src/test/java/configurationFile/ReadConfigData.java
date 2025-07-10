package configurationFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadConfigData {
	WebDriver driver;
	@Test
public void readConfig() throws IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\Devashree\\Selenium\\Simple_Maven_Project1\\config.properties");
	Properties pro=new Properties();
	pro.load(file);
	String OpenBrowser=pro.getProperty("browser");
	System.out.println(OpenBrowser);
	String URL=pro.getProperty("baseurl");
	System.out.println(URL);
	if(OpenBrowser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}
	else if(OpenBrowser.equalsIgnoreCase("fireFox")){
		driver=new FirefoxDriver();
	}
	else if(OpenBrowser.equalsIgnoreCase("Edge")){
		driver=new EdgeDriver();
	}
	else {
		driver=new ChromeDriver();
	}
	driver.get(URL);
}
}
