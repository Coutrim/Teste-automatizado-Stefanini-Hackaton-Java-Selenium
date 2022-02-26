package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CancelandoCompraPage;
import pageObjects.LoginPage;
import pageObjects.RemocaoItensPage;

public class CancelandoCompraSteps {

	@Dado("que eu esteja logado no sistema")
	public void queEuEstejaLogadoNoSistema() {
		Na(LoginPage.class).realizarLogin("standard_user", "secret_sauce");
	}

	@Quando("eu adicionar os produtos desejados ao carrinho")
	public void euAdicionarOsProdutosDesejadosAoCarrinho() {
		Na(RemocaoItensPage.class).adicionarProdutos();
	}

	@Quando("eu prosseguir para o carrinho")
	public void euProsseguirParaOCarrinho() {
		Na(RemocaoItensPage.class).irAoCarrinho();
	}

	@Quando("ir para o checkout")
	public void irParaOCheckout() {
		Na(RemocaoItensPage.class).prosseguirCheckout();
	}

	@Quando("informar meus dados {string} {string} {string}")
	public void informarMeusDados(String string, String string2, String string3) {
		Na(RemocaoItensPage.class).preencherInformacoes(string, string2, string3);
	}

	@Quando("clicar em cancel")
	public void clicarEmCancel() {
		Na(CancelandoCompraPage.class).acionarBotaoCancel();
	}

	@Entao("o sistema apresenta a tela de produtos novamente")
	public void oSistemaApresentaATelaDeProdutosNovamente() {
		assertEquals("PRODUCTS", driver.findElement(By.xpath("//span[@class='title']")).getText());
	}

}
