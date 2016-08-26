package co.mz.caelum.romanos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NumeroController 
{
	
	@RequestMapping("/converter")
	public String formConverter()
	{
		return "converterNumero";
	}
	
	
}
