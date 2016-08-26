package co.mz.caelum.romanos.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import co.mz.caelum.romanos.model.NumeroRomano;

@Controller
public class NumeroController {

	@RequestMapping("/")
	public String inicio() {
		return "index";
	}
	
	@RequestMapping("/converter")
	public String formConverter() {
		return "converterNumero";
	}

	@RequestMapping("/enviarDados")
	public String converteValor(@Valid NumeroRomano numero, BindingResult result, HttpSession httpsession) {
		try {
			if (result.hasFieldErrors("valor")) {
				return "converterNumero";
			}
			double resultado = numero.converteParaDecimal();
			httpsession.setAttribute("resultado", resultado);

		} catch (Exception e) {
			// setar o valor da mensagem na tela de forma que possamos
			// personalizar
			// Deixamos de usar as mensagens do hibernate validator neste ponto
			System.out.println(e.getMessage());
			httpsession.setAttribute("resultado", e.getMessage());
		}

		return "redirect:resultado";
	}

	@RequestMapping("/resultado")
	public String mostraResultado() {
		return "resultado";
	}

}
