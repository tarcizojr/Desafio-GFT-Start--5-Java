package Banco;

import java.util.Scanner;

public class Mains {	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Banco banco = new Banco();
		banco.setNome("C1");
		
		while(true) {
			System.out.println("=== Menu ===");
			System.out.println("1 - Criar Conta");
			System.out.println("2 - Listar Conta");
			System.out.println("3 - Verificar Conta");


			String op = leitor.nextLine();
			
			switch (op) {
			case "1": {
				Cliente cliente = new Cliente();
				System.out.println("Nome do Cliente");
				cliente.setNome(leitor.nextLine());
				System.out.println("CPF do Cliente");
				cliente.setCpf(leitor.nextLine());
				while(true) {
					System.out.println("Sexo do Cliente M-Msculino F-Feminino");
					if(leitor.nextLine().toUpperCase().equals("M")) {
						cliente.setSexo(Sexo.MASCULINO);
						break;
					}else if(leitor.nextLine().toUpperCase().equals("M")) {
						cliente.setSexo(Sexo.FEMININO);
						break;
					}else {
						System.out.println("Opção Invalida");
					}
				}

				while (true) {
					System.out.println("Qual o Tipo da Conta 1-Corrente 2-Poupança");
					if(leitor.nextLine().equals("1")) {									
						banco.adicionarConta(new ContaCorrente(cliente, Tipo.CORRENTE));

						break;
					}else if(leitor.nextLine().equals("2")) {
						banco.adicionarConta(new ContaPoupanca(cliente, Tipo.POUPANCA));

						break;
						
					}else {
						System.out.println("Opção Invalida");
					}
					
				}
				break;
			}
			case "2":{
				banco.listaContas();
			}
			case "3":{
				System.out.println("Qual o CPF que deseja verificar: ");
				banco.verificarConta(leitor.nextLine());
			}
			default:
				System.out.println("Operaçao Invalida");
			}

		}
	
	}
	
}
