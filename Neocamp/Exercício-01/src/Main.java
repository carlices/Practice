public class Main {
    public static void main(String[] args) {
        Biblioteca minhaBiblioteca = new Biblioteca(); // Cria a biblioteca

        Livro livro1 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937); // Cria livro 1
        Livro livro2 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605); // Cria livro 2

        minhaBiblioteca.adicionarLivro(livro1); // Adiciona à biblioteca
        minhaBiblioteca.adicionarLivro(livro2); // Adiciona à biblioteca

        minhaBiblioteca.listarLivros(); // Lista todos os livros cadastrados
    }
}
