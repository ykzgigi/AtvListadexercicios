package ListaDeExercicios_23_10;

public class PrincipalBrinquedo {

	public static void main(String[] args) {
		
		System.out.println("~~~~~~~~~~~~CARRO~~~~~~~~~~~~~~");
		System.out.println(" ");
		
		Carro carro = new Carro ("Fusca", 50, "Toy's", "Preto");
		System.out.println("Nome: " + carro.getNome());
		 System.out.println(" ");
		System.out.println("Velocidade: " + carro.getVelocidade());
		 System.out.println(" ");
		System.out.println("Tipo: " + carro.getTipo());
		 System.out.println(" ");
		System.out.println("Cor: " + carro.getCor());
		 System.out.println(" ");
	    carro.mover();
	    
	    System.out.println(" ");
	    System.out.println("~~~~~~~~~~~~MOTO~~~~~~~~~~~~~~");
	    System.out.println(" ");
	    
	    
	    Moto moto = new Moto ("Honda", 50, "Toy's", "Vermelho");
		System.out.println("Nome: " + moto.getNome());
		 System.out.println(" ");
		System.out.println("Velocidade: " + moto.getVelocidade());
		 System.out.println(" ");
		System.out.println("Tipo: " + moto.getTipo());
		 System.out.println(" ");
		System.out.println("Cor: " + moto.getCor());
		 System.out.println(" ");
	    moto.mover();
	    
	    
	    System.out.println(" ");
	    System.out.println("~~~~~~~~~~~~NAVIO~~~~~~~~~~~~~~");
	    System.out.println(" ");
	    
	    Navio navio = new Navio ("Titanic", 50, "Toy's", "Cinza");
		System.out.println("Nome: " + navio.getNome());
		 System.out.println(" ");
		System.out.println("Velocidade: " + navio.getVelocidade());
		 System.out.println(" ");
		System.out.println("Tipo: " + navio.getTipo());
		 System.out.println(" ");
		System.out.println("Cor: " + navio.getCor());
		System.out.println(" ");
	    navio.mover();
		

	}

}
