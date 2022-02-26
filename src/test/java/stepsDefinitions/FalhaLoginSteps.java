package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class FalhaLoginSteps {
	@Dado("que eu esteja tentando acessar o sistema")
	public void queEuEstejaTentandoAcessarOSistema() {

	}

	@Quando("eu preencher o campo usuario {string}")
	public void euPreencherOCampoUsuario(String string) {
		Na(LoginPage.class).informarCampoUserName(string);
	}

	@Quando("preencher o campo senha {string}")
	public void preencherOCampoSenha(String string) {
		Na(LoginPage.class).informarCampoPassWord(string);
	}

	@E("^clicar em login$")
	public void clicarEmLogin() {
		Na(LoginPage.class).acionarBotaoLogin();
	}

	@Entao("o sistema exibe mensagem de erro de login")
	public void oSistemaExibeMensagemDeErroDeLogin() {
		assertEquals("Epic sadface: Username and password do not match any user in this service", driver.findElement(By
				.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match any user in this service')]"))
				.getText());
	}

}
