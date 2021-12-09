package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ConvertLeadPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="SFDemo"
     )             
public class ConvertLeadPageObject {

	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"containerWithMargin\")]/fieldset[1]/div/div/div[2]/div[1]/div[2]/div//input")
	public WebElement accountName;
	@TextType()
	@FindBy(xpath = "//div[3]/div//input")
	public WebElement firstName;
	@TextType()
	@FindBy(xpath = "//div[5]/div/input")
	public WebElement lastName;
	@BooleanType()
	@AuraBy(componentXPath = "//ui:inputCheckbox[@value= '{!v.isDoNotCreateOpptySelected}']")
	public WebElement isDoNotCreateOpptySelected;
	@ButtonType()
	@AuraBy(componentXPath = "//ui:modal[@aura:id= 'modal']")
	public WebElement closeThisWindow;
			
}
