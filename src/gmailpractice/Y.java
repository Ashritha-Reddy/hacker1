package gmailpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Y {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://testing1//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement e=driver.findElement(By.name("q"));
		
		Actions a=new Actions(driver);
		a.click(e).build().perform();
		Thread.sleep(5000);
		a.sendKeys(e,"hello").build().perform();
		Thread.sleep(5000);
		a.contextClick(e).build().perform();
		Thread.sleep(5000);
		a.doubleClick(e).build().perform();
		Thread.sleep(5000);
	    WebElement e1=driver.findElement(By.xpath("//*[@aria-label='Search by voice']"));
	   // a.moveToElement(e1).build().perform();
	   int g=e1.getLocation().getX();
	  int u=e1.getLocation().getY();
	   
	  a.moveByOffset(g, u).build().perform();

	   
	   
	    
	    Thread.sleep(10000);
	    driver.close();
	    
		
		
		
		

	}

}
