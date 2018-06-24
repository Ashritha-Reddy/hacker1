package gmailpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\testing1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement e =driver.findElement(By.name("q"));
		
		Actions a=new Actions(driver);
		a.sendKeys(e,"kalam").build().perform();
		Thread.sleep(5000);
		for(int i=1;i<=4;i++)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			
			Thread.sleep(5000);
		}
		a.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(5000);
		
		
		
	}

}
