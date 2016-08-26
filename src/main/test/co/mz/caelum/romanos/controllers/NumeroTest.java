package co.mz.caelum.romanos.controllers;

import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.Assert;

import co.mz.caelum.romanos.builder.NumeroBuilder;
import co.mz.caelum.romanos.model.Numero;
import co.mz.caelum.romanos.model.NumeroRomano;



public class NumeroTest 
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
		Numero numeroRomano = builder.comValor("MMMCMXCVIIV").constroi();
		numeroRomano.converteParaDecimal();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoPermitirMaisQTresLetrasIguaisSeguidas()
	{
		Numero numeroRomano = builder.comValor("IIII").constroi();
		((NumeroRomano)numeroRomano).isMaisQTresLetrasSeguidas();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoDevePermitirCaracterInvalido()
	{
		Numero numeroRomano = builder.comValor("XX3").constroi();
		((NumeroRomano)numeroRomano).isCaracterValido();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoPodeDuplicarLetraV()
	{
		Numero numeroRomano = builder.comValor("VV").constroi();
		((NumeroRomano)numeroRomano).isDuplicado();
	}
	
}
