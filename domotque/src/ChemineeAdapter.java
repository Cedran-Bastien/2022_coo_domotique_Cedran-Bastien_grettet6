public class ChemineeAdapter implements Peripherique{
    private Cheminee chemineeAControler;

    public ChemineeAdapter(Cheminee origine){
        this.chemineeAControler = origine;
    }

    @Override
    public void allumer() {
        int lumiere = this.chemineeAControler.getLumiere()+10;
        this.chemineeAControler.changerIntensite(lumiere);
    }

    @Override
    public void eteindre() {
        this.chemineeAControler.changerIntensite(0);
    }

    public String toString(){
        return this.toString();
    }


}
