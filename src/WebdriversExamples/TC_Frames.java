package WebdriversExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
public class TC_Frames {
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
Thread.sleep(4000);
//click on add btn
driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
//Thread.sleep(3000);
//type FN & LN
driver.findElement(By.name("txtEmpLastName")).sendKeys("one");
driver.findElement(By.name("txtEmpFirstName")).sendKeys("two");
//driver.findElement(By.id("photofile")).click();
//click on save btn
driver.findElement(By.id("btnEdit")).click();
driver.findElement(By.className("backbutton")).click();
//to delete employee list
//Actions ac =new Actions(driver);
//driver.findElement(By.xpath("//input[@class='checkbox'][@value='0008']")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("//input[@value='Delete']")).click();
driver.switchTo().defaultContent();
Thread.sleep(4000);
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
//driver.close();
}
}
