package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="LWCTest"                                
     , summary=""
     , relativeUrl=""
     , connection="ShadowDOM"
     )             
public class LWCTest {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Name']/following-sibling::div//input")
	public WebElement NameInput;
			
}
