import java.util.ArrayList; // Importa o ArrayList

// Definição da classe Biblioteca
public class Biblioteca {

    // Aqui fica a lista de livros (prateleira)
    private ArrayList<Livro> livros;

    // Construtor: quando a biblioteca é criada, a lista começa vazia
    public Biblioteca() {
        livros = new ArrayList<Livro>();
    }

    // Método para adicionar um livro na biblioteca
    public void adicionarLivro(Livro livro) {
        livros.add(livro); // coloca o livro na prateleira
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    // Método para listar todos os livros da biblioteca
    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            System.out.println("Livros na biblioteca:");
            for (Livro livro : livros) { // Para cada livro na prateleira
                livro.exibirInfoLivro();  // Mostra os detalhes do livro
                System.out.println(); // Pula uma linha
            }
        }
    }
}
