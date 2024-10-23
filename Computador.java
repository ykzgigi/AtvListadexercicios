package ListaDeExercicios_23_10;

public class Computador {
	
	private String modelo;
	private Processador processador; 

	
	public Computador(String modelo, String marca, String frequencia) {
	this.modelo = modelo;
	this.processador = new Processador(marca, frequencia);
	}
	
	
	public String getModelo() {
	return modelo;
	}
	
	
	public void setModelo(String modelo) {
	this.modelo = modelo;
	}
	
	
	public String getProcessador() {
	return processador.getMarca();
	}
	

	public void exibirInfo() {
		

	System.out.println("Computador: " + modelo);
	System.out.println("Processador: " + processador.getMarca()+ "com" + processador.getFrequencia());
	
	}
}



