import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		Scanner Ler = new Scanner(System.in);
		Medicos medico= new Medicos(" "," "," ");
		PessoaFisica pessoafisica = new PessoaFisica (" "," "," ", ' '," "," "," "); 
		Funcionario funcionario  = new Funcionario ("","","");
		Convenios convenio = new Convenios ("","","","");
		EspecialidadeMedica	espeMedic = new EspecialidadeMedica (" "," ");
		
		int sair = 0;
				
		
		do {
			System.out.println("Welcome to System Consultorio!");
			System.out.println("What you wnat to do?\n");
			System.out.println("1-Cadastrar; \n2-Print result; \n3-out;");
			System.out.println("Digite sua opção: ");
			int menu = Ler.nextInt();	
		

			if (menu == 1) {
				
				
				System.out.println("What you deseja cadastrar?\n1-Paciente;\n2-Medico; \n3-Funcionario; \n4-Convenio; \n5-Especialidade medica;\n6-menu principal"
						+ " ");
				System.out.println("Digite aqui: ");
				String menuCadastro = Ler.next ();
				
				switch (menuCadastro){				
				
				case "1":
					System.out.println("Informe CPF: ");
					String cpf = Ler.next();
					System.out.println("Informe RG: ");
					String rg = Ler.next();
					System.out.println("Informe nome: ");
					String nome = Ler.next();
					System.out.println("Informe sexo: ");
					char sexo = Ler.next().charAt(0);
					System.out.println("Informe data de nascimento: ");
					String dt = Ler.next();
					System.out.println("Informe adderss: ");
					String address = Ler.next();
					System.out.println("Informe phone number ");
					String tel = Ler.next();
					
					pessoafisica = new PessoaFisica (cpf,rg,nome,sexo,dt,address,tel);								
					
					break;
					
					case "2":
						System.out.println("Digite o CRM:");
						String CRM = Ler.next();
						
						System.out.println("Digite o UP do CRM:");
						String CRMUF = Ler.next();
						System.out.println("Digite a especialidade:");
						String especialidade = Ler.next();
						medico = new Medicos(CRM, CRMUF,especialidade);
						
						break;	
						
					case "3":
						System.out.println("Registro: ");
						String regis = Ler.next();
						System.out.println("Função: ");
				    	String funcao = Ler.next();
				    	System.out.println("Salario: ");
				    	String salario = Ler.next();
				    	
				    	funcionario = new Funcionario(regis,funcao,salario);
						 break;
						 
					case "4":
						System.out.println("CNPJ: ");
						String cnpj = Ler.next();
						System.out.println("Empresa conveniada: ");
						String empreConve = Ler.next();
						System.out.println("Phone: ");
						String phone = Ler.next();
						System.out.println("Desconto: ");
						String desconto = Ler.next();
						
						convenio = new Convenios(cnpj,empreConve,phone,desconto);
						
						break;
						
				    case "5":
				    	System.out.println("Código: ");
				    	String cod = Ler.next();
				    	System.out.println("Descrição: ");
				    	String desc = Ler.next();
				    	
				    	espeMedic = new EspecialidadeMedica (cod,desc);
					
					break;
				    case "6":
				    	
				    	break;
					
					default:
						System.out.println("Opção invalida!\n");
						
				}			
				     
				
			}	
			else if (menu == 2) {
				System.out.println("what you deseja print?");
				System.out.println("1-Paciênte\n2-Médicos\n3-Especialidade médica\n4-Convencios\n5-Funcionários\n6-Todos os cadastros\n7-Menu principal");
				System.out.println("Digite sua opão:");
				int print = Ler.nextInt();
				
				switch (print) {
				case 1: 
					System.out.println(pessoafisica+"\n");
					break;
				case 2:
					System.out.println(medico+"\n");
					break;
				case 3:
					System.out.println(espeMedic+"\n");
					break;
				case 4:
					System.out.println(convenio+"\n");
				break;
				case 5:
					System.out.println(funcionario+"\n");
					break;
				case 6:
					System.out.println(pessoafisica+"\n");
					System.out.println(medico+"\n");
					System.out.println(espeMedic+"\n");
					System.out.println(convenio+"\n");
					System.out.println(funcionario+"\n");					
					break;
				case 7:
					break;
				default :
				System.out.println("Opção invalida!\n");
				break;				
				
				}
			
			}
			
			else if (menu == 3)
			sair = 3 ;
			
			else 
				System.out.println("Opção invalida!");
			
		} while ( sair != 3);
		
		
		System.out.println("Thanks, goodbye!");
		
		
		
		
	}


}
