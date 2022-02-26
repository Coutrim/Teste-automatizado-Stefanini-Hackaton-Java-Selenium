package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;
import pageObjects.ProdutosFiltradosPage;

public class ProdutosFiltradosSteps {
	@Dado("que eu esteja logado")
	public void queEuEstejaLogado() {
		Na(LoginPage.class).realizarLogin("standard_user", "secret_sauce");
	}

	@Quando("eu clicar no seletor de filtros")
	public void euClicarNoSeletorDeFiltros() {
		Na(ProdutosFiltradosPage.class).abrirFiltros();
	}

	@Quando("selecionar o filtro desejado")
	public void selecionarOFiltroDesejado() {
		Na(ProdutosFiltradosPage.class).acionarFiltro();
	}

	@Entao("o sistema exibe os produtos com o filtro desejado")
	public void oSistemaExibeOsProdutosComOFiltroDesejado() {
		assertEquals("Price (low to high)",
				driver.findElement(By.xpath("//option[contains(text(),'Price (low to high)')]")).getText());

	}
}
