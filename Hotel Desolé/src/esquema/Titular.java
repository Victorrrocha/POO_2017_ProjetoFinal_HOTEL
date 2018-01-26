package esquema;

public class Titular extends Cliente implements Entram{

	private int senhaCart�o;
	float saldo = 0;

	
	
	public void adicionarDispesas(int senha, float valor)
	{
		if(this.getSenhaCart�o() == senha && valor > 0)
		{
			setSaldo(valor);
			System.out.println("Dispesas Adicionadas com sucesso!");
		}
		else
			System.out.println("SENHA OU VALOR INV�LIDO");
		
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
			System.out.println("Dado Incorreto");
			return false;
		}
			
	}

	public int getSenhaCart�o() {
		return senhaCart�o;
	}

	public void setSenhaCart�o(int senhaDisp) {
		this.senhaCart�o = senhaDisp;
	}
	
}
