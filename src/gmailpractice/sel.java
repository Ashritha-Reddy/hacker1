package gmailpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class sel {

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
		else
		{
			System.out.println("single select dropdown");
			
		}
s.selectByVisibleText("1");
//s.deselectByVisibleText("1");

 WebElement w=driver.findElement(By.name("birthday_month"));
Select g=new Select(w);
g.selectByIndex(1);
WebElement l=driver.findElement(By.name("birthday_year"));
Select p=new Select(l);
p.selectByValue("2018");
int c=p.getOptions().size();

System.out.println(c);
for(int h=0;h<c;h++)
{

	String t=s.getOptions().get(h).getText();
	System.out.println(t);
	
	
}







 
	
	driver.close();
	}

}
