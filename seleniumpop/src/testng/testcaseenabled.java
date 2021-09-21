package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testcaseenabled {
	@Test(enabled=false)
	public void calls() {
		Reporter.log("calls",true);
	}
	@Test(priority=-1)
	public void status() {
		Reporter.log("Status",true);
	}
	@Test(priority=-1)
	public void chats() {
		Reporter.log("chats",true);
		
		
	}

}

