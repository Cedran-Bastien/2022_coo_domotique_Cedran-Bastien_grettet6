import java.util.ArrayList;
import java.util.Iterator;

public class Telecommande {
    private ArrayList<Lampe> lampes;

    public Telecommande(){
        this.lampes=null;
    }

    public void ajouterLampe(Lampe lampe){
        lampes.add(lampe);
    }

    public void activerLampe(int indiceLampe) throws NullPointerException{
        Lampe l1 = lampes.get(indiceLampe);
        l1.allumer();
    }

    public void desactiverLampe(int indiceLampe) throws NullPointerException{
        Lampe l1 = lampes.get(indiceLampe);
        l1.eteindre();
    }

    public void activerTout(){
        Iterator<Lampe> iterator = lampes.iterator();
        while(iterator.hasNext()){
            iterator.next().allumer();
        }
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
