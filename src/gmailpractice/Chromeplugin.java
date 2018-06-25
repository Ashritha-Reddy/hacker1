package gmailpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chromeplugin {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\testing1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/entry?ec=0080&id=0.9693423852522369");
		//driver.switchTo().frame(lgotFrame);
		driver.findElement(By.name("username")).sendKeys("9963731221");
		driver.findElement(By.name("password")).sendKeys("G7472P");
		
		driver.findElement(By.xpath("//*[@value='Login']")).click();
		
		driver.findElement(By.xpath("//*[text()='Send SMS']")).click();
		WebDriverWait w=new WebDriverWait(driver,100);
		
		
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame"));
		
		
		driver.findElement(By.name("mobile")).sendKeys("9963731221");
		driver.findElement(By.xpath("//*[contains(@placeholder,'Type your')]")).sendKeys("hiii baby hw r u");
		
		driver.findElement(By.xpath("//*[@value='Send SMS']")).click();
		
		
		
		
		
		
		
		
	
	         
	}

}
