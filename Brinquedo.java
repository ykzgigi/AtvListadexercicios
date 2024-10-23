package ListaDeExercicios_23_10;

public class Brinquedo {
	
	private String nome;
	private int velocidade;
	private String tipo;
	private String cor;
	
	
	
	
	public Brinquedo(String nome, int velocidade, String tipo, String cor) {
		this.nome = nome;
		this.velocidade = velocidade;
		this.tipo = tipo;
		this.cor = cor;
	}
	
	
	
	
	
	public void mover() {
		System.out.println("O veículo está se Movendo");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
