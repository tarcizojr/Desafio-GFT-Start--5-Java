package Banco;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente, Tipo tipo) {
		super(cliente, tipo);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtrato() {
		System.out.println("Extrato conta PP");
		imprimirPadrao();
		
	
}
}
