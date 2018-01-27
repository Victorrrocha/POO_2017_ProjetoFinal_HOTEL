package esquema;

public abstract class Funcionario {
	private String Nome;
	private int senha; 
	private double Salario = 0;
	void pagarSalário()
	{
		this.setSalario(960);
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario += salario;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public void descontar(float desconto)
	{
		if(this.getSalario() > desconto)
		{
			this.setSalario(-desconto);
		}
	}
}
