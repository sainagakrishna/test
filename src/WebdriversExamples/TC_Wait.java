package WebdriversExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class TC_Wait {
public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.28.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	//wait until login button need to be loaded--------explicit wait
	WebDriverWait wait=new WebDriverWait(driver,5000);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
	driver.findElement(By.name("Submit")).click();	
	//wit until page need to be loaded--------implicit wait
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	System.out.println("Login Completed");
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(4000);
	System.out.println("Logout Completed");
	driver.close();
	
}
}
