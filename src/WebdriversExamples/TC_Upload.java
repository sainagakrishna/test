package WebdriversExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
public class TC_Upload  {
public static void main(String args[]) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.28.0-win64\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin");
driver.findElement(By.name("Submit")).click();	
System.out.println("Login Completed");
//to enter into frame
driver.switchTo().frame("rightMenu");
driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
//Thread.sleep(3000);
//type FN & LN
driver.findElement(By.name("txtEmpLastName")).sendKeys("one");
driver.findElement(By.name("txtEmpFirstName")).sendKeys("two");
//To upload file
WebElement fileInput= driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
fileInput.sendKeys("C:\\Users\\saina\\OneDrive\\Pictures\\Camera Roll\\WIN_20200720_09_56_17_Pro.jpg");
Thread.sleep(4000);
System.out.println("File Uploaded");
driver.findElement(By.id("btnEdit")).click();
System.out.println("Employee Added");
driver.switchTo().defaultContent();
Thread.sleep(4000);
driver.findElement(By.linkText("Logout")).click();
driver.close();
}
}
