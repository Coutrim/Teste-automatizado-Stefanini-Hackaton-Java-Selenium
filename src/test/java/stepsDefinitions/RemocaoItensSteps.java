package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.RemocaoItensPage;

public class RemocaoItensSteps {

	@Quando("eu adicionar os produtos ao carrinho")
	public void euAdicionarOsProdutosAoCarrinho() {
		Na(RemocaoItensPage.class).adicionarProdutos();
	}

	@Quando("prosseguir para o carrinho")
	public void prossigaParaOCarrinho() {
		Na(RemocaoItensPage.class).irAoCarrinho();
	}

	@Quando("remova itens do carrinho")
	public void removaItensDoCarrinho() {
		Na(RemocaoItensPage.class).removerItem();
	}

	@Entao("^o sistema exibe o carrinho sem os itens que foram removidos$")
	public void oSistemaExibeOCarrinhoSemOsItensQueForamRemovidos() {
		assertTrue(driver.findElements(By.name("remove-sauce-labs-fleece-jacket")).isEmpty());
	}

}
