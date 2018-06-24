package gmailpractice;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\testing1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.manage().window().getSize());
	     Dimension d=new Dimension(1200,700);
		
		driver.manage().window().setSize(d);
		
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(5000);
		if(driver.manage().getCookies().size()!=0)
		{
			System.out.println("cookies were loaded");
			
		}
		else
		{
			System.out.println("cookies were  not loaded");
		}
		
		System.out.println(driver.manage().window().getPosition());
		Point p=new Point(100,100);
		
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
		System.out.println(driver.manage().window().getPosition());
		
		driver.close();
		
	}

}
