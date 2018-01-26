package esquema;

public abstract class Cliente implements Entram{
	
	private String nome;
	private String CPF;
	private String telefone;
	private String cart�o; 
	private int senhaQuarto;
	private int NumeroDoQuarto;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroDoQuarto() {
		return NumeroDoQuarto;
	}

	public void setNumeroDoQuarto(int numeroDoQuarto) {
		this.NumeroDoQuarto = numeroDoQuarto;
	}

	public int getSenhaQuarto() {
		return senhaQuarto;
	}

	public void setSenhaQuarto(int senhaQuarto) {
		this.senhaQuarto = senhaQuarto;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCart�o() {
		return cart�o;
	}

	public void setCart�o(String cart�o) {
		this.cart�o = cart�o;
	}
}
