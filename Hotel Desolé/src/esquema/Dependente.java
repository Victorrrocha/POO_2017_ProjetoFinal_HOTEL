package esquema;

public class Dependente extends Cliente implements Entram{
	
	public Dependente(String nome, int NumeroDoQuarto, int senhaDoQuarto){
		this.setNome(nome);
		this.setNumeroDoQuarto(NumeroDoQuarto);
		this.setSenhaQuarto(senhaDoQuarto);
	}


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
}