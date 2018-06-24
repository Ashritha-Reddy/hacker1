package gmailpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\testing1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com");
		Thread.sleep(3000);
		
		List<WebElement> l=driver.findElements(By.xpath("//input[@type='image']"));
		
			System.out.println(l.size());
		
		
	driver.close();
	

	}
}

	


