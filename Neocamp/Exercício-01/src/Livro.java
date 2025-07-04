public class Livro {

    // Atributos

    private String titulo;
    private String autor;
    private int anoPublicacao;

    // Construtor

    public Livro (String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Métodos getters (opcional mas recomendado)

    public String getTitulo() {
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnoPublicacao () {
        return anoPublicacao;
    }

    // Método para exibir informações do livro
    public void exibirInfoLivro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }

}
