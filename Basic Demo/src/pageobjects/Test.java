package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Test"                                
     , summary=""
     , relativeUrl=""
     , connection="PersonalDevOrg"
     )             
public class Test {

	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-order_-record_-page___-order__c___-v-i-e-w').shadowRoot.querySelector('forcegenerated-flexipage_order_record_page_order__c__view_js').shadowRoot.querySelector('c-order-builder').shadowRoot.querySelector('c-order-item-tile').shadowRoot.querySelectorAll('lightning-input')[2].shadowRoot.querySelector('input')")
	public WebElement Medium;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='This list is pinned']")
	public WebElement thisListIsPinned;
			
}
