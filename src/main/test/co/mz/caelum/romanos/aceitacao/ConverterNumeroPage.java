package co.mz.caelum.romanos.aceitacao;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConverterNumeroPage 
{

	private static final String BASE_URL = "http://localhost:8080";
	private final WebDriver driver;
	
	public ConverterNumeroPage(WebDriver driver)
	{
		this.driver = driver; 
	}
	
	public void abreTela() {
		driver.get(BASE_URL + "/converter");
	}
	public WebElement pegaForm()
	{
		return driver.findElement(By.id("cnrvtRomano"));
	}
	
	
	public void adicionaValores(String valor)
	{
		WebElement form = pegaForm();
		form.findElement(By.name("numRom")).sendKeys(valor);
		form.submit();
	}
	public void resultadoDeveSer(double resultadoEsperado)
	{
		
	}

	public void contemValor(String string) 
	{
		
	}
	
}
