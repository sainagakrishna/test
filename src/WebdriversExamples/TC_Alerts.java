package WebdriversExamples;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;;


public class TC_Alerts{
public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.28.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();	
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	Thread.sleep(2000);
	a.accept();
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	driver.close();
}
}
