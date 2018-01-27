package esquema;

public abstract class Quarto {
	
	int numero;
	boolean disponibilidade = true;
	
	public boolean verificarDisponibilidade(Quarto quart)
	{
		if(quart.disponibilidade == true)
			return true;
		else 
			return false;
	}
	
}
