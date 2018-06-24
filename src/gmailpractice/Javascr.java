package gmailpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascr {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C://testing1//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement e=driver.findElement(By.id("gsri_ok0"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
	     
		
		
		js.executeScript("arguments[0].style.border='2px dotted blue';",e);
		Thread.sleep(5000);
		
	js.executeScript("arguments[0].click();",e);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	
	
	
		
				
		
		
		
		
		
	}

}
