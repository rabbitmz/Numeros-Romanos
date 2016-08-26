package co.mz.caelum.romanos.model;

import java.util.Hashtable;

public class NumeroRomano implements Numero {
	
	private static final int _MAXIMO = 5000;
	private static final int _MINIMO = 1;
	private String valor;
	
	private Hashtable<Character, Integer> correspondentes;
	
	
	
	public NumeroRomano(String valor) {
		
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public double maximo() {
		return _MAXIMO;
	}

	@Override
	public double minimo() {
		return _MINIMO;
	}

	@Override
	public String valor() {
		return this.valor;
	}

	@Override
	public void atribuiValor(Object valor) {
		this.valor = valor.toString();

	}

	@Override
	public double converteParaDecimal() {
		inicializaCorrespondentes();

		int valorDecimal = 0;
		int anterior = 0;
		int temporario;

		for (int i = this.valor.length() - 1; i >= 0; i--) {
			temporario = correspondentes.get(valor.charAt(i));
			if (temporario < anterior)
				valorDecimal -= temporario;
			else
				valorDecimal += temporario;
			anterior = temporario;
		}

		return valorDecimal;
	}

	private void inicializaCorrespondentes() {
		correspondentes = new Hashtable<>();
		correspondentes.put('I', 1);
		correspondentes.put('X', 10);
		correspondentes.put('C', 100);
		correspondentes.put('M', 1000);
		correspondentes.put('V', 5);
		correspondentes.put('L', 50);
		correspondentes.put('D', 500);
	}
}
