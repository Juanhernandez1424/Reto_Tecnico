package ejecucion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v127.storage.model.AttributionReportingAggregatableResult;

import casosDePrueba.AgregarProductosAmor;

public class EjecucionAgregarProductosAmor {

	private WebDriver driver;
	
	AgregarProductosAmor agregarProductosAmor;
	String url = "https://www.floristeriamundoflor.com/";
	
	@Before
	public void setUp() throws Exception {
		agregarProductosAmor = new AgregarProductosAmor(driver);
		driver = agregarProductosAmor.chromeConnection();
		agregarProductosAmor.visitarPagina(url);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		agregarProductosAmor.CategoriaAmor();
	}

}
