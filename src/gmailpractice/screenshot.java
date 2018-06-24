package gmailpractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\testing1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("happy me");
		Thread.sleep(5000);
		
		
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("C://testing1//googlescreenshot.png");
		FileUtils.copyFile(src, dest);
		
		

	}

}
