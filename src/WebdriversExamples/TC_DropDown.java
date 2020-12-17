package WebdriversExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
public class TC_DropDown {
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
//select value from dropdown
Select st=new Select(driver.findElement(By.name("loc_code")));
Thread.sleep(2000);
st.selectByVisibleText("Emp. ID");
Thread.sleep(2000);
driver.findElement(By.name("loc_name")).sendKeys("0006");
driver.findElement(By.xpath("//input[@value='Search']")).click();
//driver.findElement(By.name("chkLocID[]")).click();
//driver.findElement(By.xpath("//input[@name='chkLocID[]']")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//input[@value='Delete']")).click();
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
driver.close();
}
}
