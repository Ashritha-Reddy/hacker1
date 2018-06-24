package gmailpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class Select {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://testing1//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e=driver.findElement(By.name("birthday_day"));

		Select s=new Select(e);
		if(s.isMultiple())
		{
			System.out.println("multi select dropdown");
		
		}
		
		
		
	}

	private boolean isMultiple() {
		// TODO Auto-generated method stub
		return false;
	}

}
