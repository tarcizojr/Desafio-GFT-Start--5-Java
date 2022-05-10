package Banco;

public class Cliente {
	private String nome;
	private String cpf;
	private Sexo sexo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	public void imprimirCliente() {
		System.out.println("Nome" + nome);
		System.out.println("CPF" + cpf);
		System.out.println("Sexo" + sexo.toString());
	}

	
}
