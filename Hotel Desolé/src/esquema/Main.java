package esquema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Sistema sistema = new Sistema();
		Scanner input = new Scanner(System.in);
		int option = 1;
		
		while(option != 0)
		{
			System.out.println("HOTEL DESOLÈ\n\nSelecione a ação desejada: \n");
			System.out.println("[1] Cadastrar funcionário\n[2] Fazer Check-in\n[3] Fazer Check-out\n[4] Clientes Cadastrados\n[5] Funcionários Cadastrados\n");
			
			option = input.nextInt();
			
			switch(option)
			{
			case 1:
				System.out.println("[1] Atendente\n[2] Gerente\n[3] Serviço de Quarto");
				
				int op = input.nextInt();
				input.nextLine();
				System.out.printf("Nome: \n");
				String nome = input.nextLine();
				System.out.printf("Senha: \n");
				int senha = input.nextInt();
				input.nextLine();
				
				switch(op)
				{
				case 1:
					Atendente a  = new Atendente();
					a.setSenha(senha);
					a.setNome(nome);
					sistema.cadastrarAtendente(a);
					System.out.println("Cadastro realizado com sucesso!\n");
					break;
					
				case 2:
					Gerente b = new Gerente();
					b.setNome(nome);
					b.setSenha(senha);
					sistema.cadastrarGerente(b);
					System.out.println("Cadastro realizado com sucesso!\n");
					break;
					
				case 3:
					ServicoDeQuarto c = new ServicoDeQuarto();
					c.setNome(nome);
					c.setSenha(senha);
					sistema.cadastrarServiço(c);
					System.out.println("Cadastro realizado com sucesso!\n");
					break;
	 			}
				break;
			
			case 2:
				///PRECISO VALIDAR FUNCIONARIO
				System.out.println("Digite sua senha de Funcionário");
				int validate = input.nextInt();
				if(sistema.validarSenha(validate) == false)
				{
					System.out.println("Acesso Negado");
					break;
				}
				else
					System.out.println("Acesso Garantido");
				Titular temp = new Titular();
				input.nextLine();
				System.out.printf("Nome do Titular: \n");
				String nometit = input.nextLine();
				System.out.printf("Senha para adicionar dispesas: \n");
				int senhaDispezas = input.nextInt();
				input.nextLine();
				System.out.println("Deseja uma Suite (2 camas) ou um Simples (1 cama)?");
				System.out.println("1 - Suite\n2 - Simples");
				int opQ = input.nextInt();
				switch(opQ)
				{
				case 1:
					System.out.println("Escolha Dentre as Suites Disponiveis:");
					sistema.gerarSuitesDisponiveis();
					int opSuite = input.nextInt();
					input.nextLine();
					temp.setNumeroDoQuarto(opSuite);
					temp.setNome(nometit);
					temp.setSenhaCartão(senhaDispezas);
					sistema.cadastrarTitular(temp);
					break;
				case 2:
					System.out.println("Escolha Dentre os Quartos Disponiveis:");
					sistema.gerarQuartosSimplesDisponiveis();
					int opQuarto = input.nextInt();
					input.nextLine();
					temp.setNumeroDoQuarto(opQuarto);
					temp.setNome(nometit);
					temp.setSenhaCartão(senhaDispezas);
					sistema.cadastrarTitular(temp);
					break;
				}
				break;
			case 4:
				System.out.println("Digite sua senha de Funcionário");
				int validateAgain = input.nextInt();
				if(sistema.validarSenha(validateAgain) == false)
				{
					System.out.println("Acesso Negado");
					break;
				}
				else
					System.out.println("Acesso Garantido");
				sistema.mostraClientes();
				break;
			case 5:
				System.out.println("Digite sua senha de Funcionário");
				int validateDeNovo = input.nextInt();
				if(sistema.validarSenha(validateDeNovo) == false)
				{
					System.out.println("Acesso Negado");
					break;
				}
				else
					System.out.println("Acesso Garantido");
				sistema.mostraFuncionarios();
				break;
			}
			System.out.println("\nDeseja realizar outro processo? (1 - SIM/0 - NÃO)\n");
			option = input.nextInt();
		}
		
	}
}
