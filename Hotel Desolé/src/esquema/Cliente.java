package esquema;

public abstract class Cliente implements Entram{
	
	private String nome;
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
}
