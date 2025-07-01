import java.util.ArrayList;

public class Biblioteca {

    private String nome;
    private ArrayList<Livro> livros;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<Livro>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void exibirLivros() {
        System.out.println(this.nome + ":");
        for (Livro livro : this.livros) {
            System.out.println("- " + livro);
        }
    }
}

//https://kirka.io/games/SA~OXVkqW8fL
