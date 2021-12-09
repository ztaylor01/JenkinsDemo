package pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="OrderItem"                                
     , summary=""
     , relativeUrl=""
     , connection="PersonalDevOrg"
     )             
public class OrderItem {

	@PageWait.Field(timeoutSeconds = 10)
	@FindBy()
	@LinkType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[1].shadowRoot.querySelector('forcegenerated-adgrollup_component___forcegenerated__flexipage_recordpage___flexipage__default_rec_l___order_item__c___view').shadowRoot.querySelector('forcegenerated-flexipage_default_rec_l_order_item__c__view_js').shadowRoot.querySelector('records-lwc-detail-panel').shadowRoot.querySelector('records-base-record-form').shadowRoot.querySelector('records-lwc-record-layout').shadowRoot.querySelector('forcegenerated-detailpanel_order_item__c___012000000000000aaa___full___view___recordlayout2').shadowRoot.querySelectorAll('force-lookup')[1].shadowRoot.querySelector('force-hoverable-link').shadowRoot.querySelector('a')")
	public WebElement product;
	@FindBy()
	@TextType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[1].shadowRoot.querySelector('forcegenerated-adgrollup_component___forcegenerated__flexipage_recordpage___flexipage__default_rec_l___order_item__c___view').shadowRoot.querySelector('forcegenerated-flexipage_default_rec_l_order_item__c__view_js').shadowRoot.querySelector('records-lwc-detail-panel').shadowRoot.querySelector('records-base-record-form').shadowRoot.querySelector('records-lwc-record-layout').shadowRoot.querySelector('forcegenerated-detailpanel_order_item__c___012000000000000aaa___full___view___recordlayout2').shadowRoot.querySelectorAll('lightning-formatted-number')[2]")
	public WebElement Large;
	@FindBy()
	@TextType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[1].shadowRoot.querySelector('forcegenerated-adgrollup_component___forcegenerated__flexipage_recordpage___flexipage__default_rec_l___order_item__c___view').shadowRoot.querySelector('forcegenerated-flexipage_default_rec_l_order_item__c__view_js').shadowRoot.querySelector('records-lwc-detail-panel').shadowRoot.querySelector('records-base-record-form').shadowRoot.querySelector('records-lwc-record-layout').shadowRoot.querySelector('forcegenerated-detailpanel_order_item__c___012000000000000aaa___full___view___recordlayout2').shadowRoot.querySelectorAll('lightning-formatted-number')[1]")
	public WebElement Medium;
	@FindBy()
	@TextType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[1].shadowRoot.querySelector('forcegenerated-adgrollup_component___forcegenerated__flexipage_recordpage___flexipage__default_rec_l___order_item__c___view').shadowRoot.querySelector('forcegenerated-flexipage_default_rec_l_order_item__c__view_js').shadowRoot.querySelector('records-lwc-detail-panel').shadowRoot.querySelector('records-base-record-form').shadowRoot.querySelector('records-lwc-record-layout').shadowRoot.querySelector('forcegenerated-detailpanel_order_item__c___012000000000000aaa___full___view___recordlayout2').shadowRoot.querySelectorAll('force-record-layout-item')[2].shadowRoot.querySelectorAll('span')[1]")
	public WebElement Small;
			
}
