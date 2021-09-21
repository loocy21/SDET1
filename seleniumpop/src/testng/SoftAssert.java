package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class SoftAssert {
	public WebDriver driver;
	@BeforeMethod
	public void openApp() {
	   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	
	@Test
	public void tc1(){
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("778487636");
		driver.findElement( By.id("did_submit")).click();
		String t=driver.getTitle();
			
		SoftAssert s=new SoftAssert();
		s.assertEquals(t,"shdhhd");

		Reporter.log(t,true);
		String url=driver.getCurrentUrl();
		Reporter.log(url,true);
		 s.assertAll();
		
	}

	private void assertEquals(String t, String string) {
		// TODO Auto-generated method stub
		
	}

	private void assertAll() {
		// TODO Auto-generated method stub
		
	}

	
		
	

	@AfterMethod
	public void closeApp() {
	 driver.close();
	}

		



		
	}






