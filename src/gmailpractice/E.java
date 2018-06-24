package gmailpractice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		WebDriver driver=null;
		
		if(x.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C://testing1//chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(x.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C://testing1//geckodriver.exe");
			driver=new FirefoxDriver();	
		}
		driver.get("http://www.flipkart.com");	
		driver.close();
		
		
	}

}
