package rooms;

public abstract class Quarto {
	String pessoa;
	Quarto(){
		verificarDisponiveis();
		System.out.printf("\n");
	}
	protected static String numero[] = new String[100];
	abstract void verificarDisponiveis();
	abstract double diaria(int dias);
	String ocupando(String nome,int quarto,int dias) {
		if(Quarto.numero[quarto]==null) {
			Quarto.numero[quarto] = nome;
			System.out.println("Disponinel");
			System.out.println("Valor : R$ "+ diaria(dias));
			} else System.err.println("Nao Disponivel");
		return nome;
	}
	
}
