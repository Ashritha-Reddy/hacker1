package gmailpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multithreading extends Thread {
	
	public void run()
	
	{
		System.setProperty("webdriver.chrome.driver","C://testing1//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
		
		
	}

	public static void main(String[] args) throws InterruptedException
	{
		Multithreading m=new Multithreading();
		m.start();
		
		
		System.setProperty("webdriver.chrome.driver","C://testing1//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("ASHRITHA BE HAPPY");
		Thread.sleep(15000);
		
		driver.close();
		
		

	}

}
