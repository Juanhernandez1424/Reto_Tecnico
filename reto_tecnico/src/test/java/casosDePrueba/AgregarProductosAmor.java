package casosDePrueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import POM.Pom;

public class AgregarProductosAmor extends Pom {
	public AgregarProductosAmor(WebDriver driver) {
		super(driver);
	}
	
	// Localizadores
	By listaCategorias = By.xpath("//*[@id=\"primary-menu\"]");
	By linkCategoriaAmor = By.xpath("//*[@id=\"primary-menu\"]/li[3]");
	By primerProducto = By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/div");
	By linkSeguirComprando = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div/div/div/div[1]/div/a");
	By segundoProducto = By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div");
	By buttonAgregarAlCarrito = By.xpath("//button[@class=\"single_add_to_cart_button button alt\"]");
	By primerProductoAgregado = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div/div/div/div[2]/form/div/table/tbody/tr[1]");
	By segundoProdcutoAgregado = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div/div/div/div[2]/form/div/table/tbody/tr[2]");
	
	// Caso de prueba
	public void CategoriaAmor() throws InterruptedException {
		esperaImplicita(10);
		if(elementoVisible(listaCategorias)) {
			clic(linkCategoriaAmor);
			esperar(2000);
		}
		
		if(elementoVisible(primerProducto)) {
			clic(primerProducto);
			esperar(2000);
		}
		
		if(elementoVisible(buttonAgregarAlCarrito)) {
			clic(buttonAgregarAlCarrito);
			esperar(2000);
		}
		
		esperaImplicita(10);
		if(elementoVisible(linkSeguirComprando)) {
			clic(linkSeguirComprando);
			esperar(2000);
			clic(linkCategoriaAmor);
			esperar(2000);
			clic(segundoProducto);
			esperar(2000);
		}
		
		if(elementoVisible(buttonAgregarAlCarrito)) {
			clic(buttonAgregarAlCarrito);
			esperar(2000);
		}
		
		elementoVisible(primerProducto);
		elementoVisible(segundoProdcutoAgregado);
		esperar(2000);
	}
}
