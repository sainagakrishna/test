package WebdriversExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
public class TC_KB_WD {
public static void main(String args[]) throws Exception{
	System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.28.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("selenium");
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	driver.close();
}
	

}
