package ListaDeExercicios_23_10;

public class Navio extends Brinquedo {
	
	
	public Navio(String nome, int velocidade, String tipo, String cor) {
		super(nome,velocidade,tipo,cor);
	}
	
	
	@Override
	public void mover() {
		System.out.println("O Navio está se locomovendo na Água");
	}

}
