package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pom {
	private WebDriver driver;

	public Pom(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver chromeConnection() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public void visitarPagina(String url) {
		driver.get(url);
	}

	public void clic(By localizador) {
		driver.findElement(localizador).click();
	}
	
	public String obtenerTexto(WebElement element) {
		return element.getText();
	}
	
	public String obtenerTexto(By localizador) {
		return driver.findElement(localizador).getText();
	}

	public Boolean elementoVisible(By localizador) {
		try {
			return driver.findElement(localizador).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public void esperaImplicita(int number) {
		driver.manage().timeouts().implicitlyWait(number, TimeUnit.SECONDS);
	}

	public void esperar(int seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}
}
