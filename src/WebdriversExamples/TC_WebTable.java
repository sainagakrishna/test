package WebdriversExamples;


import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.ThreadFactory;

import org.openqa.selenium.By;


public class TC_WebTable {
public static void main(String args[]) throws Exception {
System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.28.0-win64\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
//WebDriver driver =new ChromeDriver();	
driver.navigate().to("file:///D:/Orange%20HRM/HtmlFiles/WebTable.html");
Thread.sleep(2000);
//To count row column 
//int row=driver.findElements(By.xpath("//*[@id=\'idCourse']/tbody/tr[7]/td[4]")).size();
int row=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td[1]")).size();
int col=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td")).size();
int rowcol=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
Thread.sleep(2000);
System.out.println(row);
System.out.println(col);
System.out.println(rowcol);
//To get data from particular cell
String Data=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).getText();
System.out.println(Data);
//to get data from all cell
for (int i=1; i<=col; i++) {
	String Data1=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr["+i+"]")).getText();
	System.out.println(Data1);
	//not printing for column
	//String Data1=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/td[1]["+i+"]")).getText();
   // System.out.println(Data1);
}
driver.close();
	
}

}
