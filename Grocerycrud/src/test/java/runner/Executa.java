package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import web.DriversFactory;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue= "teste",
		tags = "@Teste1",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty","html:target/cucumber-report.html"},
	    snippets = SnippetType.CAMELCASE
		
		)

public class Executa extends DriversFactory {
	@BeforeClass
	public static void abrirNavegador() {
		
		String url="https://www.grocerycrud.com/v1.x/demo/bootstrap_theme";
		String navegador = "Chrome";
		
		if(navegador.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(navegador.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}else{
			System.out.println("Para abrir navegador digite --Chrome ou Firefox---");
			
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			}

	@AfterClass
	public static void fecharNavegador() {
		driver.quit();

	}{
	System.out.println("------Teste finalizado--------");
	}
}
