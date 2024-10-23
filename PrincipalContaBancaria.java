package ListaDeExercicios_23_10;

public class PrincipalContaBancaria {

	public static void main(String[] args) {
		
   ContaBancaria contaBancaria = new ContaBancaria ("00000", 0090588.07);
		
		Cliente cliente = new Cliente ("Alice", contaBancaria);
		
		System.out.println("Estudante: " + cliente.getNome() + "\nConta Bancaria: " + contaBancaria.getConta());
	}


	}

