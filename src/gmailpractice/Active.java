package gmailpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Active {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://testing1//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement e=driver.findElement(By.name("q"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('disabled',true);",e);
		Thread.sleep(5000);
		js.executeScript("arguments[0].removeAttribute('disabled');",e);
		WebElement y=driver.findElement(By.name("q"));
		String j=y.getAttribute("jsaction");
		
		
		//WebElement e2=driver.findElement(By.xpath("//*[@class='hp vasq']"));
		
	//	String d=e2.getAttribute("aria-label");
		
		System.out.println(j);
		

	}

}
