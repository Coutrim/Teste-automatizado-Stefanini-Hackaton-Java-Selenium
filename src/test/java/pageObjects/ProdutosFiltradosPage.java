package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutosFiltradosPage {
	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement seletorDeFiltros;

	@FindBy(xpath = "//option[@value='lohi']")
	private WebElement filtroLowToHigh;

	public void abrirFiltros() {
		seletorDeFiltros.click();
	}

	public void acionarFiltro() {
		filtroLowToHigh.click();
	}
}
