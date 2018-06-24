package gmailpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\testing1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("alert('ashritha is a very good irl keep singing always')");
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		
		//WebElement e=driver.findElement(By.name("q"));
		
		
		
		
	//	js.executeScript("arguments[0].value='ashrithareddy';", e);
		
		js.executeScript("document.getElementById('lst-ib').value='ashritha reddy';");
		
		
		Thread.sleep(5000);
		
		
		
		
	   
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		

	}

}
