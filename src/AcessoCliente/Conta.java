package AcessoCliente;

public class Conta {
	private static final int agenciaPadrao = 1150;
	private static  int sequencial = 1;
	int agencia;
	int conta;
	double saldo;
	protected Cliente cliente;
	
	
		
	public Conta(Cliente cliente) {
		this.agencia = agenciaPadrao;
		this.conta = sequencial++;
		this.saldo = 0;
		this.cliente = cliente;
	}


	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getConta() {
		return conta;
	}
	
	public void extratoComum() {
		Banco nomeBanco = new Banco();
		nomeBanco.getNome();
		System.out.println(String.format("Nome do Banco: %s", nomeBanco.getNome()));
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Endereco: %s", this.cliente.getEndereco()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.conta));
		System.out.println(String.format("Saldo: %.2f \n", this.saldo));
	}
	
}
