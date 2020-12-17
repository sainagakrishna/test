package WebdriversExamples;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class TC_Verify {
public static void main (String args[]) throws InterruptedException {
		//test case steps
        //common steps to configure and open browser firefox
/*System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.28.0-win64\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");*/
//driver.findElement(By.className("primary")).click();//for firefox not working
//driver.findElement(By.id("enableTls10Button")).click();//for firefox not working
	
       //common steps to configure and open browser chrome
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver =new ChromeDriver();	
driver.navigate().to("https://127.0.0.1/orangehrm-2.6/login.php");
driver.findElement(By.id("details-button")).click();//for chrome
Thread.sleep(2000);
driver.findElement(By.id("proceed-link")).click();//for chrome
		//verify title
        //Actual result      compare      Excepted result
if(driver.getTitle().equals("HRMS")) {
	System.out.println("Tittl matched");
}
else {
	System.out.println("Title not matched");	
	System.out.println(driver.getTitle());
}
//to enter data in a text box
driver.findElement(By.name("txtUserName")).sendKeys("admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin");
driver.findElement(By.name("Submit")).click();	
System.out.println("Login Completed");
Thread.sleep(3000);
//mouseover
Actions ac=new Actions(driver);
ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
//ac.moveToElement(driver.findElement(By.linkText("Time"))).click();//not working
//driver.findElement(By.linkText("Time")).click();
//driver.findElement(By.name("cmbStartDay")).click();
System.out.println("Mouserover action is completed");
driver.findElement(By.linkText("Add Employee")).click();
//System.out.println("Clicked an Submenu");
Thread.sleep(3000);
//driver.findElement(By.linkText("Logout")).click();
//System.out.println("Logout Completed");
//driver.close();


	}

}
