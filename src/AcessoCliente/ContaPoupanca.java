package AcessoCliente;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}


	public void imprimirPoupanca() {
		System.out.println("===Saldo conta Poupanca===");
		super.extratoComum();
	}

}
