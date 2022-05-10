package Banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	
	private List<Conta> contas = new ArrayList();
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
		System.out.println("Conta adicionado ao Banco");
	}
	
	public void listaContas() {
		for (Conta conta : contas) {
			System.out.println("Nome: " + conta.cliente.getNome()
			+ " Sexo  " + conta.cliente.getSexo()
			+ " CPF: " + conta.cliente.getCpf()
			+ " Tipo: " + conta.tipo
			+ " Agencia: " + conta.agencia
			+ " Numero: " + conta.numero);
		}
	}
	
	public void verificarConta(String cpf) {
		for (Conta conta : contas) {
			if(conta.cliente.getCpf().equals(cpf)) {
				System.out.println("Nome: " + conta.cliente.getNome()
				+ " Sexo  " + conta.cliente.getSexo()
				+ " CPF: " + conta.cliente.getCpf()
				+ " Tipo: " + conta.tipo
				+ " Agencia: " + conta.agencia
				+ " Numero: " + conta.numero);
			}else {
				System.out.println("CPF não cadastrado");
			}
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
