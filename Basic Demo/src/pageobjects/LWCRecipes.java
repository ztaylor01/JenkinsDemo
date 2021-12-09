package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="LWCRecipes"                                
     , summary=""
     , relativeUrl=""
     , connection="ShadowDOM"
     )             
public class LWCRecipes {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Name']/following-sibling::div//input")
	public WebElement NameInput;
	@TextType()
	@FindBy(xpath = "//p[normalize-space(.)='Hello, Testing123!']")
	public WebElement HelloNameField;
			
}
