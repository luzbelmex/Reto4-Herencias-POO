package reto;

public class CuentaBase {

    private double montoActual = 0;
    double apertura = 0;

    CuentaBase() {
    }

    public void setMontoActual(double montoActual) {
        this.montoActual += montoActual;
    }

    public double getMontoActual() {
        return montoActual;
    }

    public void depositar(double cantidad) {
        this.montoActual += cantidad;
    }
}
