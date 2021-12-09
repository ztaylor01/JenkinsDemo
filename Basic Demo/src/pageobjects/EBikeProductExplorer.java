package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="EBikeProductExplorer"                                
     , summary=""
     , relativeUrl=""
     , connection="PersonalDevOrg"
     )             
public class EBikeProductExplorer {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='ELECTRA X4MSRP: $4,900.00']")
	public WebElement electraX4;
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(xpath = "//lightning-record-view-form//lightning-output-field/span[text()='MSRP']/following-sibling::div/lightning-formatted-text")
	public WebElement MSRP;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='DYNAMO X2MSRP: $7,200.00']")
	public WebElement dynamoX2;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Product Explorer']")
	public WebElement productExplorerLink;
	@PageWait.Field(timeoutSeconds = 10)
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Search Key']/following-sibling::div//input")
	public WebElement searchKey;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Max Price0-10000']/following-sibling::div//input")
	public WebElement PriceSlider;		
}
