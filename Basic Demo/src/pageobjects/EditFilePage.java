package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="EditFilePage"                                
     , summary=""
     , relativeUrl=""
     , connection="SFDemo"
     )             
public class EditFilePage {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Title*']/following-sibling::input")
	public WebElement Title;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'modal-footer')]/div/button[@title='Save']")
	public WebElement Save;
			
}
