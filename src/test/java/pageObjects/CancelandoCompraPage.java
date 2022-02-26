package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancelandoCompraPage {
	@FindBy(name = "cancel")
	private WebElement botaoCancel;

	public void acionarBotaoCancel() {
		botaoCancel.click();
	}
}
