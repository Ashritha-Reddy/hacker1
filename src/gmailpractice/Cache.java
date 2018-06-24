package gmailpractice;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cache {

	public static void main(String[] args) throws InterruptedException {
		int c=1;
		
		
		
		Scanner sc=new Scanner(System.in);
		//enter any word to search
		String x=sc.nextLine();
		// ENTER your required suggestion
		String h=sc.nextLine();
		System.setProperty("webdriver.chrome.driver","C://testing1//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.get("http:/www.google.com");
	    driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	  WebElement e=driver.findElement(By.name("q"));
	  Actions a=new Actions(driver);
	  a.sendKeys(e,x).build().perform();
	  Thread.sleep(5000);
	  
	 while(2>1)
	  {
		 
		 
		 String z=e.getAttribute("value");
		 
		 if(z.equals(h))
		 {
			 System.out.println("suggestion was found");
			 
			 a.sendKeys(Keys.ENTER).build().perform();
			break; 
		 }
		 else 
		 {
		      if(c==10)
		      {
		    	 System.out.println("suggestion was not found");    
		    	 break;
		      }
		      else
		      {
		    	  
		    	  
		    	  
		    	  
		    	  a.sendKeys(Keys.DOWN).build().perform();
		    	  c=c+1;
		    	  Thread.sleep(5000);
		    	  
		      }
			 
		 }
		 
	  }
	  
	  Thread.sleep(5000);
	  
		  
		  
	  }
	    
		
	}


