package esquema;

public abstract class Funcionario {
	private String Nome;
	private int senha; 
	private double Salario = 960;
	 
	
	boolean pagarSalário(float Salario)
	{
		if(Salario > 0)
		{
			this.setSalario(Salario);
			return true;
		}
		else
			return false;
		
	}
	
	/*public Funcionario(String nome, int senha) {
		this.setNome(nome);
		this.setSenha(senha);
	}*/
	
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
	
}
