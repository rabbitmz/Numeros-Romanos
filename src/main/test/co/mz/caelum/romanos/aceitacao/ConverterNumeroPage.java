package co.mz.caelum.romanos.aceitacao;


import org.openqa.selenium.WebDriver;

public class ConverterNumeroPage 
{

	private static final String BASE_URL = "http://localhost:8080";
	private final WebDriver driver;
	
	public ConverterNumeroPage(WebDriver driver)
	{
		this.driver = driver; 
	}
	
	public void abreTela() {
		driver.get(BASE_URL + "/converterNumero");
	}
	
	
	public void adicionaValores(String valor)
	{
		
	}
	public void resultadoDeveSer(double resultadoEsperado)
	{
		
	}
}
