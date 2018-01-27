package esquema;
import java.util.ArrayList;

public class Sistema{
	
	///------ FUNCIONÁRIOS ------////
	private ArrayList<Atendente> atendentes = new ArrayList<>();
	private ArrayList<Gerente> gerentes = new ArrayList<>();
	private ArrayList<ServicoDeQuarto> serviços = new ArrayList<>();
	
	///------ QUARTOS ----------////
	
	Simples simples[] = new Simples[76];
	Suite suite[] = new Suite[26];
	
	/*private ArrayList<Simples> simples = new ArrayList<>();
	private ArrayList<Suite> suite = new ArrayList<>();*/

	///------ CLIENTE --------///
	private ArrayList<Titular> titular = new ArrayList<>();
	
	///---CADASTRO DE FUNCIONÁRIO---///
	public void cadastrarAtendente(Atendente atendente)
	{
		atendentes.add(atendente);
	}

	public void cadastrarGerente(Gerente gerente)
	{
		gerentes.add(gerente);
	}
	
	public void cadastrarServiço(ServicoDeQuarto serviço)
	{
		serviços.add(serviço);
	}
	///---FIM CADASTRO DE FUNCIONÁRIO---///
	
	
	///---CHECK-IN DE CLIENTE--///
	public void cadastrarTitular(Titular tit)
	{
		titular.add(tit);
		
	}
	public void gerarQuartosSimplesDisponiveis()
	{
		for(int i = 1; i <= 75; i++)
		{
			simples[i] = new Simples();
			if(simples[i].disponibilidade == true)
			{
				System.out.printf("%d\t", i*10);
				if(i%10 == 0)
					System.out.println();
			}
			
		}
	}
	public void gerarSuitesDisponiveis()
	{
		for(int i = 1; i <= 25; i++)
		{
			suite[i] = new Suite();
			if(suite[i].disponibilidade == true)
			{
				System.out.printf("S - %d\t", i*10);
				if(i%10 == 0)
					System.out.println();
			}
		}
	}
	///VALIDAÇÃO DE ATENDENTE
	public boolean validarSenhaAt(int senha)
	{
		for(Atendente at : atendentes)
		{
			if(at.getSenha() == senha)
			{
				return true;
			}
		}
		return false;
	}
	
	///MOSTRAR CLIENTES CADASTRADOS:
	public void mostraClientes()
	{
		System.out.println("CLIENTE CADASTRADOS\n");
		System.out.println("NOME - QUARTO\n");
		for(Titular t : titular)
		{
			System.out.printf("%s\t%d\n", t.getNome(), t.getNumeroDoQuarto());
		}
	}
	
	public void mostraFuncionarios()
	{
		System.out.println("FUNCIONÁRIOS NO SISTEMA\n");
		System.out.println("NOME\n");
		for(Funcionario at : atendentes)
		{
			System.out.printf("%s\t\n", at.getNome());
		}
		for(Funcionario gr : gerentes)
		{
			System.out.printf("%s\t\n", gr.getNome());
		}
		for(Funcionario sv : serviços)
		{
			System.out.printf("%s\t\n", sv.getNome());
		}
	}
}
