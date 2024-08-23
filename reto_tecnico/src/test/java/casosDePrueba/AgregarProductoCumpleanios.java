package casosDePrueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import POM.Pom;

public class AgregarProductoCumpleanios extends Pom {
	public AgregarProductoCumpleanios(WebDriver driver) {
		super(driver);
	}
	
	// Localizadores
	By listaCategorias = By.xpath("//*[@id=\"primary-menu\"]");
	By linkCategoriaCumpleanios = By.xpath("//*[@id=\"primary-menu\"]/li[4]");
	By productoParaAgregar = By.xpath("//*[@id=\"content\"]/div[2]/div/div[3]/div/div[1]/figure/a/img");
	By buttonAgregarAlCarrito = By.xpath("//button[@class=\"single_add_to_cart_button button alt\"]");
	By productoAgregado = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div/div/div/div[2]/form/div/table/tbody/tr[1]");
	By btnEliminarProducto = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div/div/div/div[2]/form/div/table/tbody/tr[1]/td[6]/a");
	By textoCarritoVacio = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div/div/div/p[1]");
	
	String validarTexto = "Tu carrito está vacío.";
	
	// Caso de prueba
	public void agregarYEliminarProducto() throws InterruptedException {
		esperaImplicita(10);
		if(elementoVisible(listaCategorias)) {
			clic(linkCategoriaCumpleanios);
			esperar(2000);
		}
		
		if(elementoVisible(productoParaAgregar)) {
			clic(productoParaAgregar);
			esperar(2000);
		}
		
		if(elementoVisible(buttonAgregarAlCarrito)) {
			clic(buttonAgregarAlCarrito);
			esperar(2000);
		}
		
		if(elementoVisible(productoAgregado)) {
			clic(btnEliminarProducto);
			esperar(2000);
			String texto = obtenerTexto(textoCarritoVacio);
			if(texto == validarTexto) {
				System.out.println("Producto eliminado con éxito");
			} else {
				System.out.println("No se ha eliminado el producto");
			}
		}
	}
}
