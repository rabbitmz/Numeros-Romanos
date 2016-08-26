package co.mz.caelum.romanos;

import co.mz.caelum.romanos.model.Numero;
import co.mz.caelum.romanos.model.NumeroRomano;

public class NumeroFactory 
{
	public Numero getNumero(String numero)
	{
		if(numero.equals(TipoNumero.ROMANO))
		{
			return new NumeroRomano();
		}
		return null;
	}
	
}
