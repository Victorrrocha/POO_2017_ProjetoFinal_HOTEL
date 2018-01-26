package esquema;

public class ServicoDeQuarto extends Funcionario implements Entram {
	
	private int SenhaQuarto;
	

	@Override
	public boolean antenticam(int senha) {
		if(this.getSenhaQuarto() == senha)
		{
			System.out.println("Acesso Garantido");
			return true;
		}
		else
		{
			System.out.println("Dado Incorreto");
			return false;
		}
			
	}

	public int getSenhaQuarto() {
		return SenhaQuarto;
	}

}
