package WebdriversExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;


public class Gmail {
public static void main(String args[]) throws Exception {
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
//System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.28.0-win64\\geckodriver.exe");
//WebDriver driver =new FirefoxDriver();
driver.navigate().to("https://accounts.google.com/ServiceLogin/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
driver.findElement(By.name("identifier")).sendKeys("sainagakrishna69@gmail.com");
Thread.sleep(4000);
//driver.findElement(By.id("yDmH0d")).click();//its not working in chrome
driver.findElement(By.className("VfPpkd-Jh9lGc")).click();//not woring
//driver.findElement(By.className("VfPpkd-RLmnJb")).click();//not working
//driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d'][@jsname='V67aGc']")).click();//its not working in chrome
driver.findElement(By.name("password")).sendKeys("Sainaga@59");
	}
	

}
