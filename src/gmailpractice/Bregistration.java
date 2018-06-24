package gmailpractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Bregistration {

	public static void main(String[] args) throws BiffException, IOException {
		System.setProperty("webdriver.chrome.driver","C://testing1//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		File f=new File("prac8.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh1=rwb.getSheet(0);
		int not=rsh1.getRows();
		int nouc1=rsh1.getColumns();
		//WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		//WritableSheet wsh1=wwb.getSheet(0);
	
		String fn=rsh1.getCell(0,1).getContents();
		driver.findElement(By.name("firstName")).sendKeys(fn);
		String ln=rsh1.getCell(1,1).getContents();
		driver.findElement(By.name("lastName")).sendKeys(ln);
		String un=rsh1.getCell(2,1).getContents();
		
		driver.findElement(By.name("Username")).sendKeys(un);
		String pwd=rsh1.getCell(3,1).getContents();
		driver.findElement(By.name("Passwd")).sendKeys(pwd);
		
		String cpwd=rsh1.getCell(4,1).getContents();
		driver.findElement(By.name("ConfirmPasswd")).sendKeys(cpwd);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		String phno=rsh1.getCell(5,1).getContents();
		driver.findElement(By.xpath("//*[@aria-label='Enter a phone number']")).sendKeys(phno);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		
		String co=rsh1.getCell(6,1).getContents();
		driver.findElement(By.name("code")).sendKeys(co);
		
		String recemail=rsh1.getCell(7,1).getContents();
		driver.findElement(By.xpath("[aria-label='Recovery email address (optional)']")).sendKeys(recemail);
		
		String d=rsh1.getCell(8,1).getContents();
		driver.findElement(By.xpath("//*[@aria-label='Day']")).sendKeys(d);
		
		String m=rsh1.getCell(9,1).getContents();
	    
		 WebElement e=driver.findElement(By.xpath("//*[@aria-labelledby='month-label']"));
		 Select s=new Select(e);
		 s.selectByVisibleText(m);
		 
			//String y=rsh1.getCell(10,1).getContents();
		//	driver.findElement("//*[@aria-label='Year']").sendKeys(m);
		 
		 

		
		
		
		
		
		
		
		
		
		
		driver.findElement(By.xpath("//*[text()='Next']")).click();
			
		
		
		
		
		
		
		

	}

}
