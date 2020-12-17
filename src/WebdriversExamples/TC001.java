package WebdriversExamples;
//common packages need to be get import
//to get access for webdriver classes & methods
import org.openqa.selenium.WebDriver;
//to get access for firefoxbrowser
import org.openqa.selenium.firefox.FirefoxDriver;
//for chrome
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import java.util.Collections;

//to get access for object and methods
import org.openqa.selenium.By;
public class TC001 {
public static void main(String args[]) {
//Test case steps
//1.launch browser
System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.28.0-win64\\geckodriver.exe");
 WebDriver driver =new FirefoxDriver();/*Firefox driver*/
 driver.navigate().to("https://127.0.0.1/orangehrm-2.6/login.php");
//driver.findElement(By.name("txtUserName")).sendKeys("admin");
//driver.findElement(By.name("txtPassword")).sendKeys("admin");
//driver.findElement(By.name("Submit")).click();
//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
//WebDriver driver =new ChromeDriver();/*Chrome driver*/
//driver.navigate().to("https://127.0.0.1/orangehrm-2.6/login.php");//to launch webpage
 //Thread.sleep(3000);//wait for some time
//driver.findElement(By.id("details-button")).click();
//driver.findElement(By.id("proceed-link")).click();
driver.findElement(By.name("txtUserName")).sendKeys("admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin");
driver.findElement(By.name("Submit")).click();
driver.close();//to close browser	
 
	}

}
