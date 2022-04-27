import java.util.ArrayList;
import java.util.Iterator;

/**
 * @version v2.0
 */

public class Telecommande {
    private ArrayList<Péripherique> peripheriques;

    public Telecommande(){
        this.peripheriques=new ArrayList<Péripherique>();
    }

    public void ajouterLampe(Lampe lampe){
        peripheriques.add(lampe);
    }



    public void activerLampe(int indiceLampe){
        if (indiceLampe<this.peripheriques.size()){
            peripheriques.get(indiceLampe).allumer();
        }
    }



    public void desactiverLampe(int indiceLampe) {
        if (indiceLampe<this.peripheriques.size()){
            peripheriques.get(indiceLampe).eteindre();
        }

    }



    public void activerTout(){
        Iterator<Péripherique> iterator = peripheriques.iterator();
        while(iterator.hasNext()){
            iterator.next().allumer();
        }
    }

    @Override
    public String toString() {
        String res = "contenue de la telecommande : \n";
        for (int i=0; i<peripheriques.size();i++){
            res+= "    -"+peripheriques.get(i).toString();
        }
        return (res);
    }

    public Péripherique getperipheriques(int indice) {
        return peripheriques.get(indice);
    }

}
