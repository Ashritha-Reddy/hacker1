package gmailpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://testing1//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String x=driver.findElement(By.name("q")).getAttribute("type");
		
		System.out.println(x);
		String y=driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).getAttribute("aria-label");
		

		System.out.println(y);
	}

}
