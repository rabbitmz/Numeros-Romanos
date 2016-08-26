package co.mz.caelum.romanos.controllers;

import org.junit.Test;
import org.testng.Assert;

import co.mz.caelum.romanos.model.NumeroRomano;



public class NumeroControllerTest 
{
	@Test
	public void deveConverterRomParaDec()
	{
		NumeroRomano numero = new NumeroRomano();
		numero.atribuiValor("V");
		double converteParaDecimal = numero.converteParaDecimal();
		Assert.assertEquals(converteParaDecimal, 5);
	}
	
}
