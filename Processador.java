package ListaDeExercicios_23_10;

public class Processador {

	private String marca;
	private String frequencia;


	public Processador(String marca, String frequencia) {
		this.marca = marca;
		this.frequencia = frequencia;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}
	
	public String getFrequencia() {
		return frequencia;
	}
}



