public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Nada pode me ferir", "David Goggins");
        Livro livro2 = new Livro("Metarmofose", "Frank Kafta");


        Biblioteca biblioteca = new Biblioteca("Biblioteca de Coelho Neto-MA");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.exibirLivros();

        Estante estante = new Estante("Estante A");
        estante.adicionarPrateleira(1);
        estante.adicionarPrateleira(2);

        System.out.println();
        estante.exibirPrateleira();

        System.out.println("Livro fora da biblioteca:");
        livro1.exibirInfo();
    }
}