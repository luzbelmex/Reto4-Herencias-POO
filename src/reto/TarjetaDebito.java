package reto;

public class TarjetaDebito extends CuentaBase {
    
    double retiro = 0.0;
    
    TarjetaDebito (){}

    public void tarjetaDebito(double apertura) {
        this.setMontoActual(apertura);
        System.out.println("Se ha aperturado la cuenta de la tarjeta de debito con $" + apertura);
    }

    public void retirar(double cantidad) {
        this.setMontoActual(-cantidad);
        System.out.println("Se hace un retiro por $" + cantidad + " de la tarjeta de debito");
        System.out.println("Saldo en la tarjeta de debito $" + this.getMontoActual());
    }

}
