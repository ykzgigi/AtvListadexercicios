package ListaDeExercicios_23_10;

public class Moto extends Brinquedo {
	
	
	public Moto(String nome, int velocidade, String tipo, String cor) {
		super(nome,velocidade,tipo,cor);
	}
	
	
	@Override
	public void mover() {
		System.out.println("A moto está se locomovendo no Asfalto");
	}

}
