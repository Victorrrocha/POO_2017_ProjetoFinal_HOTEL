package rooms;

public class Suite extends Quarto{
	private double TpD = 120.00;
	double diaria(int dias) {
		return TpD*dias;
	}
	void verificarDisponiveis() {
		System.out.println("- suites disponiveis");
		for(int i = 0;i<25;i++) {
			if(numero[i] == null)
				System.out.printf("  %d ",i);
			if(i> 0 && i%10==0)
				System.out.printf("\n");
		}
		System.out.printf("\n");
	}
}
