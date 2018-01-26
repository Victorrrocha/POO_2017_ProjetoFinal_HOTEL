package esquema;

public class Gerente extends Funcionario implements ValidarFuncionario{
	
	
	@Override
	public boolean validar(int senha) {
		if(this.getSenha() == senha)
			return true;
		else
			return false;
	}
}
