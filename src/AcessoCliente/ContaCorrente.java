package AcessoCliente;

public class ContaCorrente extends Conta{
	

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void imprimirCC() {
		System.out.println("===Saldo conta corrente===");
		super.extratoComum();
	}

}
