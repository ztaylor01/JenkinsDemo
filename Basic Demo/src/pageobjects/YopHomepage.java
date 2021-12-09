package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="YopHomepage"                                
     , summary=""
     , relativeUrl=""
     , connection="Yopemail"
     )             
public class YopHomepage {

	@TextType()
	@FindBy(xpath = "//input[@id='login']")
	public WebElement Login;
	@ButtonType()
	@FindByLabel(label = "Check Inbox")
	public WebElement checkInbox;
			
}
