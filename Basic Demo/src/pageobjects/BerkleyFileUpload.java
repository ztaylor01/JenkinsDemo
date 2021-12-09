package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="BerkleyFileUpload"                                
     , summary=""
     , relativeUrl=""
     , connection="BerkleyFileUpload"
     )             
public class BerkleyFileUpload {

	@ButtonType(file = true)
	@FindBy(xpath = "//input[@name='upfile']")
	public WebElement UploadFile;
			
}
