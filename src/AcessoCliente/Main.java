package AcessoCliente;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Cliente clientes = new Cliente();
		Scanner nome = new Scanner(System.in);
		Scanner endereco = new Scanner(System.in);
		Scanner selecao = new Scanner(System.in);
		Scanner valor = new Scanner(System.in);
		Scanner sN = new Scanner(System.in);
		
		System.out.println("Digite o nome do cliente");
		clientes.setNome(nome.next());
		
		System.out.println("Digite o ender�o");
		clientes.setEndereco(endereco.nextLine());

		ContaCorrente cc = new ContaCorrente(clientes);
		ContaPoupanca poupanca = new ContaPoupanca(clientes);
		
		int ScanName;
		do {
			System.out.println("Selecione uma op��o");
			System.out.println("--------------------------------------");
			System.out.println("1 - Deposito");
			System.out.println("2 - Sacar");
			System.out.println("3 - Trasferir");
			System.out.println("4 - Sair");
			System.out.println("--------------------------------------");
			
			int scan = selecao.nextInt();
			System.out.println("Op��o selecionada: "+ scan);
			
			switch (scan){
			case 1:
				System.out.println("Qual � o valor: ");
				cc.depositar(valor.nextDouble());
				break;
			case 2:
				System.out.println("Qual � o valor: ");
				cc.sacar(valor.nextDouble());
				break;
			case 3:
				System.out.println("Qual � o valor: ");
				cc.transferir(valor.nextDouble(), poupanca);
				break;
			default:
			}
		
		
			System.out.println("Desja fazer mais alguma opera��o? digite 1 para Sim  ou 0 para N�o");
			ScanName = sN.nextInt();
					
			
		}while (ScanName == 1);
		
		cc.imprimirCC();
		poupanca.imprimirPoupanca();
			
		}
		
}
