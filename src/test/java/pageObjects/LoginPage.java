package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy (name = "user-name")
	private WebElement campoUserName;
	
	@FindBy (name = "password")
	private WebElement campoPassWord;
	
	@FindBy (name = "login-button")
	private WebElement botaoLogin;
	
	public void informarCampoUserName(String usuario) {
		campoUserName.sendKeys(usuario);
	}
	
	public void informarCampoPassWord(String senha) {
		campoPassWord.sendKeys(senha);
	}
	
	public void acionarBotaoLogin() {
		botaoLogin.click();
	}
	
	public void realizarLogin(String usuario, String senha) {
		campoUserName.sendKeys(usuario);
		campoPassWord.sendKeys(senha);
		botaoLogin.click();
	}
}
