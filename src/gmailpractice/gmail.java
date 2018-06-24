package gmailpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\testing1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("http://www.facebook.com");
		Thread.sleep(10000);
		//driver.navigate().back();
		//Thread.sleep(15000);
		//driver.navigate().forward();
		//Thread.sleep(10000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().forward();
		
		
Thread.sleep(5000);
	}

}
