public class ChemineeAdapter extends Cheminee implements Peripherique{
    private int intensite;

    public ChemineeAdapter(){
        super();
    }


    @Override
    public void allumer() {
        this.changerIntensite(getLumiere()+10);
    }

    @Override
    public void eteindre() {
        this.changerIntensite(0);
    }


}
