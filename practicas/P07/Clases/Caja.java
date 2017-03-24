public class Caja {

	private float ingresaDinero;
    private float retiraDinero;
    private float dineroTotal;

    public float getIngresosDelDia() {
        return ingresaDinero;
    }

    public void setIngresaDinero(float ingresaDinero) {
        this.ingresaDinero+=ingresaDinero;
    }

    public float getRetirosDelDia() {
        return retiraDinero;
    }

    public void setRetiraDinero(float retiraDinero) {
        if(retiraDinero<this.ingresaDinero)
            this.retiraDinero += retiraDinero;
        else
            System.out.println("El importe del retiro es mayor a la cantidad en caja");
    }

     public float getDineroTotalCaja(){

        this.dineroTotal=ingresaDinero-retiraDinero;
        return this.dineroTotal;
     }

}