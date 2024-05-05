// Reto 4 Herencia de clases y paso de parámetris
// Nombre completo: Francisco Samuel Arrieta Tavares
// Fecha de elaboración: 22 de julio del 2021
// Nombre del modulo: Programacion orientada a objetos
// Nombre del asesor: Julio César Mosqueda Gómez
package reto;

public class Reto {

    public static void main(String[] args) {
        // Tarjeta de Credito
        TarjetaCredito tarjetaCredito = new TarjetaCredito();
        tarjetaCredito.tarjetaCredito(1000);
        System.out.println("Saldo de la tarjeta de credito: $" + tarjetaCredito.getMontoActual());
        tarjetaCredito.sumarInteres(tarjetaCredito.getMontoActual());
        System.out.println("Saldo de la tarjeta de credito: $" + tarjetaCredito.getMontoActual());
        
        // Separador para la consola
        System.out.println("");
        
        // Tarjeta de Debito
        TarjetaDebito tarjetaDebito = new TarjetaDebito();
        tarjetaDebito.tarjetaDebito(400.0);
        tarjetaDebito.retirar(100);
        
        // Separador para la consola
        System.out.println("");
        
        // Cuenta de Ahorro
        CuentaAhorro cuentaAhorro = new CuentaAhorro();
        cuentaAhorro.cuentaAhorro(1200.0);
        cuentaAhorro.invertir(cuentaAhorro.getMontoActual());

    }

}
