package gmailpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C://testing1//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
	    driver.findElement(By.name("identifier")).sendKeys("mallareddyrondla123@gmail.com");
	    
			driver.findElement(By.xpath("//*[text()='Next']")).click();
		WebDriverWait w=new WebDriverWait(driver,100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Welcome']")));
		driver.findElement(By.name("password")).sendKeys("elevators123");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='COMPOSE']")));
		driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
		
		
		//driver.findElement(By.xpath("//[text()='Inbox']")).click();
		driver.findElement(By.name("to")).sendKeys("ashrithared95@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("HI HOW ARE U DONT WORRY BABY");
		driver.findElement(By.xpath("//*[@id=\":ag\"]")).click();
		
		StringSelection x=new StringSelection("D:\\chinni.jpg");
	     Thread.sleep(5000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	
		
		
		driver.findElement(By.xpath("//*[@id=\":8g\"]")).click();
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='View message']")));
		
		
		
			driver.close();
			
			

	}

}
