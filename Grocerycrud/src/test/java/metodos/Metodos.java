package metodos;


import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import web.DriversFactory;

public class Metodos extends DriversFactory {

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void esperarElemento(By elemento) {
		WebElement element = new WebDriverWait(driver,Duration.ofSeconds(20))
				.until(ExpectedConditions.elementToBeClickable(elemento));
		
	}
	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(textoEsperado));
}
	
	public void subimt(By elemento) {
		driver.findElement(null).submit();
	}
}
