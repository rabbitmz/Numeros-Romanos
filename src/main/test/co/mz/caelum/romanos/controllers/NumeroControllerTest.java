package co.mz.caelum.romanos.controllers;

import org.junit.Test;
import org.testng.Assert;

import co.mz.caelum.romanos.NumeroFactory;
import co.mz.caelum.romanos.model.Numero;



public class NumeroControllerTest 
{
	@Test
	public void deveConverterRomParaDec()
	{
		Numero numeroRomano = new NumeroFactory().getNumero("ROMANO");
		numeroRomano.atribuiValor("V");
		double converteParaDecimal = numeroRomano.converteParaDecimal();
		Assert.assertEquals(converteParaDecimal, 5.0);
	}
	
}
