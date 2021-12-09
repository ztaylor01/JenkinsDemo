package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="googlehome"                                
     , summary=""
     , relativeUrl=""
     , connection="google"
     )             
public class googlehome {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Sign in']")
	public WebElement signIn;
			
}
