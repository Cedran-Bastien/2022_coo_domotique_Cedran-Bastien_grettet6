import thermos.Thermostat;

public class ThermostatAdapter implements Peripherique{
    private Thermostat thermostatAcontroler;

    public ThermostatAdapter(Thermostat t){
        this.thermostatAcontroler=t;
    }

    @Override
    public void allumer() {
        this.thermostatAcontroler.monterTemperature();
    }

    @Override
    public void eteindre() {
        this.thermostatAcontroler.baisserTemperature();
    }

    public String toString(){
        return this.thermostatAcontroler.toString();
    }
}
