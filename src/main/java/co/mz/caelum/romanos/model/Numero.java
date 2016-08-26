package co.mz.caelum.romanos.model;

public interface Numero 
{
	double maximo();
	double minimo();
	String valor(); 
	void atribuiValor(Object valor);
	double converteParaDecimal();
}
