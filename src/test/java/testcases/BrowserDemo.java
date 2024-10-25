package testcases;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ChromeDriver driver = new ChromeDriver();
//driver.get("https://google.com");
//driver.close();
//EdgeDriver driver = new EdgeDriver();
//driver.get("https://google.com");
String browsername = "Chrome";//here if we pass firefox then will intialized firefox here
//ChromeDriver driver;
//here if we pass chromedriver then will not identify others se+o hirarcy wise we will pass here remotewebdriver
RemoteWebDriver driver = null; 

if (browsername.equalsIgnoreCase("Chrome")) {
	 driver = new ChromeDriver();
	
}
else if (browsername.equalsIgnoreCase("Egde")) {
	driver = new EdgeDriver();
	
}
else if (browsername.equalsIgnoreCase("Firefox")) {
	driver = new FirefoxDriver();}
//for maximize window
	// Options opt = driver.manage();
	// Window win = opt.window();
	// win.maximize();
	 //method chaining
driver.manage().window().maximize();
	driver.get("https://google.com");
	String expectedURL = "https://www.google.com/";
	String actualURL = driver.getCurrentUrl();
	if (actualURL.equals(expectedURL)) {
		System.out.println("url is loaded correctly");
		}
		else {
			System.out.println("url is loaded incorrectly");
		}
	driver.close();
	
	
	 
	
	}
	

	}
	
	

