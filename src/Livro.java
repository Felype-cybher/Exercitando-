public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void exibirInfo() {
        System.out.println("Livro: " + this.titulo + " por " + this.autor);
    }

    @Override
    public String toString() {
        return "Livro: " + this.titulo + " por " + this.autor;
    }
}