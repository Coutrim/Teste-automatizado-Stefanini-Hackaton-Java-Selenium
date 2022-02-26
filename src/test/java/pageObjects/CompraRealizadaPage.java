package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompraRealizadaPage {
	@FindBy(name = "finish")
	private WebElement botaoFinish;
	
	public void acionarBotaoFinish() {
		botaoFinish.click();
	}
}
