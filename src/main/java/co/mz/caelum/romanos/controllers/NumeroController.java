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
		double resultado = numero.converteParaDecimal();
		httpsession.setAttribute("resultado", resultado);

		return "redirect:resultado";
	}

	@RequestMapping("/resultado")
	public String mostraResultado() {
		return "resultado";
	}

}
