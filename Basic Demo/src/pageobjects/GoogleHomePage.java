package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="GoogleHomePage"                                
     , summary=""
     , relativeUrl=""
     , connection="google"
     )             
public class GoogleHomePage {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Sign in']")
	public WebElement signIn;
			
}
