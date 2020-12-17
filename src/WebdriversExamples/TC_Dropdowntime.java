package WebdriversExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TC_Dropdowntime {
public static void main(String args[]) {
	System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.28.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();	
	System.out.println("Login Completed");
	driver.findElement(By.linkText("Time")).click();
	driver.switchTo().frame("rightMenu");
	//driver.findElement(By.className("current")).click();doubt
	Select st=new Select(driver.findElement(By.name("cmbStartDay")));
	st.selectByVisibleText("Select");
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();	
}
}
