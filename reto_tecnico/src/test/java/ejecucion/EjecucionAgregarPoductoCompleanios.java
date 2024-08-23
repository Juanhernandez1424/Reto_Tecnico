package ejecucion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import casosDePrueba.AgregarProductoCumpleanios;

public class EjecucionAgregarPoductoCompleanios {
	
	private WebDriver driver;
	
	AgregarProductoCumpleanios agregarProductoCumpleanios;
	String url = "https://www.floristeriamundoflor.com/";
	
	@Before
	public void setUp() throws Exception {
		agregarProductoCumpleanios = new AgregarProductoCumpleanios(driver);
		driver = agregarProductoCumpleanios.chromeConnection();
		agregarProductoCumpleanios.visitarPagina(url);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		agregarProductoCumpleanios.agregarYEliminarProducto();
	}

}
