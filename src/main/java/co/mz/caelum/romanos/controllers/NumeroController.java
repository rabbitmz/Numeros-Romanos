package co.mz.caelum.romanos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import co.mz.caelum.romanos.NumeroFactory;
import co.mz.caelum.romanos.model.Numero;

@Controller
public class NumeroController 
{
	
	@RequestMapping("/converter")
	public String formConverter()
	{
		return "converterNumero";
	}
	
	@RequestMapping("/enviarDados")
	public void converteValor(String valor)
	{
		Numero numeroRomano = new NumeroFactory().getNumero("ROMANO");
		numeroRomano.atribuiValor(valor);
		double converteParaDecimal = numeroRomano.converteParaDecimal();
	}
}
