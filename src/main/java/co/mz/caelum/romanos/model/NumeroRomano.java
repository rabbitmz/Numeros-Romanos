package co.mz.caelum.romanos.model;

import java.util.Hashtable;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class NumeroRomano implements Numero {
	
	private static final int _MAXIMO = 3999;
	private static final int _MINIMO = 1;
	
	@NotNull(message="Valor nao pode estar nulo")
	@Size(min = 1, max = 15, message="Valor deve ter pelo menos um digito [I,X,C,M,V,L,D]")
	private String valor;
	
	private Hashtable<Character, Integer> correspondentes;
	
	public NumeroRomano() {
	}
	
	public NumeroRomano(String valor) 
	{
		if(valor==null)
		{
			throw  new IllegalArgumentException();
		}
		this.valor = valor.toUpperCase();
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
		
		//Tratar casos especiais 
		isMaiorQMaximo(valorDecimal);

		return valorDecimal;
	}
	
	public void isMaiorQMaximo(int valorDecimal)
	{		
		if(valorDecimal>_MAXIMO)
		{
			throw new IllegalArgumentException("Valor Nao pode ser convertido");
		}
	}
	public void isMaisQTresLetrasSeguidas()
	{
		if(this.valor.contains("IIII") || this.valor.contains("VVVV") || this.valor.contains("XXXX") || this.valor.contains("LLLL") || this.valor.contains("CCCC") || this.valor.contains("DDDD") || this.valor.contains("MMMM"))
		{
			throw new IllegalArgumentException("Numero romano nao pode ter 4 letras repetidas");
		}
		
	}

	private void inicializaCorrespondentes() {
		correspondentes = new Hashtable<>();
		correspondentes.put('I', 1);
		correspondentes.put('V', 5);
		correspondentes.put('X', 10);
		correspondentes.put('L', 50);
		correspondentes.put('C', 100);
		correspondentes.put('D', 500);
		correspondentes.put('M', 1000);
		
	}
}
