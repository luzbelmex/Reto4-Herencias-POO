package reto;

public class CuentaAhorro extends CuentaBase {
    
    double rendimientos = 0;
    
    CuentaAhorro (){}

    public void cuentaAhorro(double apertura) {
        this.setMontoActual(apertura);
        System.out.println("Se ha aperturado la cuenta de ahorro con $" + apertura);
    }

    public void invertir(double cantidad) {
        rendimientos = cantidad * 0.1;
        this.setMontoActual(rendimientos);
        System.out.println("Los ahorros generan $" + rendimientos + " de rendimientos");
        System.out.println("El saldo actualizado es de $" + this.getMontoActual());
    }

}
