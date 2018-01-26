package esquema;

public class Atendente extends Funcionario implements ValidarFuncionario{

	@Override
	public boolean validar(int senha) {
		if(this.getSenha() == senha)
			return true;
		else
			return false;
	}
}
