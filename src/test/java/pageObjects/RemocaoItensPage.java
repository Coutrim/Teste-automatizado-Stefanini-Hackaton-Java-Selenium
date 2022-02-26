package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemocaoItensPage {
	@FindBy(name = "add-to-cart-sauce-labs-backpack")
	private WebElement item1;

	@FindBy(name = "add-to-cart-sauce-labs-bike-light")
	private WebElement item2;

	@FindBy(name = "add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement item3;

	@FindBy(name = "add-to-cart-sauce-labs-fleece-jacket")
	private WebElement item4;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement carrinho;

	@FindBy(name = "remove-sauce-labs-fleece-jacket")
	private WebElement botaoRemover;

	@FindBy(name = "checkout")
	private WebElement botaoCheckOut;

	@FindBy(name = "firstName")
	private WebElement campoNameCheckOut;

	@FindBy(name = "lastName")
	private WebElement campoLastNameCheckOut;

	@FindBy(name = "postalCode")
	private WebElement campoPostalCode;

	@FindBy(name = "continue")
	private WebElement botaoContinue;

	@FindBy(name = "finish")
	private WebElement botaoFinish;

	public void adicionarProdutos() {
		item1.click();
		item2.click();
		item3.click();
		item4.click();
	}

	public void irAoCarrinho() {
		carrinho.click();
	}

	public void removerItem() {
		botaoRemover.click();
	}

	public void prosseguirCheckout() {
		botaoCheckOut.click();
	}

	public void preencherInformacoes(String name, String lastName, String postalCode) {
		campoNameCheckOut.sendKeys(name);
		campoLastNameCheckOut.sendKeys(lastName);
		campoPostalCode.sendKeys(postalCode);
		botaoContinue.click();
	}

	public void acionarBotaoFinish() {
		botaoFinish.click();
	}
}
