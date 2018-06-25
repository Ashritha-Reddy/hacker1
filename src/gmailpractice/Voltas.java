package gmailpractice;

import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Duration;
//import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Voltas {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://testing1//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		   WebDriverWait w=new WebDriverWait(driver,100);
		   w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		   
		   FluentWait f=new FluentWait(driver).pollingEvery(5,TimeUnit.SECONDS).withTimeout(100,TimeUnit.SECONDS);
		   
		   
		   driver.manage().window().maximize();
		   driver.close();
		   
		 
		   
		   
		
		
	}

}
