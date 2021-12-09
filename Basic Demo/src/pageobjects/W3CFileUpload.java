package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="W3CFileUpload"                                
     , summary=""
     , relativeUrl=""
     , connection="FileUploadPO"
     )             
public class W3CFileUpload {

	@ButtonType(file = true)
	@FindBy(xpath = "//input[@id='myFile']")
	public WebElement Upload;
			
}
