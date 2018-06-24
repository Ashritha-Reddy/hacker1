package gmailpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\testing1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		List<WebElement> l=driver.findElements(By.xpath("//form")); 
		System.out.println("count of forms in page is "+l.size());
		List<WebElement> k=driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(l.size());
		
		
		
	}

}
