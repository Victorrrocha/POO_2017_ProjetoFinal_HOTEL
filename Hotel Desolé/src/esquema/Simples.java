package esquema;

public class Simples extends Quarto{
	private double TpD = 80.00;
	double diaria(int dias) {
		return TpD*dias;
	}
	/*public void verificarDisponiveis() {
		System.out.println("- quartos simples disponiveis");
		for(int i = 25;i<100;i++) {
			if(numero[i] == null)
				System.out.printf("  %d ",i);
			if(i%10==0)
				System.out.printf("\n");
		}
		System.out.printf("\n");
	}*/
}
