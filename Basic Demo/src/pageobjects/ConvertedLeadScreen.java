package pageobjects;

import org.openqa.selenium.WebElement;
import com.provar.core.testapi.annotations.*;

@Page( title="ConvertedLeadScreen"                                
     , summary=""
     , relativeUrl=""
     , connection="SFDemo"
     )             
public class ConvertedLeadScreen {

	@ButtonType()
	@FindByLabel(label = "Close this window")
	public WebElement closeThisWindow;
	@ButtonType()
	@AuraBy(componentXPath = "//lightning:button[@label= 'Go to Leads']")
	public WebElement goToLeads;
			
}
