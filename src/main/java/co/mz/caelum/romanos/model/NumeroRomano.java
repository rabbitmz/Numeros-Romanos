package co.mz.caelum.romanos.model;

import java.util.Hashtable;

public class NumeroRomano implements Numero {
	private String valor;

	@Override
	public double maximo() {
		// TODO Auto-generated method stub
		return 5000;
	}

	@Override
	public double minimo() {
		// TODO Auto-generated method stub
		return 1;
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
		Hashtable<Character, Integer> correspondentes = new Hashtable<>();
		correspondentes.put('I', 1);
		correspondentes.put('X', 10);
		correspondentes.put('C', 100);
		correspondentes.put('M', 1000);
		correspondentes.put('V', 5);
		correspondentes.put('L', 50);
		correspondentes.put('D', 500);

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
}
