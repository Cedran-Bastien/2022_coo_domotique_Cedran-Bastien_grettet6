import java.util.ArrayList;
import java.util.Iterator;

/**
 * @version fin_TP08
 */

public class Telecommande extends ChemineeAdapter{
    private ArrayList<Peripherique> peripheriques;

    public Telecommande(){
        this.peripheriques=new ArrayList<Peripherique>();
    }

    public void ajouterLampe(Peripherique peripherique){
        peripheriques.add(peripherique);
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
        Iterator<Peripherique> iterator = peripheriques.iterator();
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

    public Peripherique getperipheriques(int indice) {
        return peripheriques.get(indice);
    }

}
