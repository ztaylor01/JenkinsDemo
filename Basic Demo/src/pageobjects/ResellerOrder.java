package pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ResellerOrder"                                
     , summary=""
     , relativeUrl=""
     , connection="PersonalDevOrg"
     )             
public class ResellerOrder {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Price']/following-sibling::div//input")
	public WebElement price;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Small']/following-sibling::div//input")
	public WebElement small;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Medium']/following-sibling::div//input")
	public WebElement medium;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Large']/following-sibling::div//input")
	public WebElement large;
	@LinkType()
	@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adgrollup_component___forcegenerated__flexipage_recordpage___order_record_page___order__c___view').shadowRoot.querySelector('forcegenerated-flexipage_order_record_page_order__c__view_js').shadowRoot.querySelector('flexipage-tabset2').shadowRoot.querySelector('lightning-tabset').shadowRoot.querySelector('lightning-tab-bar').shadowRoot.querySelector('a')")
	public WebElement relatedTab;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='View All']")
	public WebElement viewAll;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'region-sidebar-right')]//flexipage-component2[@data-component-id='productTileList']//img")
	public WebElement SearchSelection;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-order_-record_-page___-order__c___-v-i-e-w').shadowRoot.querySelector('forcegenerated-flexipage_order_record_page_order__c__view_js').shadowRoot.querySelector('c-order-builder').shadowRoot.querySelector('c-placeholder').shadowRoot.querySelector('img')")
	public WebElement DropCanvas;
	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-order_-record_-page___-order__c___-v-i-e-w').shadowRoot.querySelector('forcegenerated-flexipage_order_record_page_order__c__view_js').shadowRoot.querySelector('c-order-builder').shadowRoot.querySelector('c-order-item-tile').shadowRoot.querySelectorAll('lightning-button-icon')[1].shadowRoot.querySelector('button')")
	public WebElement ConfirmEdit;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-order_-record_-page___-order__c___-v-i-e-w').shadowRoot.querySelector('forcegenerated-flexipage_order_record_page_order__c__view_js').shadowRoot.querySelector('c-product-tile-list').shadowRoot.querySelector('lightning-input').shadowRoot.querySelector('input')")
	public WebElement searchKey;
			
}
