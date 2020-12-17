package WebdriversExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Facebook {
public static void main(String asrgs[]) {
/*System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.28.0-win64\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.navigate().to("https://www.facebook.com/");
driver.findElement(By.name("email")).sendKeys("sainagakrisna79@gmail.com");
driver.findElement(By.name("pass")).sendKeys("Sainaga@59");
driver.findElement(By.name("login")).click();*/
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("sainagakrishna79@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("Sainaga@5");
	driver.findElement(By.name("login")).click();
	driver.findElement(By.className("_6s5d _71pn _-kb segoe")).click();
   
}

}
