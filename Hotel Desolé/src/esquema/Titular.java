package esquema;

public class Titular extends Cliente implements Entram{

	private int senhaCart�o;
	float saldo = 0;
	
	public Titular(String nome, int senha, int NumeroDoQuarto, int senhaDoQuarto){
		this.setNome(nome);
		this.senhaCart�o = senha;
		this.setNumeroDoQuarto(NumeroDoQuarto);
		this.setSenhaQuarto(senhaDoQuarto);
	}

	public void adicionarDispesas(int senha, float valor)
	{
		if(this.senhaCart�o == senha && valor > 0)
		{
			setSaldo(valor);
			System.out.println("Dispesas Adicionadas com sucesso!");
		}
		else
			System.err.println("SENHA OU VALOR INVALIDO");
		
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float valor) {
		this.saldo += valor;
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
			System.err.println("Dado Incorreto");
			return false;
		}
			
	}
	
}
