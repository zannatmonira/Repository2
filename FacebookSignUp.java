package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookSignUp {

	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
	
		driver=new FirefoxDriver();
	}
		
	@Test
	public void Facebook() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		
		//8 types locator-> Id, Name, xpath, CssSelector, tagName, linkText, Partial LinkText, Class Name
		
		//driver.findElement(By.id("u_0_1")).sendKeys("zannat");
		driver.findElement(By.name("firstname")).sendKeys("Zannat");
		//driver.findElement(By.cssSelector("#u_0_1")).sendKeys("Zannat");
		
		
		//driver.findElement(By.id("u_0_3")).sendKeys("monira");
		driver.findElement(By.name("lastname")).sendKeys("monira");
		//driver.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys("monira");
		
		driver.findElement(By.name("reg_email__")).sendKeys("zannatmonira@yahoo.com");
	
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("zannatmonira@yahoo.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("skdfs");
		
		Select monthSelect=new Select(driver.findElement(By.id("month")));
		monthSelect.selectByIndex(4);
		
		Select daySelect=new Select(driver.findElement(By.id("day")));
		daySelect.selectByValue("30");
		
		Select yearSelect=new Select(driver.findElement(By.id("year")));
		
		yearSelect.selectByVisibleText("1998");
		
		driver.findElement(By.id("u_0_6")).click();
		//driver.findElement(By.id("u_0_12")).click();
		
		Thread.sleep(3000);
		System.out.println("===================Facebook SignUp Successful===================");
		driver.close();
		

	}
	}


