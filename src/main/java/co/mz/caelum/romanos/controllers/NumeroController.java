package co.mz.caelum.romanos.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import co.mz.caelum.romanos.model.NumeroRomano;

@Controller
public class NumeroController {

	@RequestMapping("/converter")
	public String formConverter() {
		return "converterNumero";
	}

	@RequestMapping("/enviarDados")
	public String converteValor(@Valid NumeroRomano numero, BindingResult result, HttpSession httpsession) {
		
		if (result.hasFieldErrors("valor")) {
			return "converterNumero";
		}
		
		try
		{
			double resultado = numero.converteParaDecimal();
			httpsession.setAttribute("resultado", resultado);	
		}
		catch (IllegalArgumentException e) {
			// setar o valor da mensagem na tela de forma que possamos personalizar 
			//Deixamos de usar as mensagens do hibernate validator neste ponto
			System.out.println(e.getMessage());
			httpsession.setAttribute("mensagemDeErro", e.getMessage());
		}
		

		return "redirect:resultado";
	}

	@RequestMapping("/resultado")
	public String mostraResultado() {
		return "resultado";
	}

}
