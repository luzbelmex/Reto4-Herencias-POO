package reto;

public class TarjetaCredito extends CuentaBase {
    
    double interes = 0.0;
    
    TarjetaCredito(){}

    public void tarjetaCredito(double apertura) {
        System.out.println("Se ha aperturado la cuenta de la tarjeta de credito con $" + apertura);
        this.setMontoActual(apertura);
    }

    public double sumarInteres(double cantidad) {
        interes = cantidad * 0.15;
        System.out.println("Intereses que se agregaran a la cuenta de la tarjeta de credito " + interes);
        this.setMontoActual(interes);
        return this.getMontoActual();
    }

}
