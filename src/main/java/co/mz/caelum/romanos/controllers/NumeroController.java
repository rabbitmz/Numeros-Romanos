package co.mz.caelum.romanos.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import co.mz.caelum.romanos.model.NumeroRomano;

@Controller
public class NumeroController 
{
	
	@RequestMapping("/converter")
	public String formConverter()
	{
		return "converterNumero";
	}
	
	@RequestMapping("/enviarDados")
	public String converteValor(NumeroRomano numero, HttpSession httpsession)
	{				
		double resultado = numero.converteParaDecimal();
		httpsession.setAttribute("resultado", resultado);
		
		return "redirect:resultado";
	}
	
	@RequestMapping("/resultado")
	public String mostraResultado()
	{
		return "resultado";
	}
	
	
	
	
}
