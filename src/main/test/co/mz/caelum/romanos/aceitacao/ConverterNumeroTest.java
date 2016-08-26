package co.mz.caelum.romanos.aceitacao;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ConverterNumeroTest {

	public static String BASE_URL = "http://localhost:8080/NRomanos";
	private static WebDriver driver;
	private ConverterNumeroPage converterNumero;
	
	@BeforeClass
	public static void abreBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	
	@Before
	public void setUp() {
		converterNumero = new ConverterNumeroPage(driver);
	}
	
	@AfterClass
	public static void fechaBrowser() {
		driver.close();
	}
	
	@Test
	public void deveConverterNumero()
	{
		converterNumero.abreTela();
		converterNumero.adicionaValores("X");
		converterNumero.resultadoDeveSer(10.0);
	}
	
}
