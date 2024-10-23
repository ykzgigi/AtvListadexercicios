package ListaDeExercicios_23_10;

public class PrincipalBiblioteca {

	public static void main(String[] args) {

		Livro livro = new Livro("O fabricante de lágrimas", "Erin Doom");
		Biblioteca biblioteca = new Biblioteca("Canto da leitura", livro);
		System.out.println("A biblioteca chama-se: " + biblioteca.getNome()+ "\nNome do Livro: " + livro.getTitulo()+ "\nAutora: " + livro.getAutor());
	}

}


