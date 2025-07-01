import java.util.ArrayList;

public class Estante {

    private String id;
    private ArrayList<Prateleira> prateleiras;

    public Estante(String id) {
        this.id = id;
        this.prateleiras = new ArrayList<Prateleira>();
    }

    public void adicionarPrateleira(int numero){
        prateleiras.add(new Prateleira(numero));
    }

    public void exibirPrateleira(){
        System.out.println(this.id + ":");
        for( Prateleira prateleira : this.prateleiras){
            System.out.println("- " + this.prateleiras);
        }
    }
}
