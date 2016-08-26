package co.mz.caelum.romanos.controllers;

import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.Assert;

import co.mz.caelum.romanos.builder.NumeroBuilder;
import co.mz.caelum.romanos.model.Numero;



public class NumeroControllerTest 
{
	private static NumeroBuilder builder;
	
	@BeforeClass
	public static void setUp()
	{
		builder = new NumeroBuilder();
	}
	
	
	@Test
	public void deveConverterRomParaDec()
	{
		Numero numeroRomano = builder.comValor("V").constroi();
		double converteParaDecimal = numeroRomano.converteParaDecimal();
		Assert.assertEquals(converteParaDecimal, 5.0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoDeveCriarNumerosSemValor()
	{
		 builder.comValor(null).constroi();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoDeveConverterNumeroMaiorMaximo()
	{
		Numero numeroRomano = builder.comValor("IVXLCDMM").constroi();
		numeroRomano.converteParaDecimal();
	}
	
	
	
	
}
