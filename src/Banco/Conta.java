package Banco;

public abstract class Conta implements IConta {
	private static int AGENCIAPadrao = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected Tipo tipo;
		
	
	public Conta(Cliente cliente, Tipo tipo) {
		agencia = AGENCIAPadrao++;
		numero = SEQUENCIAL++;
		saldo = 0;
		this.tipo = tipo;
		this.cliente = cliente;
	}

	@Override
	public void Sacar(double valor) {
		if(saldo < valor) {
			System.out.println("Saldo Insuficiente");
		}else {
			saldo -= valor;
		}
	}


	@Override
	public void Depositar(double valor) {
		saldo += valor;
		
	}
	
	public void Transferir(double valor, Conta contaD) {
		this.Sacar(valor);
		contaD.Depositar(valor);
	}
	
	public void imprimirPadrao() {
		cliente.imprimirCliente();
		System.out.println("Agencia" + agencia);
		System.out.println("Numero" + numero);
		System.out.println("Saldo" + saldo);
	}

	

}
