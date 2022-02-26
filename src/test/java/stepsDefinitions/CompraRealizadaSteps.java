package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CompraRealizadaPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class CompraRealizadaSteps {
	@Quando("clicar em finish")
	public void clicarEmFinish() {
	    Na(CompraRealizadaPage.class).acionarBotaoFinish();
	}

	@Entao("o sistema exibe que a compra foi realizada")
	public void oSistemaExibeQueACompraFoiRealizada() {
	    assertEquals("CHECKOUT: COMPLETE!", driver.findElement(By.xpath("//span[@class='title']")).getText());
	}


}
