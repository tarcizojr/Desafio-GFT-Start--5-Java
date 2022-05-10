package Banco;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente, Tipo tipo) {
		super(cliente, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato conta CC");
		imprimirPadrao();
		
	}

}
