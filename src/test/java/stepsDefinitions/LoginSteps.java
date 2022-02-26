package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {

	@Dado("que eu queira fazer login")
	public void queEuQueiraFazerLogin() {

	}

	@Quando("eu preencher o campo username {string}")
	public void euPreencherOCampoUsername(String usuario) {
		Na(LoginPage.class).informarCampoUserName(usuario);
	}

	@Quando("preencher o campo password {string}")
	public void preencherOCampoPassword(String senha) {
		Na(LoginPage.class).informarCampoPassWord(senha);
	}

	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
		Na(LoginPage.class).acionarBotaoLogin();
	}

	@Entao("o sistema exibe a tela de login")
	public void oSistemaExibeATelaDeLogin() {
		assertEquals("PRODUCTS", driver.findElement(By.xpath("//span[@class='title']")).getText());
	}

}
