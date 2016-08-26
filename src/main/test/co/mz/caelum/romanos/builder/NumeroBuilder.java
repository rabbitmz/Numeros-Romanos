package co.mz.caelum.romanos.builder;

import co.mz.caelum.romanos.model.Numero;
import co.mz.caelum.romanos.model.NumeroRomano;

public class NumeroBuilder {

	private String valor; 
	
	public NumeroBuilder comValor(String valor)
	{
		this.valor = valor;
		return this;
	}
	
	public Numero constroi()
	{
		return new NumeroRomano(valor);
	}
}
