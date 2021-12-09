package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Provarqs__ Product Selector"                                
               , summary=""
               , page="ProductSelector"
               , namespacePrefix="ProvarQS"
               , object="Opportunity"
               , connection="SFDemo"
     )             
public class provarqs__ProductSelector {

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.StageName}\"]")
	@SalesforceField(name = "StageName", object = "Opportunity")
	public WebElement stage;
	@PageTable(row = LineItems.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!LineItems}\"]")
	public List<LineItems> lineItems;

	@PageRow(byColumn = true)
	public static class LineItems {

		@ChoiceListType()
		@VisualforceBy(componentXPath = "apex:selectList[@value = \"{!lines.PriceBookEntryId}\"]")
		public WebElement selectProduct;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!lines.TotalPrice}\"]")
		public WebElement amount;
	}

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!save}']")
	public WebElement save;
	
}
