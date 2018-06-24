package gmailpractice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class way2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://testing1//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/content/index.html?");
		driver.findElement(By.xpath("//*[@src=\"../images/android-button.png\"]")).click();
		
		ArrayList<String> whs=new ArrayList<String>(driver.getWindowHandles());
		for( int i=0;i<whs.size();i++)
		{
			System.out.println(whs.get(i));
			
		}
		Thread.sleep(15000);
		
         driver.switchTo().window(whs.get(0));
         Thread.sleep(5000);
         driver.switchTo().window(whs.get(1));
         Thread.sleep(5000);
         
         
         String l=driver.getWindowHandle();
         System.out.println(l);
         String h=driver.getTitle();
         System.out.println(h);
         String j=driver.getCurrentUrl();
         System.out.println(j);
         if(j.contains("https"))
         {
        	 System.out.println("secured"); 
         }
         else
         {
        	 System.out.println("not secured"); 
         }
         driver.close();
         
         
         
         
	}

}
