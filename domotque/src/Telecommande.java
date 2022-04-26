import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Lampe> lampes;

    public Telecommande(){
        this.lampes=null;
    }

    public void ajouterLampe(Lampe lampe){
        lampes.add(lampe);
    }

    public void activerLampe(int indiceLampe){
        throw new Error (" code non ecrit ");
    }

    public void desactiverLampe(int indiceLampe){
        throw new Error (" code non ecrit ");
    }

    public void activerTout(){
        throw new Error (" code non ecrit ");
    }

    @Override
    public String toString() {
        return "Telecommande{" +
                "lampe=" + lampes +
                '}';
    }

    public Lampe getLampes(int indice) {
        return lampes.get(indice);
    }

}
