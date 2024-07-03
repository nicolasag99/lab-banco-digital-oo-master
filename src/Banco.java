import java.util.List;
import java.util.Scanner;;

public class Banco extends Conta {


	// Declarações dos métodos declarados na Interface IConta.

	public Banco(Cliente cliente) {
		super(cliente);

	}

	public void sacar(){}

	public void depositar(){}

	public void transferir(){}

	public void imprimirExtrato(){}

	//Definindo Getters e Setters

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	//Desenvolvendo o método operações 

	public void operacoes() {

		System.out.println("""
                
			Operações
							
			1- Sacar
			2- Depositar valor
			3- Consultar sado
			4- Sair
							
			Digite a operação desejada
			"""); 

			Scanner scanner = new Scanner(System.in);
			System.out.println("Qual operação você deseja realizar");
			int operacao = scanner.nextInt();

			if (operacao == 1) {

				System.out.println("Qual valor você deseja sacar?");
				double valorDeposito = scanner.nextDouble(); 
				
				if (valorDeposito > saldo) {

					System.out.println("O saldo é insuficiente para realizar essa operação");
					System.out.println("O seu saldo atual é R$" + saldo);

				} else {
					saldo -= valorDeposito;
					System.out.println("O seu saldo atual é R$" + saldo);
			}	
				
		
	
			} else if (operacao == 2) {
				System.out.println("Qual valor você deseja depositar?");
				double valorSaque = scanner.nextDouble();
				saldo += valorSaque;
				System.out.println("O seu saldo atual é R$" + saldo);
			} else if (operacao == 3) {
				System.out.println("O seu saldo atual é R$" + saldo);
		
			}

			scanner.close();
					
	}		

			


	}


