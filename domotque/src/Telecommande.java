public class Telecommande {
    private Lampe lampes;

    public Telecommande(){
        throw new Error (" code non ecrit ");
    };

    public void ajouter(Lampe lampe){
        throw new Error (" code non ecrit ");
    }

    public void activerLampe(int indiceL){
        throw new Error (" code non ecrit ");
    }

    public void desservirLampe(int indiceL){
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
}
