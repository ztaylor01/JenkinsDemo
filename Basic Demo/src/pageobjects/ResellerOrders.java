package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ResellerOrders"                                
     , summary=""
     , relativeUrl=""
     , connection="PersonalDevOrg"
     )             
public class ResellerOrders {
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Reseller Orders']")
	public WebElement resellerOrdersTab;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='New']")
	public WebElement New;
			
}
