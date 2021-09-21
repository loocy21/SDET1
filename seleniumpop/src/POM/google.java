package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class google {
	@FindBy(name="q")
	private WebElement searchtb;
	
	public google(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void searchTextbox(String name) {
		searchtb.sendKeys(name);
	}

}
